package com.desire.dao;
import java.sql.ResultSet;    
import java.sql.SQLException;    
import java.util.List;    
import org.springframework.jdbc.core.BeanPropertyRowMapper;    
import org.springframework.jdbc.core.JdbcTemplate;    
import org.springframework.jdbc.core.RowMapper;
import com.desire.Employee;

public class EmployeeDAO {
	JdbcTemplate template;
	
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	public int save(Employee emp) {
		
		String sql = "insert into employee(name, salary) values('"+emp.getName()+"',"+emp.getSalary()+")";
		return template.update(sql);
		
	}
	public int update(Employee emp) {
		String sql = "update employee set name='"+emp.getName()+"', salary="+emp.getSalary()+"";
		return template.update(sql);
	}
	public int delete(int id) {
		String sql = "delete from employee where id ="+id+"";
		return template.update(sql);
	}
	public Employee getEmpById(int id) {
		String sql = "select * from employee where id="+id+"";
		return template.queryForObject(sql, new Object[] {id},new BeanPropertyRowMapper<Employee>(Employee.class));
	}
	public List<Employee> getEmployees(){
		String sql = "select * from employee";
		return template.query(sql, new RowMapper<Employee>() {
			public Employee mapRow(ResultSet rs, int row) throws SQLException{
				Employee emp = new Employee();
				emp.setId(rs.getInt(1));
				emp.setName(rs.getString(2));
				emp.setSalary(rs.getInt(3));
				
				return emp;
				
			}
		});
	}
}