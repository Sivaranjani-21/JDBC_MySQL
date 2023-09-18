
import java.sql.*;
public class JDBC_DAO {

	public static void main(String[] args) {

		StudentDAO dao = new StudentDAO();
		Student s1 = dao.getStudent(11);
		System.out.println(s1.sname);

	}

}

class StudentDAO
{
	public Student getStudent(int rollno)
	{
		try
		{
			Student s = new Student();
			s.rollno = rollno;
			
			String url = "jdbc:mysql://localhost:3306/stud";
			String uname = "root";
			String pass = "Sw@thi@03";
			String query = "select sname from student where rollno="+rollno;
		
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection(url,uname,pass);
			System.out.println("Connection Established");
			
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(query);
			rs.next();

			String name = rs.getString(1);
			s.sname = name;
			return s;
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return null;
	}
}

class Student
{
	int rollno;
	String sname;
}