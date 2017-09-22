package com.employeeHelper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.bean.Employee;

/**
 * @author Sudheer Yallamreddy
 * java-recent.blogspot.com
 */
@Component
public class EmployeeDAO {

	private static List<Employee> employeeList = new ArrayList<>();
	public EmployeeDAO()
	{
		System.out.println("default employee");
		Employee employee = new Employee(1,"default","default");
		employeeList.add(employee);
		
	}

	public Employee addEmployee(Employee employee) {
		employeeList.add(employee);
		return employee;

	}

	public List<Employee> getEmployees() {
		return employeeList;

	}
	
}
