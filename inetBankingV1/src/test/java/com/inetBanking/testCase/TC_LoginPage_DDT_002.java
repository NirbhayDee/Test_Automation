package com.inetBanking.testCase;

import java.io.IOException;

import org.openqa.selenium.NoAlertPresentException;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.inetBanking.pageObject.LoginPage;
import com.inetBanking.utilities.XLUtils;

public class TC_LoginPage_DDT_002 extends BaseClass

{
	
	@Test(dataProvider="LoginData")
	public void loginDDt(String user,  String pwd) {
		LoginPage lp= new LoginPage(driver);
		lp.setUserName(user);
		lp.setPassword(pwd);
		lp.clicksubmit();
	if (isAlertPresent()==true)
	{
		driver.switchTo().alert().accept();
		driver.switchTo().defaultContent();
		Assert.assertTrue(false);
		}
	
	else
	{
		Assert.assertTrue(true);
		lp.clickLogout();
		driver.switchTo().alert().accept();
		driver.switchTo().defaultContent();
	}
}
	public boolean isAlertPresent()
	{
		try {
			driver.switchTo().alert();
			return true;
		
	}catch (NoAlertPresentException e)
	{
		return false;
	}
 }
	@DataProvider(name="LoginData")
	String [][] getdata() throws IOException
	{
		
		String path = "/home/nirbhay/eclipse-workspace/inetBankingV1/src/test/java/com/intBanking/testData/file_example_XLSX_10.xlsx";
		int rownum = XLUtils.getRowCount(path,"Sheet1");
		int colcount = XLUtils.getCellCount(path,"Sheet1",1);
		
		String logindata [] [] =  new String[rownum][colcount];
		
		for (int i=1; i<=rownum; i++) {
			for (int j=0;j<colcount;j++) {
				logindata[i-1][j]=XLUtils.getCellData(path,"Sheet1",i,j);
			}
		}
		
		return logindata;
	}
}
