package com.rosy.webapp.taglib;

import java.io.IOException;

import java.text.Collator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;

import com.rosy.model.ApcaOrganization;
import com.rosy.model.LabelValue;
import com.rosy.service.ApcaOrganizationManager;
import com.rosy.util.ManageHelper;

import org.displaytag.tags.el.ExpressionEvaluator;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

/**
 * Tag for creating multiple &lt;select&gt; options for displaying a list of
 * country names.
 * 
 * <p>
 * <b>NOTE</b> - This tag requires a Java2 (JDK 1.2 or later) platform.
 * </p>
 * 
 * @author Jens Fischer, Matt Raible
 * @version $Revision: 1.4.2.1 $ $Date: 2006-06-10 08:00:48 -0600 (Sat, 10 Jun
 *          2006) $
 * 
 * @jsp.tag name="country" bodycontent="empty"
 */
public class UnitsTag extends TagSupport {
	private static final long serialVersionUID = 3905528206810167095L;
	private String name;
	private String prompt;
	private String scope;
	private String selected;

	/**
	 * @param name
	 *            The name to set.
	 * 
	 * @jsp.attribute required="false" rtexprvalue="true"
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @param prompt
	 *            The prompt to set.
	 * @jsp.attribute required="false" rtexprvalue="true"
	 */
	public void setPrompt(String prompt) {
		this.prompt = prompt;
	}

	/**
	 * @param selected
	 *            The selected option.
	 * @jsp.attribute required="false" rtexprvalue="true"
	 */
	public void setDefault(String selected) {
		this.selected = selected;
	}

	/**
	 * Property used to simply stuff the list of countries into a specified
	 * scope.
	 * 
	 * @param scope
	 * 
	 * @jsp.attribute required="false" rtexprvalue="true"
	 */
	public void setToScope(String scope) {
		this.scope = scope;
	}

	/**
	 * Process the start of this tag.
	 * 
	 * @return int status
	 * 
	 * @exception JspException
	 *                if a JSP exception has occurred
	 * 
	 * @see javax.servlet.jsp.tagext.Tag#doStartTag()
	 */
	public int doStartTag() throws JspException {
		ExpressionEvaluator eval = new ExpressionEvaluator(this, pageContext);

		if (selected != null) {
			selected = eval.evalString("default", selected);
		}

		Locale userLocale = pageContext.getRequest().getLocale();
		List units = this.buildUntilList();

		if (scope != null) {
			if (scope.equals("page")) {
				pageContext.setAttribute(name, units);
			} else if (scope.equals("request")) {
				pageContext.getRequest().setAttribute(name, units);
			} else if (scope.equals("session")) {
				pageContext.getSession().setAttribute(name, units);
			} else if (scope.equals("application")) {
				pageContext.getServletContext().setAttribute(name, units);
			} else {
				throw new JspException(
						"Attribute 'scope' must be: page, request, session or application");
			}
		} else {

			StringBuffer sb = new StringBuffer();
			sb.append("<select name=\"" + name + "\" id=\"" + name
					+ "\" class=\"select\">\n");

			if (prompt != null) {
				sb.append("    <option value=\"\" selected=\"selected\">");
				sb.append(eval.evalString("prompt", prompt) + "</option>\n");
			}

			for (Iterator i = units.iterator(); i.hasNext();) {
				LabelValue country = (LabelValue) i.next();
				sb.append("    <option value=\"" + country.getValue() + "\"");

				if ((selected != null) && selected.equals(country.getValue())) {
					sb.append(" selected=\"selected\"");
				}

				sb.append(">" + country.getLabel() + "</option>\n");
			}

			sb.append("</select>");

			try {
				pageContext.getOut().write(sb.toString());
			} catch (IOException io) {
				throw new JspException(io);
			}
		}

		return super.doStartTag();
	}

	/**
	 * Release aquired resources to enable tag reusage.
	 * 
	 * @see javax.servlet.jsp.tagext.Tag#release()
	 */
	public void release() {
		super.release();
	}
	
	 public Object getBean(String name) {
	        ApplicationContext ctx = 
	            WebApplicationContextUtils.getRequiredWebApplicationContext(this.pageContext.getServletContext());
	        return ctx.getBean(name);
	    }
	/**
	 * Build a List of LabelValues for all the available countries. Uses the two
	 * letter uppercase ISO name of the country as the value and the localized
	 * country name as the label.
	 * 
	 * @param locale
	 *            The Locale used to localize the country names.
	 * 
	 * @return List of LabelValues for all available countries.
	 */
	protected List buildUntilList() {
		List untils = new ArrayList();
		 ApcaOrganizationManager mgr = (ApcaOrganizationManager) getBean("apcaOrganizationManager");
		List<ApcaOrganization> firstUnit = mgr.getFirstUnit();

		for (ApcaOrganization apcaOrganization1 : firstUnit) {
			
			String firstId = apcaOrganization1.getId();
			StringBuffer sbName = new StringBuffer();
			sbName.append("┬").append(apcaOrganization1.getOrgName()).append(
					"─");
			LabelValue until1 = new LabelValue(sbName.toString(), firstId);
			untils.add(until1);
			Set <ApcaOrganization>secondUnit = apcaOrganization1.getOrganizations();
			secondUnit.remove(apcaOrganization1);
			for (ApcaOrganization apcaOrganization2 : secondUnit) {
				String seconId = apcaOrganization2.getId();
				StringBuffer sb2Name = new StringBuffer();
				sb2Name.append("└┬").append(apcaOrganization2.getOrgName());
				LabelValue until2 = new LabelValue(sb2Name.toString(), seconId);
				untils.add(until2);
				Set<ApcaOrganization> thirdUnitSet = apcaOrganization2.getOrganizations();
				ArrayList<ApcaOrganization> thirdUnit= new ArrayList<ApcaOrganization>();
				thirdUnit.addAll(thirdUnitSet);
				for (int i = 0; i < thirdUnit.size(); i++) {
					ApcaOrganization apcaOrganization3 = thirdUnit.get(i);
					String thirdId = apcaOrganization3.getId();
					StringBuffer sb3Name = new StringBuffer();
					if (i == 0) {
						sb3Name.append("　┬").append(
								apcaOrganization3.getOrgName());
					} else if (i == (thirdUnit.size() - 1)) {
						sb3Name.append("　└").append(
								apcaOrganization3.getOrgName());
					} else {
						sb3Name.append("　├").append(
								apcaOrganization3.getOrgName());
					}

					LabelValue until3 = new LabelValue(sb3Name.toString(),
							thirdId);
					untils.add(until3);
				}

			}
		}
		return untils;
	}

	/**
	 * Class to compare LabelValues using their labels with locale-sensitive
	 * behaviour.
	 */
	public class LabelValueComparator implements Comparator {
		private Comparator c;

		/**
		 * Creates a new LabelValueComparator object.
		 * 
		 * @param locale
		 *            The Locale used for localized String comparison.
		 */
		public LabelValueComparator(Locale locale) {
			c = Collator.getInstance(locale);
		}

		/**
		 * Compares the localized labels of two LabelValues.
		 * 
		 * @param o1
		 *            The first LabelValue to compare.
		 * @param o2
		 *            The second LabelValue to compare.
		 * 
		 * @return The value returned by comparing the localized labels.
		 */
		public final int compare(Object o1, Object o2) {
			LabelValue lhs = (LabelValue) o1;
			LabelValue rhs = (LabelValue) o2;

			return c.compare(lhs.getLabel(), rhs.getLabel());
		}
	}
}
