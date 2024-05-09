package com.shimbhu;

import java.util.function.Function;

public class AppraisalService {

	public void applyAppraisal(Employee emp, Function<SalaryData,Integer> appraisalStrategy)
	{
		appraisalHelper(emp,appraisalStrategy);
	}

	private SalaryData appraisalHelper(Employee emp, Function<SalaryData, Integer> appraisalStrategy) {
	   
		if(emp.subs.isEmpty())
		{
			return new SalaryData(emp.getSalary(),1,emp.getSalary(),emp.getSalary(),emp.getSalary());
		}
		
		Integer totalSum = 0;
		Integer totalCount = 0;
		Integer min = Integer.MAX_VALUE;
		Integer max = Integer.MIN_VALUE;
		Integer average = 0;
		
		for(Employee employee : emp.subs)
		{
			SalaryData data = appraisalHelper(employee, appraisalStrategy);
			
			totalSum += data.getTotalSum();
			totalCount += data.getTotalCount();
			min = Math.min(min, data.getMin());
			max = Math.max(max, data.getMax());
			average = totalSum/totalCount;
		}
		
		SalaryData updatedData = new SalaryData(totalSum,totalCount,min,max,average);
		
		System.out.println("updated data : "+updatedData);
		
		Integer newSalary = appraisalStrategy.apply(updatedData);
		
		System.out.println("new salary : "+newSalary);
		System.out.println("emp old salary : "+emp.getSalary());
		
		if( newSalary > emp.getSalary())
		{
			emp.setSalary(newSalary);
		}
		
		return new SalaryData(newSalary+totalSum,totalCount+1,Math.min(min,newSalary),Math.max(max,newSalary),(newSalary+totalSum)/totalCount+1);
		
	}
	
	
}
