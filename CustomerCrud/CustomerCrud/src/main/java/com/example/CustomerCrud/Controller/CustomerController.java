package com.example.CustomerCrud.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.example.CustomerCrud.Model.CustomerModel;
import com.example.CustomerCrud.Service.CustomerService;

@Controller
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	public void customerServiceMethod(CustomerModel uiux)throws Exception{		
		 customerService.customerServiceMethod(uiux);
	}
	
	public void deletecustomer(int cusid)throws Exception{
		customerService.deletecustomer(cusid);
	}
	
	public void updatecustomer(int cusid,String cusname,String cusemail,Long cusno)throws Exception{
		customerService.updatecustomer(cusid, cusemail, cusname, cusno);
	}
	
	public CustomerModel getcustomer(int cusid)throws Exception{
		return customerService.getcustomer(cusid);		
	}
	
	public List<CustomerModel> getallcustomer()throws Exception{
		return customerService.getallcustomer();
		
	}

}
