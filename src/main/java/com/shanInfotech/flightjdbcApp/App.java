package com.shanInfotech.flightjdbcApp;


import java.sql.SQLException;

import com.shanInfotech.flightjdbcApp.Dao.FlightDetailsDao;
import com.shanInfotech.flightjdbcApp.entity.FlightDetails;


public class App {
    public static void main(String[] args) throws Exception, SQLException{
        
       FlightDetailsDao fd=new FlightDetailsDao();
      fd.addFlight(new FlightDetails());
      fd.getFlight();

    }
}
