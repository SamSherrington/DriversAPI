package com.driver3.driver3;

import java.util.List;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import javax.persistence.EntityManager;

import javax.persistence.PersistenceContext;



@Service
public class DriverServiceImpl implements DriverService{

	@PersistenceContext 
	private EntityManager entityManager;
	
	 @Autowired
	 private DriverRepository driverRepository;
	 
	 public void setDriverRepository(DriverRepository driverRepository) {
	  this.driverRepository = driverRepository;
	 }
	  
	 public List<Drivers> retrieveDrivers() {
	  List<Drivers> drivers = driverRepository.findAll();
	  return drivers;
	 }
	  
	 public Drivers getDrivers(Long driverId) {
	  Optional<Drivers> optDri = driverRepository.findById(driverId);
	  return optDri.get();
	 }
	  
	 public void saveDrivers(Drivers drivers){
	  driverRepository.save(drivers);
	 }
	  
	 public void deleteDrivers(Long driverId){
	  driverRepository.deleteById(driverId);
	 }
	  
	 public void updateDrivers(Drivers drivers) {
	  driverRepository.save(drivers);
	 }
	 
	 public List<Drivers> findDriversAfterDate(Date date) {
		 

		 SimpleDateFormat sm = new SimpleDateFormat("yyyy-MM-dd");
		 String newDate = sm.format(date);

		 
		 System.out.println(newDate);
		 
		 String query = "select d from DRIVERS d where d.createdDate > '"+ newDate+"'";
		
		 
		 List<Drivers> drivers = entityManager.createQuery(query).getResultList();
		return drivers;
	 }
	 
		 
	 }
	 
	 
	

