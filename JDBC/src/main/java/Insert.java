import java.sql.*;

public class Insert {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		String url = "jdbc:mysql://localhost:3306/stud";
		String uname = "root";
		String pass = "Sw@thi@03";
		String query = "insert into cse values(4,'Sajiya')";
	
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection(url,uname,pass);
		System.out.println("Connection Established");
		
		Statement st = conn.createStatement();
		int cnt = st.executeUpdate(query);
	
		System.out.println(cnt +" rows affected");
		st.close();
		conn.close();

	}

}
