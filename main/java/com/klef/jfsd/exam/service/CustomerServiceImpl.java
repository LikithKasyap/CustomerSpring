package com.klef.jfsd.exam.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.jfsd.exam.model.Customer;
import com.klef.jfsd.exam.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService {
@Autowired
private CustomerRepository customerRepository;
	
	@Override
	public String updatecustomer(Customer c) {
		Optional<Customer> obj=customerRepository.findById(c.getcId());
		String msg=null;
		
		if(obj.isPresent())
		{

			Customer customer=obj.get();

			
			customer.setName(c.getName());
			customer.setAddress(c.getAddress());
			
			customerRepository.save(customer);
			
			msg="Customer Name and Adress updated successfully";
		}
		else
		{
			msg="Customer ID Not Found";
		}
		return msg;
	}

}
