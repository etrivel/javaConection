package connections;
import java.sql.*;
import java.sql.Connection;


public class UpdateData {
	public static final String UpdateQuery="update EMPLOYEE set GENDER = ? where ID = ?;";
	 public static void main(String[] argv) throws SQLException, ClassNotFoundException {
    	UpdateData updateData = new UpdateData();
   	 updateData.updateData();
   }

   public void updateData() throws SQLException, ClassNotFoundException {
   	 Connection con=new MainClass().Dao();
           PreparedStatement preparedStatement = con.prepareStatement(UpdateQuery);
       	{
           preparedStatement.setString(1, "Ram@gmail");
           preparedStatement.setInt(2, 1);

           // Execute the query or update query
           preparedStatement.executeUpdate();
           System.out.println(preparedStatement);
       } 

   }
}
