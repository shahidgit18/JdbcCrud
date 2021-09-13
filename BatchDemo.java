import java.sql.*;
public class BatchDemo {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection cn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","root");
			Statement st=cn.createStatement();
			st.addBatch("insert into student values(3,'Shiva',88)");
			st.addBatch("update student set rollno=2 where name=3");
			st.executeBatch();
			System.out.println("Operation successfull");
		} catch (Exception e) {
			System.err.println(e);
		}
	}
}
