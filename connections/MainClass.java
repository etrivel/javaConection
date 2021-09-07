package connections;
import java.sql.*;
public class MainClass {
	


	public Object preStmt;

	public Connection Dao() throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc://mysql://172.17.0.2:3306/emp?serverTimezone=UTC";
		String uname="root";
		String pass="password";
		Connection con=DriverManager.getConnection(url,uname,pass);
		PreparedStatement preStmt=con.prepareStatement(pass);
		return con;
		
	}
		
	


		public Connection DaoClose() throws SQLException {
			Connection con = null;
      	  PreparedStatement preStmt = null;
			con.close();
         preStmt.close();
         return con;
		}


	

}
