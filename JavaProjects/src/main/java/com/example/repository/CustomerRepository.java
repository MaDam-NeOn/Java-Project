package com.example.repository;

import java.util.List;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;

import com.example.entity.Customers;

public interface CustomerRepository extends JpaRepository<Customers,String>{

	List<Customers> findAll(Pageable pageable);
	
}
