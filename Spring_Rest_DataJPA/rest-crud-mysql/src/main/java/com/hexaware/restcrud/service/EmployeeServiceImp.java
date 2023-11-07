package com.hexaware.restcrud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.restcrud.entities.Employee;
import com.hexaware.restcrud.repository.EmployeeRepository;

@Service
public class EmployeeServiceImp implements IEmployeeService {
	
	
	@Autowired
	EmployeeRepository repo;
	

	@Override
	public Employee insertEmployee(Employee employee) {
		
		return repo.save(employee);
	}

	@Override
	public List<Employee> getAllEmployees() {

		
		return repo.findAll();
	}

	@Override
	public Employee updateEmployee(Employee employee) {
	
		return repo.save(employee);
	}

	@Override
	public Employee getEmloyeeById(Long eid) {
	
		return repo.findById(eid).orElse(null);
	}

	@Override
	public void deleteEmployeeById(Long eid) {
		 
		    repo.deleteById(eid);
		
	}

	@Override
	public Employee getEmployeeByEname(String ename) {
	
		return repo.findByEname(ename);
	}

}
