package com.rest.myservices;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.ApiResponse;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

import com.bean.Employee;
import com.employeeHelper.EmployeeDAO;


/**
 * @author Sudheer Yallamreddy
 * java-recent.blogspot.com
 */
@EnableSwagger2
@RestController
@RequestMapping("/employee")
@Api(basePath = "/employee", value = "Employee", description = "Operates with Employees", produces = "application/json")
public class EmployeeRestService {

	@Autowired
	private EmployeeDAO mEmployeeDAO;

	@ApiOperation(value = "", notes = "add employee to the back end", response = Employee.class)
	@ApiResponses(value = {
			@ApiResponse(code = 400, message = "BAD REQUEST"),
			@ApiResponse(code = 500, message = "INTERNAL SERVER ERROR - Failure to reach downstream system or other internal errors"),
			@ApiResponse(code = 200, message = "OK - Valid response - ") })
	@RequestMapping(path = "/addEmployee", method = RequestMethod.POST)
	public Employee addEmployee(@RequestBody Employee employee) {
		return getEmployeeDAO().addEmployee(employee);
	}

	@ApiOperation(value = "", notes = "get all the available employees from back end", response = Employee.class)
	@ApiResponses(value = {
			@ApiResponse(code = 400, message = "BAD REQUEST"),
			@ApiResponse(code = 500, message = "INTERNAL SERVER ERROR - Failure to reach downstream system or other internal errors"),
			@ApiResponse(code = 200, message = "OK - Valid response - ") })
	@RequestMapping(path = "/getEmployees", method = RequestMethod.GET)
	public List<Employee> getEmployees() {
		return getEmployeeDAO().getEmployees();

	}

	public EmployeeDAO getEmployeeDAO() {
		return mEmployeeDAO;
	}

	public void setmEmployeeServcie(EmployeeDAO pEmployeeDAO) {
		this.mEmployeeDAO = pEmployeeDAO;
	}

}
