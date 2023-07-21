package com.example.CustomerCrud.Service;

import java.util.List;

import com.example.CustomerCrud.Model.CustomerModel;

public interface CustomerService {
	
	public void customerServiceMethod(CustomerModel uiux)throws Exception;
	public CustomerModel getcustomer(int cusid)throws Exception;
	public void deletecustomer(int cusid)throws Exception;
	public void updatecustomer(int cusid,String cusname,String cusemail,Long cusno)throws Exception;
	
	public List<CustomerModel> getallcustomer()throws Exception;


}
