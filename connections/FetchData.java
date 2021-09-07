package connections;
import java.sql.*;

public class FetchData {
	public static final String FetchQuery="select EMPLOYEE.ID,EMPLOYEE.NAME,salary.SDATE,salary.SSALARY from "+"EMPLOYEE"+" inner join"+" salary on EMPLOYEE.ID=salary.ID;";
	
    public static void main(String[] args) throws SQLException, ClassNotFoundException 
    {
    	FetchData fetchData=new FetchData();
    	fetchData.fetchRecord();
    }
    
    	public void fetchRecord() throws SQLException, ClassNotFoundException {
    	
    	 Connection con=new MainClass().Dao();     
       
            PreparedStatement preparedStatement = con.prepareStatement(FetchQuery);
            {
            preparedStatement.setInt(1, 2);
            System.out.println(preparedStatement);
            
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("ID");
                String name = rs.getString("NAME");
                String date = rs.getString("SDATE");
                int salary=rs.getInt("SSALARY");
               
                System.out.println(id + "  " + name + "  " + date+"   " +salary);
            }
            }
        }
   }


