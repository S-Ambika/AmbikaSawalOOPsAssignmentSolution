package com.gl.assignmentSolution.sub_class;

import com.gl.assignmentSolution.base_class.SuperDepartment;

/*

Class AdminDepartment is Sub class of SuperDepartment

*/

public class AdminDepartment extends SuperDepartment {
	
	
	public AdminDepartment(){
		System.out.println(super.isTodayAHoliday());
	}

	/*
	 * Method 1 with no parameters and return type String
	 */
	public String departmentName() {

		return "Admin Department";
	}

	/*
	 * Method 2 with no parameters and return type String
	 */
	public String getTodaysWork() {

		return "Complete your documents Submission";
	}

	/*
	 * Method 3 with no parameters and return type String
	 */
	public String getWorkDeadline() {

		return "Complete by EOD";
	}

}
