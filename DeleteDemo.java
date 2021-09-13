import java.sql.*;
public class DeleteDemo {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection cn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","root");
			Statement st=cn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
			ResultSet rs=st.executeQuery("select rollno,name,marks from student");
			rs.absolute(2);
			rs.deleteRow();
			System.out.println("One record deleted");
		} catch (Exception e) {
			System.err.println(e);
		}
	}
}
