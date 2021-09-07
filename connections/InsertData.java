package connections;
import java.sql.*;

public class InsertData {
	public static final String InsertQuery="insert into EMPLOYEE"+"(ID,NAME,GENDER,AGE) VALUES	"+"(?,?,?,?);"; 
	  public static void main(String[] argv) throws SQLException, ClassNotFoundException {
	    	InsertData createTable = new InsertData();
	        createTable.insertRecord();
	    }

	    public void insertRecord() throws SQLException, ClassNotFoundException {
	       
	            
	             Connection con=new MainClass().Dao();
	            PreparedStatement preparedstatement= con.prepareStatement(InsertQuery );
	            {
	            preparedstatement.setInt(1, 5);
	            preparedstatement.setString(2, "BATMAN");
	            preparedstatement.setString(3, "MALE");
	            preparedstatement.setInt(3, 24);

	            
	           int data= preparedstatement.executeUpdate();

	            System.out.println(data+" row affected");
	           
	            
	          } 
	           new dao_close();
	     }
	   }
