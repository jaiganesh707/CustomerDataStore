package com.example.CustomerCrud.Repository;

import java.sql.SQLException;
import java.util.List;

import com.example.CustomerCrud.Model.CustomerModel;

public interface CustomerRepository {
	
	public void RepositoryMethod(CustomerModel modelobj);
	public CustomerModel getcustomer(int cusid)throws Exception;
	public void updatecustomer(int cusid,String cusname,String cusemail,Long cusno)throws SQLException;
	public void deletecustomer(int cusid)throws SQLException;
	public List<CustomerModel> getallcustomer()throws Exception;

}
