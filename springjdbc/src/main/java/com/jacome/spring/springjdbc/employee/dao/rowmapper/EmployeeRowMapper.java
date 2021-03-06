package com.jacome.spring.springjdbc.employee.dao.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.jacome.spring.springjdbc.employee.entity.Employee;

public class EmployeeRowMapper implements RowMapper<Employee> {

	@Override
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		int i = 1;
		Employee empl = new Employee();
		empl.setId(rs.getInt(i++));
		empl.setFirstName(rs.getString(i++));
		empl.setLastName(rs.getString(i++));
		return empl;
	}

}
