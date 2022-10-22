package jdbc_Demo;


	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.sql.Statement;
	public class jdbcConector {
		   static final String DB_URL = "jdbc:mysql://localhost/bankaccountDB";
		   static final String USER = "root";
		   static final String PASS = "Gueywelu8*";
//		   static final String SELECT_DATA="select book_name, student_id from book";
		//public static void main(String[] args) {
			
		
		public static void selectData() {
		      try {
	    		 
			         Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
			         Statement stmt = conn.createStatement();
			         ResultSet rs = stmt.executeQuery("select fname , id  from customer_info");
			         // Extract data from result set
			         while (rs.next()) {
			            // Retrieve by column name
			            System.out.print("fname: " + rs.getString("fname"));
			            System.out.print(",Id : " + rs.getInt("Id"));
			            System.out.println("\n");
			       
			         }
			      } catch (SQLException e) {
			         e.printStackTrace();
			      }
		}
	
	
	}

	
