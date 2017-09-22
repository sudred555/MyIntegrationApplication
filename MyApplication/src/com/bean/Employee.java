package com.bean;

/**
 * @author Sudheer Yallamreddy
 * java-recent.blogspot.com
 */
public class Employee {

	private int employeeId;
	private String employeeName;
	private String companyName;
	
	public Employee(int employeeId,String empName,String companyName)
	{
		this.employeeId = employeeId;
		this.employeeName = empName;
		this.companyName = companyName;
		
		
	}
	
	public Employee()
	{
		
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	

}
