import java.sql.*;
public class UpdateDemo {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection cn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","root");
			Statement st=cn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
			ResultSet rs=st.executeQuery("select rollno,name,marks from student");
			rs.absolute(2);
			rs.updateInt(2,90);
			rs.updateRow();
			System.out.println("One row updated");
		} catch (Exception e) {
			System.err.println(e);
		}
	}
}
