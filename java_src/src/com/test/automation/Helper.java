package com.test.automation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Helper {
	Connection c;
	public Connection controller(){
   
		try {
		Class.forName(Property.getPropertyValue("DBDRIVER"));
		} catch (ClassNotFoundException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
		}
		try {
		
		c = DriverManager.getConnection(Property.getPropertyValue("DBURL"),Property.getPropertyValue("DBUN"),Property.getPropertyValue("DBPWD"));
		
		
		}
		catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
		return c;
		}
}
