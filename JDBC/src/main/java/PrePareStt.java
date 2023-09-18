import java.sql.*;
public class PrePareStt {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		String url = "jdbc:mysql://localhost:3306/stud";
		String uname = "root";
		String pass = "Sw@thi@03";
		int userid = 5;
		String username = "Jnc";
		String query = "insert into cse values(?,?)";
	
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection(url,uname,pass);
		System.out.println("Connection Established");
		
		PreparedStatement st = conn.prepareStatement(query);
		st.setInt(1, userid);
		st.setString(2, username);
	
		int cnt = st.executeUpdate();
		System.out.println(cnt +" rows affected");
		
		st.close();
		conn.close();

	}

}
