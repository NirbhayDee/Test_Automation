package navaccessories.com.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {
	
	WebDriver ldriver;
	
	public Login_Page(WebDriver rdriver){
		
		ldriver = rdriver;
		
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath = "//a[Text()=' Login']")
	WebElement Click_Login;
	
	@FindBy (id = "user_login")
	WebElement textusername;
	
	@FindBy (id = "user_pass")
	WebElement textpass;
	
	@FindBy (id = "wp-submit")
	WebElement Click_Log_In;
	
	public void Click_Login(){
		Click_Login.click();
	}
	
	public void  setusername(String User_Name){	
		textusername.sendKeys("user");
	}
	
	public void setpassword(String pass){
		
		textpass.sendKeys("user");
	}
	
	public void Click_Log_In(){
		Click_Log_In.click();
	}
	
	}
