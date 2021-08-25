package com.gl.assignmentSolution.base_class;

import com.gl.assignmentSolution.common.IDepartmentCommonMethods;

/*

Class SuperDepartment is Base class for all other departments 
implementing interface IDepartmentCommonMethods to implement common methods

*/

public class SuperDepartment implements IDepartmentCommonMethods {

	/*
	 * Implementation of departmentName Method of interface
	 */
	@Override
	public String departmentName() {
		// TODO Auto-generated method stub
		return "Welcome to Super Department";
	}

	/*
	 * Implementation of getTodaysWork Method of interface
	 */
	@Override
	public String getTodaysWork() {
		// TODO Auto-generated method stub
		return "No Work as of now";

	}

	/*
	 * Implementation of getWorkDeadline Method of interface
	 */
	@Override
	public String getWorkDeadline() {
		// TODO Auto-generated method stub
		return "Nil";

	}

	/*
	 * Own method of class with String return type
	 */
	public String isTodayAHoliday() {

		return "Today is not a holiday";
	}

}
