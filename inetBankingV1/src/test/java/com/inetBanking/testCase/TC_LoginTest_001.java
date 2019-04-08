package com.inetBanking.testCase;

import org.testng.annotations.Test;

import com.inetBanking.pageObject.LoginPage;

public class TC_LoginTest_001 extends BaseClass {
	
@Test
public void loginTest() {
	driver.get(baseURL);
	logger.info("URL is opened");
	
	LoginPage lp=new LoginPage(driver);
	lp.setUserName(username);
	logger.info("Entered username");
	lp.setPassword(password);
	logger.info("Entered pass");
	lp.clicksubmit();
	logger.info("Login test passed");
	
}

}
