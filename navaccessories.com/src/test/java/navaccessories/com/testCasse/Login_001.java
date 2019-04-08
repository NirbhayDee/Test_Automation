package navaccessories.com.testCasse;

import org.testng.annotations.Test;

import navaccessories.com.pageObject.Login_Page;

public class Login_001 extends BaseClass{
	
	@Test
	
	public void Login(){

	Login_Page lp = new Login_Page(driver);
	
	lp.Click_Login();
	lp.setusername("Nirbhay");
	lp.setpassword("pass123");
	
	}

}
