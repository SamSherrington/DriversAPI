package com.driver3.driver3;


import java.util.List;
import java.util.Date;



public interface DriverService {

	public List<Drivers> retrieveDrivers();

	public Drivers getDrivers(Long driverId);

	public void saveDrivers(Drivers drivers);
		

	public void deleteDrivers(Long driverId);

	public void updateDrivers(Drivers drivers);
	
	public List<Drivers> findDriversAfterDate(Date date);

}
