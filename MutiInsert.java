import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


public class MutiInsert {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection cn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","root");
			PreparedStatement ps=cn.prepareStatement("insert into student values(?,?,?)");
			ps.setInt(1, Integer.parseInt(args[0]));
			ps.setString(2, args[1]);
			ps.setInt(3, Integer.parseInt(args[2]));
			ps.executeUpdate();
			System.out.println("Record inserted");
		} catch (Exception e) {
			System.err.println(e);
		}
	}
}
