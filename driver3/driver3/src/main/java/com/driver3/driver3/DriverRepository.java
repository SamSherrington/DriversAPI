package com.driver3.driver3;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;





@Repository
public interface DriverRepository extends JpaRepository<Drivers,Long>{

	
	
}
