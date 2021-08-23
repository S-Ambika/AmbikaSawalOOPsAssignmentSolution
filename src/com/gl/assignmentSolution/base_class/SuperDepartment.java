package com.gl.assignmentSolution.base_class;

import com.gl.assignmentSolution.service.IDepartmentServices;

/*

Class SuperDepartment is Base class for all other departments 
implementing interface IDepartmentServices to implement common methods

*/

public class SuperDepartment implements IDepartmentServices {

	/*
	 * Implementation of departmentName Method of interface
	 */
	@Override
	public String departmentName() {
		// TODO Auto-generated method stub
		return "Super Department";
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
