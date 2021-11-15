package com.itcast.AbstractFactory.Test1;

import com.itcast.AbstractFactory.Test1.factory.SpringSkinFactory;
import com.itcast.AbstractFactory.Test1.factory.SummerSkinFactory;
import com.itcast.BuilderPattern.XMLUtil.XMLUtil;

public class AbstractTest {
	public static void main(String[] args) {
		SpringSkinFactory spring = (SpringSkinFactory) XMLUtil.getBean(0);
		spring.createButton().display();
		spring.createTextField().display();
		spring.createComboBox().display();
		SummerSkinFactory summer =(SummerSkinFactory)XMLUtil.getBean(1);
		summer.createButton().display();
		summer.createTextField().display();
		summer.createComboBox().display();
	}
}
