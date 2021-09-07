
package connections;
import java.sql.*;

import com.sun.tools.javac.Main;

public class connectio{

	public static void main(String[] args) {
	try
	{
		
		String url="jdbc:mysql://172.17.0.2:3306/emp?serverTimezone=UTC";
		String uname="root";
		String pass="password";
		String query="SELECT * FROM EMPLOYEE";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,uname,pass);
		Statement st=con.createStatement();
		ResultSet rs =st.executeQuery(query);
		
		/**String userData=""; **/
		System.out.println("ID NAME GENDER AGE");
		   while(rs.next())
		   {
		/** userData=rs.getInt(1)+":"+rs.getString(2)+rs.getString(3)+rs.getInt(4);**/
		 System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+"  "+rs.getInt(4));
		    }
	    st.close(); 
		con.close();
		
	}
	catch(Exception e) {
		System.out.println(e);
	}

	}

}

