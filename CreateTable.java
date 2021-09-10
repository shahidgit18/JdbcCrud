package com.Sept10;

import java.sql.*;

public class CreateTable {

	public static void main(String[] args) {
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection	con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","root");

			Statement stmt=con.createStatement();
			stmt.execute("create table student(rollno number(3), name varchar2(10), marks number(3))");

			System.out.println("Table Created Successfully");
			}catch(Exception e)
			{
			System.err.println(e);
			}

	}


}
