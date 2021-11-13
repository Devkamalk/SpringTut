package TestJdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestJdbc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String jdbcUrl = "jdbc:mysql://localhost:3306/hb-01-one-to-one-uni?useSSL=false&serverTimezone=UTC";
		//String jdbcUrl = "jdbc:mysql://localhost:3306/hb_student_tracker?useSSL=false";
		String user = "hbstudent";
		String pass = "hbstudent";
		
		try{
			System.out.println("connecting to database"+jdbcUrl);
			Connection con = DriverManager.getConnection(jdbcUrl,user,pass);
			System.out.println("connected");
			
		}
		
		catch (Exception ex){
			ex.printStackTrace();
		}

	}

}
