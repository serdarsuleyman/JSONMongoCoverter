import org.json.JSONObject;


public class JSONCreateFile {

	public static void main(String[] args)  {

     try{
		String message;
		JSONObject json = new JSONObject();

		json.put("test1", "value1");

		JSONObject jsonObj = new JSONObject();

		jsonObj.put("id", 0);
		jsonObj.put("name", "testName");
		json.put("test2", jsonObj);

		message = json.toString();
		System.out.println(message);
     }catch(Exception e)
     {
    	 System.out.println(e.toString());
     }

	}

}