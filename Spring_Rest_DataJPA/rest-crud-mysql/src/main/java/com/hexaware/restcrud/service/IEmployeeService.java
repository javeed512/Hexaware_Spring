package com.hexaware.restcrud.service;

import java.util.List;

import com.hexaware.restcrud.entities.Employee;

public interface IEmployeeService {
	
	
	public Employee  insertEmployee(Employee employee);
	public Employee  updateEmployee(Employee employee);
	
	
	public  Employee  getEmloyeeById(Long eid);
	
	public void   deleteEmployeeById(Long eid);
	
	
	public Employee  getEmployeeByEname(String ename);
	
	
	public List<Employee>  getAllEmployees();
	
	
	public List<Employee>  getEmployeesBySalaryGT(double salary);
	
	
	public List<Employee>  getEmployeesGTSorted(double salary);
	
	
	public  List<Employee>   getSorted();
	
	
	
	

}
