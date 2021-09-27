package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.nt.bo.EmployeeBO;

public class EmployeeDAOImpl implements IEmployeeDAO{

	private static final String INSERT_EMPLOYEE_QUERY="INSERT INTO FS_LAYERD_EMPLOYEE VALUES(FS_EN_SEQ.NEXTVAL,?,?,?,?,?)";
	private DataSource ds;
	
	public  EmployeeDAOImpl(DataSource ds) {
		System.out.println("OracleEmployeeDAOImpl:: 1-param constructor");
		this.ds=ds;
	}

	@Override
	public int insert(EmployeeBO bo) throws Exception {
		Connection con=null;
		PreparedStatement ps=null;
		int result=0;
		try {
			//get Poold JDBC con object from jdbc con pool
			con=ds.getConnection();
			//create PreparedSTatement having SQL query as the pre-compiled SQL query
			ps=con.prepareStatement(INSERT_EMPLOYEE_QUERY);
			//set values to Query params by collecting from BO class obj
			ps.setString(1,bo.getEname());
			ps.setString(2, bo.getEadd());
			ps.setFloat(3, bo.getBasicsal());
			ps.setFloat(4, bo.getGrosssal());
			ps.setFloat(5, bo.getNetsal());
			//execute  the Query
			 result=ps.executeUpdate();
		}//try
		catch(SQLException se) {
			se.printStackTrace();
			throw se; //Exception rethrowing 
		}
		catch(Exception e) {
			e.printStackTrace();
			throw e; //Exception rethrowing
		}
		finally {
			//close jdbc objs
			try {
				if(ps!=null)
					ps.close();
			}
			catch(SQLException se) {
				se.printStackTrace();
			}
			try {
				if(con!=null)
					con.close();
			}
			catch(SQLException se) {
				se.printStackTrace();
			}
		}//finally
		return result;
	}
	
}
