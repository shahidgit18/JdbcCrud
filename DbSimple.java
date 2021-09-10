package com.Sept10;

import java.sql.*;

public class DbSimple {

	public static void main(String[] args) {
		try {
			Class c=Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","root");
					System.out.println("Connection Established Successfully");
		} catch (Exception e) {
			System.err.println(e);
		}

	}

}
