package com.example.CustomerCrud.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.CustomerCrud.Model.CustomerModel;
import com.example.CustomerCrud.Repository.CustomerRepository;
@Service
public class CustomerServiceImpl implements CustomerService{
	@Autowired
	private CustomerRepository customerrepo;
	@Override
	
	public void customerServiceMethod(CustomerModel uiux)throws Exception {
		
		customerrepo.RepositoryMethod(uiux);							
	}
	
	
	@Override
	public CustomerModel getcustomer(int cusid) throws Exception {
		// TODO Auto-generated method stub
	CustomerModel customer=	customerrepo.getcustomer(cusid);
		
		if(customer==null) {
			throw new Exception("No Customers found");
		}
		return customer;

	}
	
	
	@Override
	public void updatecustomer(int cusid,String cusname,String cusemail,Long cusno) throws Exception {
		// TODO Auto-generated method stub
		customerrepo.updatecustomer(cusid, cusemail, cusname, cusno);
		
	}
	
	@Override
	public void deletecustomer(int cusid) throws Exception {
		// TODO Auto-generated method stub
		customerrepo.deletecustomer(cusid);
		
	}
	
	
	@Override
	public List<CustomerModel> getallcustomer() throws Exception {
		// TODO Auto-generated method stub
		
		return customerrepo.getallcustomer();
		
	}

}
