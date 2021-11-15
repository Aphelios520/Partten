package com.itcast.VisitorPattern.test1;


import java.util.ArrayList;

public class EmployeeList {
	private ArrayList<Employee> list = new ArrayList<>();
	public void addEmployee(Employee employee){
		list.add(employee);
	}
	public void accept(Department handler){
		for(Object o: list){
			((Employee)o).accept(handler);
		}
	}
}
