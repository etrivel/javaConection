package connections;
import java.sql.*;

public class DeleteData {
	


	    String query = "delete from users where id = ?;";

	    public static void main(String[] argv) throws SQLException {
	    	 DeleteData deleteData = new DeleteData();
	    	 deleteData .deleteData();
	    }

	    private void deleteData() {
			// TODO Auto-generated method stub
			
		}

		public void deleteRecord() throws SQLException, ClassNotFoundException {
	    	 new MainClass();
			Connection con=new MainClass().Dao();     
	            PreparedStatement statement = con.prepareStatement( query );
	            {
	            statement.setInt(1, 5);
	  
	            int result = statement.executeUpdate();
	            System.out.println("Number of records deleted:: " + result);
	        } 
	    }

	    }
