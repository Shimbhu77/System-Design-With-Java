package com.shimbhu;

import java.util.ArrayList;
import java.util.List;

public class Main {
 
	public static void main(String[] args) {
		
		Employee emp = new Employee();
		emp.setId(0);
		emp.setName("Divine Energy");
		emp.setSalary(100);
		
		Employee emp1 = new Employee();
		emp1.setId(1);
		emp1.setName("Shimbhu");
		emp1.setSalary(80);
		
		Employee emp2 = new Employee();
		emp2.setId(2);
		emp2.setName("Payal");
		emp2.setSalary(120);
		
		Employee emp3 = new Employee();
		emp3.setId(3);
		emp3.setName("Vijendra");
		emp3.setSalary(110);
		
		
		Employee emp4 = new Employee();
		emp4.setId(4);
		emp4.setName("Pooja");
		emp4.setSalary(130);
		
		Employee emp5 = new Employee();
		emp5.setId(4);
		emp5.setName("Emma");
		emp5.setSalary(170);
		
		List<Employee> list  = new ArrayList<>();
		List<Employee> list1  = new ArrayList<>();
		List<Employee> list2  = new ArrayList<>();
		
		list1.add(emp2);
		list1.add(emp4);
		
		list2.add(emp4);
		list2.add(emp5);
		
		list.add(emp1);
		list.add(emp3);
		
		emp.setSubs(list);
		
		
		emp1.setSubs(list1);
		emp3.setSubs(list2);
		
		System.out.println("emp : "+emp);
		System.out.println("emp1 : "+emp1);
		System.out.println("emp2 : "+emp2);
		System.out.println("emp3 : "+emp3);
		System.out.println("emp4 : "+emp4);
		System.out.println("emp5 : "+emp5);
		
		
		new Main().applyAppraisals(emp);
		System.out.println("After Appraisal ========================== ");
		
		System.out.println("emp : "+emp);
		System.out.println("emp1 : "+emp1);
		System.out.println("emp2 : "+emp2);
		System.out.println("emp3 : "+emp3);
		System.out.println("emp4 : "+emp4);
		System.out.println("emp5 : "+emp5);
		
	}
	
	public void applyAppraisals(Employee emp)
	{
		System.out.println("Based on the Average ================================ ");
		 new AppraisalService().applyAppraisal(emp, (data) -> {
			 return data.getaverage();
		 });
		 
		 System.out.println("#####################################################");
		 
		 
//		 System.out.println("Based on the Min Salary ================================ ");
//		 
//		 new AppraisalService().applyAppraisal(emp, (data) -> {
//			 return data.getMin();
//		 });
//		 
//		 System.out.println("#####################################################");
//		 
//		 System.out.println("Based on the Max Salary ================================ ");
//		 
//		 new AppraisalService().applyAppraisal(emp, (data) -> {
//			 return data.getMax();
//		 });
//		 
//		 
//		 System.out.println("#####################################################");
//		 
//		 
//		 System.out.println("Based on the sum/count Salary ================================ ");
//		 
//		 new AppraisalService().applyAppraisal(emp, (data) -> {
//			 return data.getTotalSum()/data.getTotalCount();
//		 });
//		 
//		 System.out.println("#####################################################");
	}
}
