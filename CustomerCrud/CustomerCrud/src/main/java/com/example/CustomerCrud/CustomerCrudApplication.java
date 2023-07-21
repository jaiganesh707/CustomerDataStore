package com.example.CustomerCrud;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

import com.example.CustomerCrud.Model.CustomerModel;
import com.example.CustomerCrud.Service.CustomerService;

@SpringBootApplication
public class CustomerCrudApplication implements CommandLineRunner {
	@Autowired
	private CustomerService customerservice;
	
	@Autowired
	private Environment environment;
	
	public static void main(String[] args) {
		SpringApplication.run(CustomerCrudApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		insertCustomer();
		//getCustomer();
		//updateCustomer();
		//deleteCustomer();
		//getallCustomer();
		
	}
		
	public void insertCustomer()throws Exception{
		try {
			CustomerModel uiuxmod=new CustomerModel();
			uiuxmod.setCusid(003);
			uiuxmod.setCusname("ram");
			uiuxmod.setCusemail("ram@gmail.com");
			uiuxmod.setCusno(1234512345l);
			customerservice.customerServiceMethod(uiuxmod);
			System.out.println("Successfully Inserted");
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("Not Inserted Value");
		}
	}
	
	public void getCustomer()throws Exception{
		try {
			CustomerModel customer=customerservice.getcustomer(002);
			System.out.println("SNo: "+customer.getCusid());
			System.out.println("CustomerName: "+customer.getCusname());
			System.out.println("CustomerMail: "+customer.getCusemail());
			System.out.println("CustomerContact: "+customer.getCusno());
		} 
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("Plese Insert The Value!!!");
		}
	}
		
		public void updateCustomer()throws Exception{
		try {
			customerservice.updatecustomer(001,"jai", "jai@gmail.com",0000000000l);
			System.out.println("update customer values");
		} 
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("NOT updated NOT");
		}
		}
		
		public void deleteCustomer()throws Exception{
		try {
			customerservice.deletecustomer(3);
			System.out.println("successfully deleted");
		} 
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("not deleted");
		}
		}
		
		public void getallCustomer()throws Exception{
		List<CustomerModel> customer=customerservice.getallcustomer();
		for (CustomerModel cus : customer) {
			System.out.println("SNo: "+cus.getCusid());
			System.out.println("CustomerName: "+cus.getCusname());
			System.out.println("CustomerMail: "+cus.getCusemail());
			System.out.println("CustomerContact: "+cus.getCusno());
		}

		}

		}