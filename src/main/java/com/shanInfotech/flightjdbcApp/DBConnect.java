package com.shanInfotech.flightjdbcApp;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {
	static Connection con=null;//connection interface used for connecting to data
	public static Connection Connect() throws SQLException, ClassNotFoundException{
		Class.forName("com.mysql.cj.jdbc.Driver");//we are using type 4 driver 
		//connection interface used for connecting database
		 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcEx","root","root");
		 return con;
	}

}
