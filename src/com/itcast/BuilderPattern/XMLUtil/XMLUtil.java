package com.itcast.BuilderPattern.XMLUtil;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class XMLUtil {
	public static  Object getBean(int index){
		
		try {
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document document = builder.parse(new File("src//com//itcast//BuilderPattern//config.xml"));
			
			NodeList className = document.getElementsByTagName("className");
			Node node = className.item(index).getFirstChild();
			String name = node.getNodeValue();
			
			Class c = Class.forName(name);
			Object o = c.newInstance();
			return o;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
