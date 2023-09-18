import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Update {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		String url = "jdbc:mysql://localhost:3306/stud";
		String uname = "root";
		String pass = "Sw@thi@03";
		String query = "update cse set studname = 'Surya' where studid = 3";
	
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
