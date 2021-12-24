package Scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import Generic.BaseTeestMedicine;
import Generic.ExcelMedicine;
import Pages.LoginPageMedicine;
import Pages.ETTPage;


public class ValidLogin extends BaseTeestMedicine {
	
	@Test(priority = 1,groups={"smoke","login"})
	public void testValidLogin() {
		 String un=ExcelMedicine.getData(XL_PATH, "ValidLogin", 1, 0);
		 String pw=ExcelMedicine.getData(XL_PATH, "ValidLogin", 1, 1);
		 String failMSG=ExcelMedicine.getData(XL_PATH, "ValidLogin", 1, 2);
		 
//	    1. Enter Valid User Name
		LoginPageMedicine loginPage=new LoginPageMedicine(driver);
		loginPage.setUserName(un);
		
//	    2. Enter Valid Password
		loginPage.setPassword(pw);
		
//	    3. click on login button
		loginPage.clickLoginButton();
		
//	    4. Verify that Home Page is Displayed
		ETTPage ettPage=new ETTPage(driver);
		boolean result = ettPage.verifyWelcomeIsDisplayed(wait);
		Assert.assertTrue(result,failMSG);
	}

}
