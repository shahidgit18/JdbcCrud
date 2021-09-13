import java.sql.*;


public class SelectDemo {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection cn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","root");
			PreparedStatement ps=cn.prepareStatement("select  marks from student where rollno=?");
			ps.setInt(1, Integer.parseInt(args[0]));
			ResultSet rs=ps.executeQuery();
			rs.next();
			System.out.println(rs.getInt(1));
		} catch (Exception e) {
			System.err.println(e);
		}
	}
}
