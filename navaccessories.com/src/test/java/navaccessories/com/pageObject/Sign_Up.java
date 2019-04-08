package navaccessories.com.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sign_Up {
	
	WebDriver ldriver;
	
	public Sign_Up(WebDriver rdriver){
		
		ldriver = rdriver;
		
		PageFactory.initElements(rdriver,this);
		
	}
	
	//xpath = //a[Test()="Sign Up"]
	
	@FindBy(xpath = "//a[contains(text(),'Sign Up')]")
	WebElement  Sign_Up;

	@FindBy(name="first_name")
	WebElement textFirstName;
	
	@FindBy(name="last_name")
	WebElement textLastName;
	
	@FindBy(name="user_login")
	WebElement select_username;
	
	@FindBy(name="user_email")
	WebElement textEnter_email;
	
	@FindBy(name="wp-submit")
	WebElement Register;
	
	
	public void Click_Sign_Up(){
		Sign_Up.click();
	
	}
	
	public void setFirstName(String FirstName){
		
		textFirstName.sendKeys(FirstName);
	
	}
	
	public void setLastName(String LastName){
		textLastName.sendKeys(LastName);
	}
	
	public void setusername(String Select_username){
		select_username.sendKeys(Select_username);
	}

	public void  setEmail(String Enter_email){
		textEnter_email.sendKeys(Enter_email);
		
	}
	
	public void  Click_Register(){
		Register.click();
	}
	
}
