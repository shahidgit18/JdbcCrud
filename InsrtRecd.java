package com.Sept10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsrtRecd {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection cn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","root");
			Statement st=cn.createStatement();
			st.executeUpdate("insert into student values(1,'Shahid',85)");
			System.out.println("Record Inserted");
		} catch (Exception e) {
			System.err.println(e);
		}

	}

}
