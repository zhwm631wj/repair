package com.rosy.util;


import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

/**
 * @author Allen
 *
 */

public class XmlUtil {
	
	public static void main(String[] args) throws Exception {
		//System.out.println((XmlUtil.class).getResource("/basicData.xml"));
		init((XmlUtil.class).getResource("/basicData.xml").getFile());
		//System.out.println(XmlUtil.getByAttribute("/spConfig/mt/mt_handle", "type", "name"));
		//List list=XmlUtil.getListByElement("/spConfig/mt/item");
//		
//		for(int i=0;i<list.size();i++)
//			System.out.println(list.get(i));
		printNode("/spConfig/mo");
	}

//	private static Log log= LogFactory.getLog(Config.class);
	private static Document configDocument= null;

	
	/**
	 * ��ʾnode�ڵ�����������
	 * @param node XML��ڵ�
	 */
	public static void printNode(String node){
		System.out.println("*****************");
		System.out.println("Node all message:");
		Iterator nodeIt= getElement(node);
		while(nodeIt.hasNext()){
			Element element= (Element)nodeIt.next();
			System.out.println(element.getName());
			Iterator elementIt= element.elementIterator();
			while(elementIt.hasNext()){
				
				Element ee= (Element)elementIt.next();
				
				System.out.println(ee.getName());
				System.out.println(ee.getTextTrim());
			}
		}
		System.out.println("*****************");
	}
	
	/**
	 * ȡ��node�ڵ�����
	 * @param node XML��ڵ�
	 * @return �ַ�
	 */
	public static String getByElement(String node){
		Iterator elementIt= getElement(node);
		if(elementIt!=null){
			Element element= (Element)elementIt.next();
			return element.getTextTrim();
		}
		else{
			return null;
		}
	}
	
	/**
	 * ȡ��node�ڵ�����
	 * @param node XML��ڵ�
	 * @return ����
	 */
	public static List getListByElement(String node){
		List list= new ArrayList();
		Iterator elementIt= getElement(node);
		if(elementIt!=null){
			Element element= (Element)elementIt.next();
			list.add(element.getTextTrim());
		}
		else{
			return null;
		}
		return list;
	}
	
	/**
	 * ȡ��node�����ԵĽڵ�����
	 * @param node XML��ڵ�
	 * @param attributeName XML��ڵ�������
	 * @param attributeValue XML��ڵ���ֵ
	 * @return �ַ�
	 */
	public static String getByAttribute(String node,String attributeName,String attributeValue){
		Iterator elementIt= getElement(node);
		while(elementIt.hasNext()){
			Element element= (Element)elementIt.next();
			Attribute attribute= (Attribute)element.attribute(attributeName);

			if(attribute!=null && attribute.getValue().equals(attributeValue)){
				return element.getTextTrim();
			}
		}
		return null;
	}

	/**
	 * ȡ��node�����ԵĽڵ�����
	 * @param node XML��ڵ�
	 * @param attributeName XML��ڵ�������
	 * @param attributeValue XML��ڵ���ֵ
	 * @return ����
	 */
	public static List getListByAttribute(String node,String attributeName,String attributeValue){
		List list= new ArrayList();
		Iterator elementIt= getElement(node);
		while(elementIt.hasNext()){
			Element element= (Element)elementIt.next();
			Attribute attribute= (Attribute)element.attribute(attributeName);

			if(attribute!=null && attribute.getValue().equals(attributeValue)){
				list.add(element.getTextTrim());
			}
		}
		return list;
	}
	
	private static Iterator getElement(String node){
		
		 List list= configDocument.selectNodes(node);
		 
		if(configDocument!=null){
			return configDocument.selectNodes(node).iterator();
		}
		else{
//			log.debug("�����ļ�δ��ʼ���.");
			return null;
		}
		
	}
	
	/**
	 * ������Ϣ��ʼ��
	 * @param fileName config.xml�����ļ�·��
	 */
	public static void init(String fileName){
		File configXml= new File(fileName);
//		log.debug("��ʼ����"+fileName);
		if(configXml.exists()){
			SAXReader reader= new SAXReader();
			try {
//				log.debug("��ȡ�����ļ�.");
				configDocument= reader.read(configXml);
			} catch (DocumentException e) {
//				log.debug("�����ļ���ȡʧ��.");
				e.printStackTrace();
			}
		}
		else{
			System.out.println("��ʼ������(�����ļ�������).");
//			log.debug("��ʼ������(�����ļ�������).");
		}
		System.out.println("�����ļ���ʼ�����.");
//		log.debug("�����ļ���ʼ�����.");
	}
}
