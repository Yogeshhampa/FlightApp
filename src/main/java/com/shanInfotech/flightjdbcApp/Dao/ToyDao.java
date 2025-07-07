package com.shanInfotech.flightjdbcApp.Dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.shanInfotech.flightjdbcApp.DBConnect;
import com.shanInfotech.flightjdbcApp.Example.Toy;
import com.shanInfotech.flightjdbcApp.interfaces.IToy;

public class ToyDao implements IToy{
		private Connection con=null;
		private Statement st=null;
		private ResultSet sr=null;


	@Override
	public void addToy(Toy t) throws Exception {
		// TODO Auto-generated method stub
		con=DBConnect.Connect();
		st=con.createStatement();
		st.addBatch("insert into toy values(101,'spiderman','USA',7970.00)");
		st.addBatch("insert into toy values(102,'laugh','UE',3545.00)");
		st.addBatch("insert into toy values(103,'hitMan','SA',97860.00)");
		st.addBatch("insert into toy values(104,'superMan','AUSTRAI',12343.00)");
		//st.addBatch("insert into toy values(110,'Hulk','WS',8888.00)");
		//st.addBatch("insert into toy values(108,'IronMan','EWEST',546.00)");
		st.executeBatch();
		System.out.println("data inserted");
	}

	@Override
	public void updateToy() throws SQLException, Exception{
		// TODO Auto-generated method stub
		con=DBConnect.Connect();
		st=con.createStatement();
		String queryRs="select toyId,toyName,(toyPrice)-(toyPrice*.15)) as newToyPrice from toy";
		sr=st.executeQuery(queryRs);
		while(sr.next()) {
			System.out.println(sr.getInt(1)+": "+sr.getString(2)+": "+sr.getDouble(4));
			System.out.printf("\n %d,%s,%.1f",sr.getInt(1)+": "+sr.getString(2)+": "+sr.getDouble(4));
			
		}
	}

	@Override
	public void getToy() throws Exception {
		// TODO Auto-generated method stub
		
	}

}
