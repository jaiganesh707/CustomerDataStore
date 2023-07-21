package com.example.CustomerCrud.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.example.CustomerCrud.Model.CustomerModel;

public class CustomerMaping implements RowMapper<CustomerModel> {

	@Override
	public CustomerModel mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub		
		CustomerModel cusmodel=new CustomerModel();
		cusmodel.setCusid(rs.getInt("cusid"));
		cusmodel.setCusemail(rs.getString("cusemail"));
		cusmodel.setCusname(rs.getString("cusname"));
		cusmodel.setCusno(rs.getLong("cusno"));
		
		return cusmodel;
	}
	
	

}
