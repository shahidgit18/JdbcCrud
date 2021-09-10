package com.Sept10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class ViewRecrd {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection cn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","root");
			Statement st=cn.createStatement();
			ResultSet rs=st.executeQuery("select * from student");
			ResultSetMetaData rm=rs.getMetaData();
			int n=rm.getColumnCount();
			for(int i=1;i<=n;i++) {
				System.out.print(rm.getColumnName(i)+"\t");
				
			}
			System.out.println();
			while(rs.next()) {
				for(int i=1;i<=n;i++) {
					System.out.print(rs.getString(i)+"\t");
				}
				System.out.println();
			}
		} catch (Exception e) {
			System.err.println();
		}

	}

}
