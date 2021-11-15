package com.itcast.VisitorPattern.test1;

import com.itcast.VisitorPattern.XMLUtil.XMLUtil;

import java.util.Queue;
import java.util.Stack;

public class Client {
	public static void main(String[] args) {
		EmployeeList list =new EmployeeList();
		Employee fte1,fte2,fte3,pte1,pte2;
		fte1=new FulltimeEmployee("张无忌",3200.00,45);
		fte2=new FulltimeEmployee("杨过",2000.00,40);
		fte3=new FulltimeEmployee("段誉",2400.00,38);
		pte1 =new ParttimeEmployee("洪七公",80.00,20);
		pte2 =new ParttimeEmployee("郭靖",60.00,18);
		list.addEmployee(fte1);
		list.addEmployee(fte2);
		list.addEmployee(fte3);
		list.addEmployee(pte1);
		list.addEmployee(pte2);
		
		Department department = (Department) XMLUtil.getBean(0);
		list.accept(department);
		//正式员工张无忌实际工资为：3700.0元
		//正式员工杨过实际工资为：2000.0元
		//正式员工段誉实际工资为：2240.0元
		//临时工洪七公实际工资为：1600.0元
		//临时工郭靖实际工资为：1080.0元
		//---------------------------------------
		//正式员工张无忌实际工作时间为：45小时
		//正式员工张无忌加班时间为：5小时
		//正式员工杨过实际工作时间为：40小时
		//正式员工段誉实际工作时间为：38小时
		//正式员工段誉请假时间为：2小时
		//临时工洪七公实际工作时间为：20小时
		//临时工郭靖实际工作时间为：18小时
	}
}
