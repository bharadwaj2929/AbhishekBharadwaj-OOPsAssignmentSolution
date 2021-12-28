package com.greatlearning.admindepartment;

import com.greatlearning.superdepartment.superDepartment;

public class adminDepartment extends superDepartment{
	
	public String departmentName(){
		
		String departmentName="Admin Department";
		return departmentName;
		
	}
	
	public String getTodaysWork(){
		
		String todaysWork="Complete Your Documents Submissions";
		return todaysWork;
		
	}
	
	public String getWorkDeadline(){
		
		String workDeadline="Complete By EOD";
		return workDeadline;
		
	}
	
}
