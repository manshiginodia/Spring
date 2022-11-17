package com.nri.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.nri.entities.Employee;

@Component
public class EmployeeDaoImpl implements EmployeeDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	
	
	public int recInsert(Employee empobj) {
		
		String query ="insert into tblemployee(eid,ename,ecity) values (?,?,?)";
		int status = jdbcTemplate.update(query,empobj.getEmpid(),empobj.getEmpname(),empobj.getEmpcity());    
		return status;
	}

	public int recUpdate(Employee empobj) {
		
		String query ="update tblemployee set ename=?, ecity=? where eid=?";
		int status= jdbcTemplate.update(query,empobj.getEmpname(),empobj.getEmpcity(),empobj.getEmpid());
		return status;
	}

	public int recDelete(int empid) {
		
		String query ="delete from tblemployee where eid=? ";
		int status =  jdbcTemplate.update(query,empid);
		return status;
	}

	public Employee getEmployee(int empid) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
