package com.shanInfotech.flightjdbcApp.Dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.shanInfotech.flightjdbcApp.DBConnect;
import com.shanInfotech.flightjdbcApp.entity.FlightDetails;
import com.shanInfotech.flightjdbcApp.interfaces.IFlightDetails;

public class FlightDetailsDao implements IFlightDetails{
	Scanner sc=new Scanner(System.in);
	private Connection con=null;
	private Statement st=null;
	private ResultSet rs=null;
	@Override
	public void addFlight(FlightDetails fd) throws SQLException, ClassNotFoundException {
		con=DBConnect.Connect();
		st=con.createStatement();
		System.out.println("Flight Details : Id, FlightCompany,TravelDate,Source,Destination");
		fd.setFlightId(sc.nextInt());
		sc.nextLine();
		fd.setFlightCompany(sc.nextLine());
		fd.setTravelDate(sc.nextLine());
		fd.setSource(sc.nextLine());
		fd.setDestination(sc.nextLine());
		String insertFlights="insert into flightdetails values("+fd.getFlightId()+",' "+fd.getFlightCompany()+"','"
				+fd.getTravelDate()+"','"+fd.getSource()+"','"+fd.getDestination()+"')";
		st.executeUpdate(insertFlights);
		System.out.println("data inserted");
		
	}

	@Override
	public void updateFlight() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getFlight() throws Exception {
		// TODO Auto-generated method stub
		String queryResult="select * from flightdetails";
		rs=st.executeQuery(queryResult);
		while(rs.next()) {
			System.out.println("Flight Id:"+rs.getInt(1));
		}
	}

	@Override
	public void deleteFlight() {
		// TODO Auto-generated method stub
		
	}


	

}
