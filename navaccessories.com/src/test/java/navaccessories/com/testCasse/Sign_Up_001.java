package navaccessories.com.testCasse;

import org.testng.annotations.Test;
import navaccessories.com.pageObject.Sign_Up;

public class Sign_Up_001 extends BaseClass {
	
	@Test
	
	public void Registration (){
		
		Sign_Up SU  = new Sign_Up(driver); 
		
		SU.Click_Sign_Up();
		
		SU.setFirstName(F_F);
		
		SU.setLastName(L_N);
		
		SU.setusername(Select_u);
		
		SU.setEmail(Enter_emi);
		
		SU.Click_Register();
	}

}