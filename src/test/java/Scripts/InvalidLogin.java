package Scripts;

import org.testng.annotations.Test;

import Generic.BaseTeestMedicine;
import Pages.LoginPageMedicine;
import Generic.BaseTeestMedicine;


public class InvalidLogin extends BaseTeestMedicine {

	@Test(priority = 2,groups={"login"})
	public void testInvalidLogin() {
//		   1. Enter Invalid User Name -abcd
			LoginPageMedicine loginPage=new LoginPageMedicine(driver);
			loginPage.setUserName("abcd");
//		    2. Enter Invalid Password- xyz
			loginPage.setPassword("xyz");
//		    3. click on login button
			loginPage.clickLoginButton();
//		    4. Verify that Error Msg is Displayed
			boolean result = loginPage.verifyErrMsgDisplayed(wait);
			softAssert.assertTrue(result);
			softAssert.assertAll();
	}
	
}
