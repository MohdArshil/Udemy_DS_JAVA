package domain;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO {
	
	Employee emp1 = new Employee("way", null, 5000, false);
	Employee emp2 = new Employee("jj", null, 4500, false);
	Employee emp3 = new Employee("tr", null, 7000, false);
	Employee emp4 = new Employee("kat", null, 6000, false);
	Employee emp5 = new Employee("rae", null, 8000, false);

	List<Employee> employees;

	public List<Employee> generateEmployees(){
		
		employees = new ArrayList<Employee>();
		
		employees.add(emp1);
		employees.add(emp2);
		employees.add(emp3);
		employees.add(emp4);
		employees.add(emp5);
		
		return employees;
		
	}
	
	public void addEmployee(Employee emp){
		employees.add(emp);
	}
	
}
