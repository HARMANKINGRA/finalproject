package harman;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;



public class JDBCHelper {

	Connection con;
	PreparedStatement pStmt;
	
	public JDBCHelper() {
		try {
			//1. Load the Driver
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("--Driver Loaded--");
		} catch (Exception e) {
			System.out.println("Some Exception: "+e);
		}
	}
	
	public void openConnection(){
		try {
			
			//2. Create the Connection
			String url = "jdbc:mysql://localhost/harman";
			String user = "root";
			String pass = "";
			
			con = DriverManager.getConnection(url, user, pass);
			System.out.println("--Connection Created--");
		} catch (Exception e) {
			System.out.println("Some Exception: "+e);
		}
	}
	
	public int addcity(User user){
		
		int i = 0;
		
		try {
			//3. Create SQL Statement
			String sql = "insert into cityname values(null, ?, ?)";
			pStmt = con.prepareStatement(sql);
			pStmt.setString(1, user.getcityname());
			pStmt.setString(2, user.getpincode());
			
			
			//4. Execute SQL Statement
			i = pStmt.executeUpdate();
			if(i>0){
				System.out.println(user.getcityname()+" Registered");
			}else{
				System.out.println(user.getcityname()+" not Registered");
			}
			
		} catch (Exception e) {
			System.out.println("Some Exception: "+e);
		}
		
		return i;
	}
	
	
	
	public void closeConnection(){
		try {
			pStmt.close();
			con.close();
		} catch (Exception e) {
			System.out.println("Some Exception: "+e);
		}
	}
	
}
