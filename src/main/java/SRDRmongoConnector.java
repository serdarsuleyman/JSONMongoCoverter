import com.mongodb.* ;


public class SRDRmongoConnector {
	
	public String connection_string ;  
	
	public void connectMongo()
	{
		try{
		
		     MongoClient mongoClient = new MongoClient(new MongoClientURI("mongodb://localhost:27017"));
		
		}catch(Exception exc)
		{
			System.out.println("HELLO: " + exc.toString()); 
		}
	}
	
	public SRDRmongoConnector()
	{
		
	}

}
