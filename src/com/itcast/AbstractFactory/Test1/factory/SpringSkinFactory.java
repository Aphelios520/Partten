package com.itcast.AbstractFactory.Test1.factory;

import com.itcast.AbstractFactory.Test1.modle.*;

public class SpringSkinFactory implements SkinFactory{
	
	@Override
	public Button createButton() {
		return new SpringButton();
	}
	
	@Override
	public TextField createTextField() {
		return new SpringTextField();
	}
	
	@Override
	public ComboBox createComboBox() {
		return new SpringComboBox();
	}
}
