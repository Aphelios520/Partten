package com.itcast.AbstractFactory.Test1.factory;

import com.itcast.AbstractFactory.Test1.modle.*;

public class SummerSkinFactory implements SkinFactory {
	@Override
	public Button createButton() {
		return new SummerButton();
	}
	
	@Override
	public TextField createTextField() {
		return new SummerTextField();
	}
	
	@Override
	public ComboBox createComboBox() {
		return new SummerComboBox();
	}
}
