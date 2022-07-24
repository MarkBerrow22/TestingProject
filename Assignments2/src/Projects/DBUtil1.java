package Projects;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil1 {

	
	public static Connection getDBConnection() {
		Connection connection=null;
		return connection;
		try {
			//step1
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			//step2
			 connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/tapmay31", "root", "Mark1234");
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return connection;	
		}
		
	}

