import java.sql.*;

public class Connect {
	Connection c;
	Statement s;
	public Connect() {
		try {
	
	String url = "jdbc:mysql://localhost:3306/payroll";
	String user = "ajay";
	String pass = "password";
	Class.forName("com.mysql.jdbc.Driver");
	c =DriverManager.getConnection(url, user, pass);
	s=c.createStatement();
		} catch(Exception e){
          System.out.println(e);
		}
	}
	
}