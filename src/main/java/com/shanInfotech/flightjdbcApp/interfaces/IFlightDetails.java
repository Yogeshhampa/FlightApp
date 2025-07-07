package com.shanInfotech.flightjdbcApp.interfaces;

import java.sql.SQLException;

import com.shanInfotech.flightjdbcApp.entity.FlightDetails;

public interface IFlightDetails {
	public void addFlight(FlightDetails fd) throws SQLException, ClassNotFoundException;
	public void updateFlight();
	public void getFlight() throws Exception;
	public void deleteFlight();

}
