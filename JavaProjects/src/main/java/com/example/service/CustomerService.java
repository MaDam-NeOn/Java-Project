package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.stereotype.Service;

import com.example.entity.Customers;
import com.example.repository.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
	CustomerRepository customerRepository;
	
	public List<Customers> getCustomers(int pageNo, int pageSize){
		
		Pageable pageable = PageRequest.of(pageNo-1,pageSize);
		
		return customerRepository.findAll(pageable).getContent();
	}
	
	
	
	
	public CustomerService() {
		// TODO Auto-generated constructor stub
	}

}
