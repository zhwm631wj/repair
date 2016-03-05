package com.rosy.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;
import org.jdom.output.Format;
import org.jdom.output.XMLOutputter;

/**
 * 
 * ��ȡ�����
 * 
 * @author allen
 * 
 */
public class XMLConfigUtil {
	private static HashMap SP_MT_HANDLE_STRING = new HashMap();
	private static HashMap SP_MO_HANDLE_STRING = new HashMap();
	private List codeList = new LinkedList();
	private List descList = new LinkedList();
	private Map nodeMap = new HashMap();
	private static Log log = LogFactory.getLog(XMLConfigUtil.class);
	private static Document spConfDoc = null;
	private static Element root = null;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//XMLConfigUtil.addManageorg(null);
		// SPXMLConfigUtil.init();
		// TODO Auto-generated method stub
		init((XMLConfigUtil.class).getResource("/basicData.xml").getFile());
		SP_MT_HANDLE_STRING = XMLConfigUtil.getSP_MT_HANDLE_STRING();
		SP_MO_HANDLE_STRING = XMLConfigUtil.getSP_MO_HANDLE_STRING();
		
		// Map map=XMLConfigUtil.getNode("ROUTE_LEVEL");
		// for(Iterator it = map.entrySet().iterator(); it.hasNext(); ){
		// Map.Entry e = (Map.Entry)it.next();
		// System.out.println("key: " + e.getKey());
		// System.out.println("value: " + e.getValue());
		// }
		// List list=XMLConfigUtil.getCodeList();
		// for(int i=0;i<list.size();i++)
		// System.out.println(list.get(i));;

		// List l = new LinkedList();
		// l.add("22");
		// XMLConfigUtil.addManageorg(null);
		
		
		
	}

	public static void init(String fileName) {

		log.info("\t��ʼ��ȡ�������......");
		SAXBuilder sb = new SAXBuilder(false);
		// Element root;
		Element ele;
		// String fileName = "spConfig.xml";
		try {
			spConfDoc = sb.build(fileName);
			root = spConfDoc.getRootElement();
			// List ls = root.getChildren();
			//			
			// for (int i = 0; i < ls.size(); i++) {
			//				
			// ele = (Element) ls.get(i);
			// if(ele.getName().equals("mt")){
			// List mt_list = ele.getChildren();
			// for (int k = 0; k < mt_list.size(); k++){
			// Element mt_element = (Element) mt_list.get(k);
			// String port = mt_element.getAttributeValue("port") ;
			// String handle_class = mt_element.getAttributeValue("class");
			// String isEnable = mt_element.getAttributeValue("enable");
			//						
			//						
			// if(isEnable == null || isEnable.equals("")){
			// isEnable = "false";
			// }
			// Boolean bBol = new Boolean(isEnable);
			//						
			// String runmode = mt_element.getAttributeValue("runmode");
			//						
			// //String[] command_arr =
			// parseCommandStr(mt_element.getAttributeValue("commandstr"));
			//						
			//					
			//						
			// //SP_MT_HANDLE_STRING.put(port,cfgObj);
			// }
			//					
			// }else if(ele.getName().equals("mo")){
			// List mo_list = ele.getChildren();
			// for (int k = 0; k < mo_list.size(); k++){
			// Element mo_element = (Element) mo_list.get(k);
			// String port = mo_element.getAttributeValue("port") ;
			// String handle_class = mo_element.getAttributeValue("class");
			// String isEnable = mo_element.getAttributeValue("enable");
			// if(isEnable == null || isEnable.equals("")){
			// isEnable = "false";
			// }
			// Boolean bBol = new Boolean(isEnable);
			//						
			// String runmode = mo_element.getAttributeValue("runmode");
			// String[] command_arr =
			// parseCommandStr(mo_element.getAttributeValue("commandstr"));
			//						
			//						
			//						
			// SP_MO_HANDLE_STRING.put(port,handle_class);
			// }
			// }
			// }
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private static String getDescByCode(String Code, String node) {
		List ls = root.getChildren();
		Element ele;
		List list = null;
		for (int i = 0; i < ls.size(); i++) {
			ele = (Element) ls.get(i);
			if (ele.getName().equals("node")) {
				list = ele.getChildren();
				break;
			}
		}
		if (list != null)
			for (int k = 0; k < list.size(); k++) {
				Element element = (Element) list.get(k);
				String port = element.getAttributeValue("port");
				String handle_class = element.getAttributeValue("class");
			}
		return "";
	}

	public static XMLConfigUtil getManageorg() {
		XMLConfigUtil configUtil = new XMLConfigUtil();
		Element ele = (Element) root.getChildren().get(0);
		List list = ele.getChildren();
		if (list != null) {
			configUtil.nodeMap = new HashMap();
			configUtil.codeList.clear();
			configUtil.descList.clear();
			for (int k = 0; k < list.size(); k++) {
				//System.out.println("llllllllll" + k);
				Element element = (Element) list.get(k);
				String code = element.getAttributeValue("code");
				configUtil.codeList.add(code);
				String desc = element.getAttributeValue("desc");
				configUtil.descList.add(desc);
				configUtil.nodeMap.put(code, desc);
			}
		}
		return configUtil;
	}

	/**
	 * ��ӹ���λ��manageorg.xml
	 * @param list
	 * @throws IOException
	 * @throws JDOMException
	 * @throws FileNotFoundException
	 */
	public static void addManageorg(List list,String xmlPath) {
		SAXBuilder sb = new SAXBuilder();// ��b������
		Document doc;
		try {
			doc = sb.build(xmlPath);// ����ָ���ļ�
			
			Element root = (Element) doc.getRootElement().getChildren().get(0);
			List mcode = root.getChildren();
			String desc = null;
			if (mcode.size() > 0) {
				Element e = (Element) mcode.get(mcode.size() - 1);
				desc = e.getAttribute("desc").getValue();
			}
			String desci = "001";
			int index = 1;
			if (desc != null) {
				//System.out.println(desc.length());
				index = Integer.parseInt(desc.substring(8, 11));
				index++;
			}
			if (index < 100 && index > 9) {
				desci = "0" + index;
			} else if (index < 10) {
				desci = "00" + index;
			} else {
				desci = index + "";
			}
			desc = "35415184" + desci;

			for (int i = 0; i < list.size(); i++) {
				Element m = new Element("manageorg_handle");
				m.setAttribute("code", list.get(i).toString());
				m.setAttribute("desc", desc);
				index++;
				if (index < 100 && index > 9) {
					desci = "0" + index;
				} else if (index < 10) {
					desci = "00" + index;
				} else {
					desci = index + "";
				}
				desc = "35415184" + desci;

				root.addContent(m);
			}
			Format format=Format.getPrettyFormat();
			format.setEncoding("UTF-8"); //����XML�ļ����ַ�Ϊgb2312
	        format.setIndent("  ");//����XML�ļ����Ϊ2��ո�

			XMLOutputter XMLOut = new XMLOutputter(format);
			// ���manageorg.xml�ļ���
			
			File f = new File(xmlPath);
			FileOutputStream fos = new FileOutputStream(f);
			XMLOut.output(doc, fos);
			fos.flush();
			fos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (JDOMException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static XMLConfigUtil getClassNode(String node) {
		XMLConfigUtil configUtil = new XMLConfigUtil();
		List ls = root.getChildren();
		Element ele;
		List list = null;

		for (int i = 0; i < ls.size(); i++) {
			ele = (Element) ls.get(i);
			if (ele.getName().equals(node)) {
				list = ele.getChildren();
				break;
			}
		}

		if (list != null) {
			configUtil.nodeMap = new LinkedHashMap();
			configUtil.codeList.clear();
			configUtil.descList.clear();
			for (int k = 0; k < list.size(); k++) {
				Element element = (Element) list.get(k);
				String code = element.getAttributeValue("code");
				configUtil.codeList.add(code);
				String desc = element.getAttributeValue("desc");
				configUtil.descList.add(desc);
				configUtil.nodeMap.put(code, desc);
			}
		}
		return configUtil;
	}

	// public static Map getClassNode(String node){
	//		
	// List ls = root.getChildren();
	// Element ele;
	// List list = null;
	// Map map=null;
	// for (int i = 0; i < ls.size(); i++)
	// {
	// ele = (Element) ls.get(i);
	// if(ele.getName().equals(node)){
	// list = ele.getChildren();
	// break;
	// }
	// }
	//		
	// if(list!=null)
	// {
	// map=new HashMap();
	// codeList.clear();
	// descList.clear();
	// for (int k = 0; k <list.size(); k++){
	// Element element = (Element) list.get(k);
	// String code = element.getAttributeValue("code") ;
	// codeList.add(code);
	// String desc = element.getAttributeValue("desc");
	// descList.add(desc);
	// map.put(code,desc);
	// }
	// }
	// return map;
	// }

	private static String[] parseCommandStr(String str) {
		StringTokenizer st = new StringTokenizer(str, "|");
		String[] command_arr = new String[st.countTokens()];
		int i = 0;
		while (st.hasMoreElements()) {

			command_arr[i] = (String) st.nextElement();
			i++;
		}
		return command_arr;
	}

	/**
	 * @return Returns the sP_MO_HANDLE_STRING.
	 */
	public static HashMap getSP_MO_HANDLE_STRING() {
		return SP_MO_HANDLE_STRING;
	}

	/**
	 * @return Returns the sP_MT_HANDLE_STRING.
	 */
	public static HashMap getSP_MT_HANDLE_STRING() {
		return SP_MT_HANDLE_STRING;
	}

	public List getCodeList() {
		return codeList;
	}

	public void setCodeList(List codeList) {
		this.codeList = codeList;
	}

	public List getDescList() {
		return descList;
	}

	public void setDescList(List descList) {
		this.descList = descList;
	}

	public Map getNodeMap() {
		return nodeMap;
	}

	public void setNodeMap(Map nodeMap) {
		this.nodeMap = nodeMap;
	}

}
