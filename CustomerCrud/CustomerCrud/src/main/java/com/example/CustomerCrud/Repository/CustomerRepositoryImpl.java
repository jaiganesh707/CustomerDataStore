package com.example.CustomerCrud.Repository;

import java.sql.Date;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.CustomerCrud.Model.CustomerModel;
@Repository
public class CustomerRepositoryImpl implements CustomerRepository {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Override
	public void RepositoryMethod(CustomerModel modelobj) {
		// TODO Auto-generated method stub		
		String query="insert into custom(cusid,cusemail,cusname,cusno)values(?,?,?,?)";		
		jdbcTemplate.update(query, modelobj.getCusid(),modelobj.getCusemail(),modelobj.getCusname(),modelobj.getCusno());
		
		
	}
	@Override
	public void deletecustomer(int cusid) throws SQLException {
		// TODO Auto-generated method stub
		
		String query="delete from custom where cusid=?";
		jdbcTemplate.update(query, cusid);
		
	}
	@Override
	public void updatecustomer(int cusid,String cusname,String cusemail,Long cusno) throws SQLException {
		// TODO Auto-generated method stub
		String queryy="update custom set cusemail=?, cusname=?, cusno=? where cusid=?";
		jdbcTemplate.update(queryy, cusname,cusemail,cusno, cusid);
		
	}
	@Override
	public CustomerModel getcustomer(int cusid) throws Exception {
		// TODO Auto-generated method stub
		
		String query="select * from custom where cusid=?";
		return jdbcTemplate.queryForObject(query, new Object[] { cusid }, new CustomerMaping());
		
		
	}
	@Override
	public List<CustomerModel> getallcustomer() throws Exception {
		// TODO Auto-generated method stub
		
		String query="select * from custom";	
		return jdbcTemplate.query(query, new CustomerMaping());
		
	}


}
