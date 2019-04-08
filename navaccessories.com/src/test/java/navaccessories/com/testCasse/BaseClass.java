package navaccessories.com.testCasse;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import navaccessories.com.utilities.ReadConfig;

public class BaseClass {
	
	ReadConfig  readconfig = new ReadConfig();
	
	public String baseURL = readconfig.getApplicationURL();
	
	public String F_F = readconfig.getFirst_Name();
			
	public String L_N = readconfig.getLast_Name();
	
	public String Select_u = readconfig.getSelect_username();
	
	public String Enter_emi  = readconfig.getEnter_email();
	
	public static WebDriver driver;
	
	@Parameters ("Browser")
	
	@BeforeClass
	
	public void setup(String Browser_Name){
		
		if (Browser_Name.equals("chrome")){
			
			System.setProperty("webdriver.chrome.driver","./Driver/chromedriver");
			
			driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
		}
		
		else if (Browser_Name.equals("firefox")){
			
			try {
			System.setProperty("Webdriver.firefox.driver","./Driver/geckodriver");
			
			//System.setProperty("Webdriver.gecko.driver","/home/nirbhay/Downloads/geckodriver");
			
			}catch(Exception e){
				
				System.out.println("Exception is" +  e.getMessage());
			}
			
			driver = new FirefoxDriver();
			
			driver.manage().window().maximize();
			
		}
		
		else {
			
			System.out.println("Browser does not exsit");
			
		}
		
		driver.get(baseURL);
		
	}
	
	@AfterClass
	public void tearDown() {
	driver.close();
		}
	}
