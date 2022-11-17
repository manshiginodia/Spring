package com.nri.dao;

import java.util.List;

import com.nri.entities.Employee;

public interface EmployeeDao {

	public int recInsert(Employee empobj);
	public int recUpdate(Employee empobj);
	public int recDelete(int empid);
	public Employee getEmployee(int empid);
	public List<Employee> getAllEmployee();
	
}
