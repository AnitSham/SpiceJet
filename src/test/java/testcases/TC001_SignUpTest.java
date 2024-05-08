package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.Specification;
import pages.HomePage;

public class TC001_SignUpTest extends Specification{

	@BeforeTest
	public void setup() {
		sheetName="TC001_SignUp";
	}
	
	@Test (dataProvider ="getData", priority=-1)
	public void signupTest(String inputtitle,String FirstName,String LastName,String inputyear,String inputmonth,String Mobile,
			String Email,String Pass,String CPass) throws InterruptedException {
		
		new HomePage(driver)
		 .clickSignUp()
	    .newWindow()
	    .title(inputtitle)
		.firstname(FirstName)
		.lastname(LastName)
		.waittime(3000)
		.dob()
		.year(inputyear)
		.month(inputmonth)
		.date()
		.mobile(Mobile)
		.email(Email)
		.password(Pass)
		.conpassword(CPass)
		.waittime(3000)
		.checkbox()
		.signsubmitbutton();
	}

}
