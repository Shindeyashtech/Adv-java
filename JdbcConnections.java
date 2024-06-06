package jdbcConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JdbcConnections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub

		String url ="jdbc:mysql://localhost:3306";
				String username ="root"; 
				String pass ="root";
				
		 // package import 
		//load package
				try {
				Connection conn = DriverManager.getConnection(url,username,pass);
				//establish connection
				System.out.print("establish connection");
				//write statement
				Statement stmt = conn.createStatement();
				String query = "create database std";
				//execute statement
				boolean bar =stmt.execute(query);
				System.out.println("Database Create :" + bar);
				//close connection
				conn.close();
				System.out.println("closed");
				}
				
				catch(Exception e){
					
				}
				
				
		

	}

}
