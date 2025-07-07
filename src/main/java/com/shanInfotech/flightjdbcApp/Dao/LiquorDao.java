package com.shanInfotech.flightjdbcApp.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import com.shanInfotech.flightjdbcApp.DBConnect;
import com.shanInfotech.flightjdbcApp.interfaces.ILiquor;

public class LiquorDao implements ILiquor {
	private Connection con=null;
	private Statement st=null;
	private PreparedStatement ps=null;
	private ResultSet rs=null;
	Scanner sc=new Scanner(System.in);
	@Override
	public void addLiquorDetails() throws Exception {
		con=DBConnect.Connect();
		String insertLiq="insert into Liquor values(?,?,?,?,?,?)";
		ps=con.prepareStatement(insertLiq);
		System.out.println("Insert liquor Daata");
		ps.setInt(1, sc.nextInt());
		sc.nextLine();
		ps.setString(2, sc.nextLine());
		ps.setString(3,sc.nextLine());
		ps.setString(4,sc.nextLine());
		ps.setInt(5,sc.nextInt());
		ps.setDouble(6,Math.random());
		ps.execute();
		System.out.println("Data Inserted Successfullyyyy!!!! cheeerrrrssss");
		
	}

	@Override
	public void getDetails() {
		// TODO Auto-generated method stub
		
	}

}
