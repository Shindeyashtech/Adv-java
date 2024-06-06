package jdbcConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JdbcTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url ="jdbc:mysql://localhost:3306/std";
		String username ="root"; 
		String pass ="root";

		try {
			Connection conn = DriverManager.getConnection(url,username,pass);
			//establish connection
			System.out.print("establish connection");
			Statement stmt = conn.createStatement();
			String query = "create table teach (t_id int , t_name varchar(20),t_age int)";
			boolean bar =stmt.execute(query);
			System.out.println("Database Create :" + bar);
		 
			conn.close();
			System.out.println("closed");
			}
			
			catch(Exception e){
				
			}




	}

}
