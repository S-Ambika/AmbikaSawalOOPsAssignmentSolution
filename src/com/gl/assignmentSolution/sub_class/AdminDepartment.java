package com.gl.assignmentSolution.sub_class;

import com.gl.assignmentSolution.base_class.SuperDepartment;
import com.gl.assignmentSolution.service.IDepartmentServices;

/*

Class AdminDepartment is Sub class of SuperDepartment
implementing interface IDepartmentServices to implement common methods

*/

public class AdminDepartment extends SuperDepartment implements IDepartmentServices {

	
	/*
	 * constructor to invoke super method i.e referring to Parent's  method
	 */
	public AdminDepartment() {
		System.out.println(super.isTodayAHoliday());
	}

	/*
	 * Implementation of departmentName Method of interface
	 */
	@Override
	public String departmentName() {
		// TODO Auto-generated method stub
		return "Admin Department";
	}

	/*
	 * Implementation of getTodaysWork Method of interface
	 */
	@Override
	public String getTodaysWork() {
		// TODO Auto-generated method stub
		return "Complete your documents Submission";

	}

	/*
	 * Implementation of getWorkDeadline Method of interface
	 */
	@Override
	public String getWorkDeadline() {
		// TODO Auto-generated method stub
		return "Complete by EOD";

	}

}
