package com.shanInfotech.flightjdbcApp;

import java.sql.SQLException;

import com.shanInfotech.flightjdbcApp.Dao.FlightDetailsDao;
import com.shanInfotech.flightjdbcApp.Dao.LiquorDao;
import com.shanInfotech.flightjdbcApp.Dao.ToyDao;
import com.shanInfotech.flightjdbcApp.Example.Toy;
import com.shanInfotech.flightjdbcApp.entity.FlightDetails;


public class App {
    public static void main(String[] args) throws Exception, SQLException{
        
       FlightDetailsDao fd=new FlightDetailsDao();
      fd.addFlight(new FlightDetails());
  fd.getFlight();
//        ToyDao td=new ToyDao();
//        td.addToy(new Toy());
//        td.getToy();
//        td.updateToy();
    	
//    	LiquorDao ld=new LiquorDao();
//    	ld.addLiquorDetails();
//    	ld.getDetails();
    }
}
