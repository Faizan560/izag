package jdbc;
import java.sql.*;
import javax.sql.*;



public class Databaseconnection {

	public static final String username = "root";
	public static final String password = "azim";
	public static final String url = "jdbc:mysql://localhost:3306/STUDENT";
	public static void getconnection() {
		Connection cn;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			cn = DriverManager.getConnection(url,username,password);
			System.out.println(cn);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}