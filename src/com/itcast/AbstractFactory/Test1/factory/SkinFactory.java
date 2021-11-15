package com.itcast.AbstractFactory.Test1.factory;

import com.itcast.AbstractFactory.Test1.modle.Button;
import com.itcast.AbstractFactory.Test1.modle.ComboBox;
import com.itcast.AbstractFactory.Test1.modle.TextField;

public interface SkinFactory {
	public Button createButton();
	public TextField createTextField();
	public ComboBox createComboBox();
}
