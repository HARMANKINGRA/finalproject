
package harman;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class JDBCHELPERCERTI {

		Connection con;
		PreparedStatement pStmt;
		
		public JDBCHELPERCERTI() {
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
		
		
		
		
		
		
		public int addcertiname(usercerti usercerti) {
			// TODO Auto-generated method stub
                int i = 0;
			
			try {
				//3. Create SQL Statement
				String sql = "insert into CERTIFICATE values(null, ?,?,?)";
				pStmt = con.prepareStatement(sql);
				pStmt.setString(1, usercerti.getcertilocation());
				pStmt.setString(2, usercerti.getcertilocation());
				pStmt.setString(3, usercerti.getcertidiscription());
				
				
				
				//4. Execute SQL Statement
				i = pStmt.executeUpdate();
				if(i>0){
					System.out.println(usercerti.getcertilocation()+" Registered");
				}else{
					System.out.println(usercerti.getcertilocation()+" not Registered");
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
}}



