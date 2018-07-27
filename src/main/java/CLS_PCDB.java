import java.sql.ResultSet;


public class CLS_PCDB {
	 public static void main(String[] argv) throws Exception 
	 {
     
	    try { 
	   
		 ResultSet rs = null ; 
		 CLS_PCDBUtility pcdb = new CLS_PCDBUtility() ; 
		 rs = pcdb.getQueryRS("select * from pc_product_offering_temp") ; 
		 while(rs.next())
	     {
	            	System.out.println( rs.getString("prod_name") ); 
	     }
		 
	    }catch(Exception e)
	    {
	    	System.out.println(e.getMessage());  
	    	
	    }
	    
	 
	 }
}
