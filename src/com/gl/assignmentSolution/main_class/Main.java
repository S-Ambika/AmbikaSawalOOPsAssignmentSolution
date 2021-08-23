package com.gl.assignmentSolution.main_class;

import com.gl.assignmentSolution.base_class.SuperDepartment;
import com.gl.assignmentSolution.sub_class.AdminDepartment;
import com.gl.assignmentSolution.sub_class.HrDepartment;
import com.gl.assignmentSolution.sub_class.TechDepartment;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * calling methods to get desired output
		 */
		displayingAdminDepartment();
		displayingHrDepartment();
		displayingTechDepartment();

	}

	private static void displayingAdminDepartment() {

		/*
		 * Upcasting is possible as there is no different method in child class
		 */
		SuperDepartment adminDepartment = new AdminDepartment();

		System.out.println(adminDepartment.departmentName());
		System.out.println(adminDepartment.getTodaysWork());
		System.out.println(adminDepartment.getWorkDeadline() + "\n");

		/*
		 * calling super class method
		 */
		// System.out.println(admindepartment.isTodayAHoliday());

	}

	private static void displayingHrDepartment() {
		/*
		 * Upcasting is not possible as there is one different method (doActivity) in
		 * child class that will not be accessible using Upcasting
		 */
		HrDepartment hrDepartment = new HrDepartment();

		System.out.println(hrDepartment.departmentName());
		System.out.println(hrDepartment.getTodaysWork());
		System.out.println(hrDepartment.getWorkDeadline());
		System.out.println(hrDepartment.doActivity() + "\n");

	}

	private static void displayingTechDepartment() {
		/*
		 * Upcasting is not possible as there is one different method
		 * (getTechStackInformation) in child class that will not be accessible using
		 * Upcasting
		 */
		TechDepartment techDepartment = new TechDepartment();

		System.out.println(techDepartment.departmentName());
		System.out.println(techDepartment.getTodaysWork());
		System.out.println(techDepartment.getWorkDeadline());
		System.out.println(techDepartment.getTechStackInformation() + "\n");

	}

}
