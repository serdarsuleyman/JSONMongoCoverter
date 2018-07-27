import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement; 

public class CLS_PCDBUtility {
     
	CLS_PCDBUtility () 
	{
		
	}
	
	public ResultSet getQueryRS(String sqlStmt) throws Exception
	{
		 Connection connection = null;
	     Statement stmt = null; 
	     ResultSet rs = null ; 
		  
		  try
		  {
			   connection = DriverManager.getConnection(
		                    "jdbc:oracle:thin:@(DESCRIPTION=    (ADDRESS=      (PROTOCOL=TCP)      (HOST=vfxh-scan)      (PORT=1521)    )    (CONNECT_DATA=      (SERVER=dedicated)      (SERVICE_NAME=datalake)    )  )", 
		                    "VFTRPC", "VFTRPC1234!");
			
	           stmt = connection.createStatement() ; 
	           rs = stmt.executeQuery("select * from pc_product_offering_temp");
	           //connection.close(); 
	           return rs ;
	           
	      }catch(Exception e)
		  {
			  throw e; 
		  }
		  finally
		  {
			  rs = null; 
			  stmt = null ; 
			  connection = null ; 
			  
	      }
		  


    }//end method
}
