package com.klef.jfsd.exam.service;

import org.springframework.stereotype.Service;

import com.klef.jfsd.exam.model.Customer;

@Service
public interface CustomerService 
{
	public String updatecustomer(Customer c);
}
