package subjects;

import java.util.ArrayList;
import java.util.List;

import observers.IObserver;
import domain.Employee;
import domain.EmployeeDAO;

public class EmployeeManagementSystem implements ISubject {

	private Employee emp;
	private String msg = null;
	private List<IObserver> observers;
	private List<Employee> employees;
	private EmployeeDAO employeeDAO;

	public EmployeeManagementSystem() {
		observers = new ArrayList<IObserver>();
		employeeDAO = new EmployeeDAO();
		employees = employeeDAO.generateEmployees();
	}

	public void modifyEmployeeName(int id, String newName) {
		boolean notify = false;
		for (Employee emp : employees) {
			if (id == emp.employeeID) {
				emp.setName(newName);
				this.emp = emp;
				this.msg = "Employee Name Changed";
				notify = true;
			}
		}
		if (notify)
			notifyObservers();
	}

	public void hireNewEmployee(Employee emp) {
		this.emp = emp;
		this.msg = "New Hire";
		notifyObservers();
	}

	@Override
	public void registerObserver(IObserver addMe) {
		// the observers added to this list are interested in getting notified.
		observers.add(addMe);
	}

	@Override
	public void removeObserver(IObserver removeMe) {
		int removeIndex = observers.indexOf(removeMe);
		observers.remove(removeIndex);
	}

	public void notifyObservers() {
		for (IObserver department : observers) {
			department.callMe(emp, msg);
		}
	}
}
