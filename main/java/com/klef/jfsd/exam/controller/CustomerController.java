package com.klef.jfsd.exam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.klef.jfsd.exam.model.Customer;
import com.klef.jfsd.exam.service.CustomerService;

@RestController
@RequestMapping("customer")
public class CustomerController {

	
	 @Autowired
	 private CustomerService customerService;
	 
	 
	 
		@PutMapping("update")
		public String updatestudent(@RequestBody Customer c)
		{
			return customerService.updatecustomer(c);
		}
}
