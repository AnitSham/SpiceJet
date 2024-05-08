package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.Specification;
import pages.HomePage;

public class TC002_LoginTest extends Specification{

	@BeforeTest
	public void setup() {
		sheetName="TC002_Login";
	}
	
	@Test(dataProvider ="getData", priority=1)
	public void loginTest(String EmailID,String Password ) throws InterruptedException {
		
		new HomePage(driver)
		.clickloginmain()
		.newWindow()
		.selectemail()
		.loginemail(EmailID)
		.loginpassword(Password)
		.waitime(3000)
		.login();
	}	
}
