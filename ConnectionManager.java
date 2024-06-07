package ConnectionPull;
import java.sql.Connection;
//import java.sql.DriverManager;
import java.sql.SQLException;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

public class ConnectionManager {

	private static final HikariDataSource datasource  ;
	
	static {
		HikariConfig config = new HikariConfig ();
		config.setJdbcUrl("jdbc:mysql://localhost:3306");
		config.setUsername("root");
		config.setPassword("root");
		config.setMaximumPoolSize(5);
		 datasource = new HikariDataSource();
	}
	public static Connection getConnection () throws SQLException{
		return datasource.getConnection();
	}
	 public static void close() {
		 if (datasource !=  null ) {	 
			 datasource.close();
		 }
	 }

	
}
