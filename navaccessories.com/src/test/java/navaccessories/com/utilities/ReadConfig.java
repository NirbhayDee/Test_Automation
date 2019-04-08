package navaccessories.com.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	
	Properties pro;
	
	public ReadConfig(){
		
		File src = new File("./Configuration/Config.properties");
		
		try{
			
			FileInputStream fis = new FileInputStream(src);
			
			pro = new Properties();
			pro.load(fis);
			
		}catch(Exception e){
			
			System.out.println("Exception is" +  e.getMessage());
			
		}
	}
	
	public String getApplicationURL(){
		
		String url = pro.getProperty("baseURL");
		
		return url;
	}
	
	public String getFirst_Name(){
		
		String First_Name = pro.getProperty("First_Name");
		
		return First_Name;
	}
	
	public String getLast_Name (){
		
		String Select_username = pro.getProperty("Last_Name");
		
		return Select_username;
	}
	
	public String getSelect_username (){
		
		String Select_username = pro.getProperty("Select_username");
		
		return Select_username;
				
	}
	
	public String  getEnter_email(){
		
		String Enter_email = pro.getProperty("Enter_email");
		
		return Enter_email;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
