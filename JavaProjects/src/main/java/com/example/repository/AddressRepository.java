package com.example.repository;
import org.springframework.stereotype.Repository;

import com.example.entity.Adress;

@Repository
public interface AddressRepository extends JpaRepository<Adress,Long> {
	
}
