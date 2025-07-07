package com.shanInfotech.flightjdbcApp.interfaces;

import java.sql.SQLException;

import com.shanInfotech.flightjdbcApp.Example.Toy;

public interface IToy {
	public void addToy(Toy t) throws Exception;
	public void updateToy() throws Exception, SQLException;
	public void getToy()throws Exception;

}
