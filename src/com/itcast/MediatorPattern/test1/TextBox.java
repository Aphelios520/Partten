package com.itcast.MediatorPattern.test1;

public class TextBox extends Component {
	@Override
	public void update() {
		System.out.println("客户端信息增加成功后文本框清空");
	}
	public void setText(){
		System.out.println("文本框提示：小龙女");
	}
}
