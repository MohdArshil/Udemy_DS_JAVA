package domain.dao;

import domain.Employee;

public class EmployeeDAO {

	public EmployeeDAO() {

	}

	public void saveEmployee(Employee employee) {

		System.out.println("saved employee to database");

	}

	public void removeEmployee(Employee employee) {

		System.out.println("removed employee from database");
	}

}