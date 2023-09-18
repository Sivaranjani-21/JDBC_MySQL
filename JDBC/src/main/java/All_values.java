import java.sql.*;
public class All_values {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		String url = "jdbc:mysql://localhost:3306/stud";
		String uname = "root";
		String pass = "Sw@thi@03";
		String query = "select * from cse";
	
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection(url,uname,pass);
		System.out.println("Connection Established");
		
		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery(query);
	
		String userData = "";
		while(rs.next()) // - shift pointer to next
		{
			userData= rs.getInt(1)+" : "+rs.getString(2);
			System.out.println(userData);
		}
	
		st.close();
		conn.close();

	}

}
