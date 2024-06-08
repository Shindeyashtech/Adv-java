package ConnectionPull;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Pulls {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

	Connection connection  = null;
	PreparedStatement Prestate = null;
	ResultSet rset = null;
	
	try {
		connection = ConnectionManager.getConnection();
		if (connection != null ) {
			String query ="select * from teach";
			Prestate = connection.prepareStatement(query);
			rset = Prestate.executeQuery();
			while (rset.next()) {
				String name = rset.getString("t_name");
				int id = rset.getInt("t_id");
				int age = rset.getInt("t_age");
				System.out.println("Name :"+ name + "ID :" + id + "Age :" + age );
	
			}
		}
	}
	catch(SQLException e){}

	/*finally {
		rset.close();
		Prestate.close();
		connection.close();
		
	}*/
}}
