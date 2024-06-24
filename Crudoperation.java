package jdbc;

import java.sql.*;
import javax.sql.*;

public class Crudoperation {
	static Statement st;
	static Connection cn;
	
	
	public Crudoperation() {
		cn = Databaseconnection.getconnection();
		try {
			st = cn.createStatement();
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public static void insertdata(Integer Enroll , String Name , String Stream) {
		
		String query = "insert into students values("+ Enroll+ ",'" + Name + "','"+Stream+"')"; 
		System.out.println(query);
		
		try {
			int r = st.executeUpdate(query);
			System.out.println(r);
			if(r>0) {
				System.out.println("record inserted");
			}
		} catch (SQLIntegrityConstraintViolationException sq) {
			
			System.out.println("can not duplicate enroll number");
			// TODO: handle exception
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}
	public static void deleteData(Integer Enroll) {
		String sq="delete from students where Enroll='" +Enroll+ "'";
		try {
			int k= st.executeUpdate(sq);
			if(k>0) {
				System.out.println("record deleted successfully..");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void getdata() {
		// TODO Auto-generated method stub
		String sq = "select * from Students";
		try {
			ResultSet r = st.executeQuery(sq);
			while(r.next()) {
				System.out.println(r.getString(1)+" "+r.getString(2)+" "+r.getString(3));
			}
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
}
