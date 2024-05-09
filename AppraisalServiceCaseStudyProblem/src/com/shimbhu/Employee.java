package com.shimbhu;

import java.util.ArrayList;
import java.util.List;


public class Employee {
	 private Integer id;
	 private String name;
	 private Integer salary;
	 List<Employee> subs = new ArrayList<>();
	 
	 
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Employee(Integer id, String name, Integer salary, List<Employee> subs) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.subs = subs;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getSalary() {
		return salary;
	}
	public void setSalary(Integer salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", subs=" + subs + "]";
	}

	public List<Employee> getSubs() {
		return subs;
	}
	public void setSubs(List<Employee> subs) {
		this.subs = subs;
	}
	 
	 
}
