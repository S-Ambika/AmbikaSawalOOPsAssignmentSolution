package com.gl.assignmentSolution.main_class;

import com.gl.assignmentSolution.sub_class.AdminDepartment;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		displayingAdminDepartment();

	}

	private static void displayingAdminDepartment() {

		AdminDepartment admindepartment = new AdminDepartment();

		System.out.println(admindepartment.departmentName());
		System.out.println(admindepartment.getTodaysWork());
		System.out.println(admindepartment.getWorkDeadline());
		/*
		 * calling super class method
		 */
		//System.out.println(admindepartment.isTodayAHoliday());

	}
	
	private static void displayingHrDepartment() {

		AdminDepartment admindepartment = new AdminDepartment();

		System.out.println(admindepartment.departmentName());
		System.out.println(admindepartment.getTodaysWork());
		System.out.println(admindepartment.getWorkDeadline());
		/*
		 * calling super class method
		 */
		System.out.println(admindepartment.isTodayAHoliday());

	}

	private static void displayingTechDepartment() {

		AdminDepartment admindepartment = new AdminDepartment();

		System.out.println(admindepartment.departmentName());
		System.out.println(admindepartment.getTodaysWork());
		System.out.println(admindepartment.getWorkDeadline());
		/*
		 * calling super class method
		 */
		System.out.println(admindepartment.isTodayAHoliday());

	}

}
