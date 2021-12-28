package com.greatlearning.drivermain;

import com.greatlearning.admindepartment.adminDepartment;
import com.greatlearning.hrdepartment.hrDepartment;
import com.greatlearning.techdepartment.techDepartment;

public class driverMain{
	
	public static void main(String[] args){
		
		adminDepartment admin=new adminDepartment();
		System.out.println(admin.departmentName());
		System.out.println(admin.getTodaysWork());
		System.out.println(admin.getWorkDeadline());
		System.out.println(admin.isTodayAHoliday());
		System.out.println("==================================================");
		System.out.println();
		
		hrDepartment hr=new hrDepartment();
		System.out.println(hr.departmentName());
		System.out.println(hr.getTodaysWork());
		System.out.println(hr.getWorkDeadline());
		System.out.println(hr.doActivity());
		System.out.println(hr.isTodayAHoliday());
		System.out.println("==================================================");
		System.out.println();
		
		techDepartment tech=new techDepartment();
		System.out.println(tech.departmentName());
		System.out.println(tech.getTodaysWork());
		System.out.println(tech.getWorkDeadline());
		System.out.println(tech.getTechStackInformation());
		System.out.println(tech.isTodayAHoliday());
		System.out.println("==================================================");
		System.out.println();
		
	}
	
}
