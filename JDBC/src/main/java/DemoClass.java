// Java Database Connectivity 

/*
 * 1. import ---> java.sql
 * 2. load and register driver --->com.mysql.jdbc.Driver
 * 3. Create connection
 * 4. Create a stt
 * 5. execute a query
 * 6. process the results
 * 7. close conn
 * 
 */

import java.sql.*;
public class DemoClass {

	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		String url = "jdbc:mysql://localhost:3306/stud";
			String uname = "root";
			String pass = "Sw@thi@03";
			String query = "select studname from cse where studid = 2";
		
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection(url,uname,pass);
			System.out.println("Connection Established");
			
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(query);
		
			rs.next();
			String name = rs.getString("studname");
			
			System.out.println(name);
		
			st.close();
			conn.close();
	
	}

}
