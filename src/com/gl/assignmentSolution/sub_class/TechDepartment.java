package com.gl.assignmentSolution.sub_class;

import com.gl.assignmentSolution.base_class.SuperDepartment;
import com.gl.assignmentSolution.service.IDepartmentServices;

/*

Class TechDepartment is Sub class of SuperDepartment
implementing interface IDepartmentServices to implement common methods

*/

public class TechDepartment extends SuperDepartment implements IDepartmentServices {

	
	/*
	 * constructor to invoke super method i.e referring to Parent's  method
	 */
	public TechDepartment() {
		System.out.println(super.isTodayAHoliday());
	}
	
	/*
	 * Implementation of departmentName Method of interface
	 */
	@Override
	public String departmentName() {
		// TODO Auto-generated method stub
		return "Tech Department";
	}

	/*
	 * Implementation of getTodaysWork Method of interface
	 */
	@Override
	public String getTodaysWork() {
		// TODO Auto-generated method stub
		return "Complete coding of module 1";

	}

	/*
	 * Implementation of getWorkDeadline Method of interface
	 */
	@Override
	public String getWorkDeadline() {
		// TODO Auto-generated method stub
		return "Complete by EOD";

	}

	/*
	 * Own method of class with String return type
	 */
	public String getTechStackInformation() {

		return "core Java";

	}
}
