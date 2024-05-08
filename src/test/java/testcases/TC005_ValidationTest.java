package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import base.Specification;
import pages.HomePage;

public class TC005_ValidationTest extends Specification{
	
	@BeforeTest
	public void setup() {
	
	}
	
	@Test (priority=4)
	public void validationTest() throws InterruptedException {
		
		new HomePage(driver)
		.waititme(4000)
		.validatecheckin()
		.validateflightstatus()
		.validatemanagebooking();
	}
}
