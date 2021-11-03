package com.driver3.driver3;

import java.util.List;
import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class DriverController {
	
	@Autowired
	 private DriverService driverService;
	  
	 public void setDriverService(DriverService driverService) {
	  this.driverService = driverService;
	 }
	 
	 @GetMapping("/drivers")
	 public List<Drivers> getDrivers() {
	  List<Drivers> drivers = driverService.retrieveDrivers();
	  return drivers;
	 }
	 
	 @GetMapping("/drivers/byDate")
	 public List<Drivers> findDriversAfterDate(@RequestParam(value="date") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date date) {
		 System.out.println(date);
		 List<Drivers> drivers = driverService.findDriversAfterDate(date);
		  return drivers;
		 
	 }
	 
	  
	 @GetMapping("/drivers/{driverId}")
	 public Drivers getDrivers(@PathVariable(name="driverId")Long driverId) {
	  return driverService.getDrivers(driverId);
	 }
	  
	 @PostMapping("/drivers/create")
	 public void saveDrivers(@RequestBody Drivers drivers){
	  driverService.saveDrivers(drivers);
	  System.out.println("Driver Saved Successfully");
	 }
	  
	 @DeleteMapping("/drivers/delete/{driverId}")
	 public void deleteDrivers(@PathVariable(name="driverId")Long driverId){
	  driverService.deleteDrivers(driverId);
	  System.out.println("Driver Deleted Successfully");
	 }
	  
	 
	  
	

}

