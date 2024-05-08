package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.Specification;
import pages.HomePage;

public class TC004_SearchFlightTwoWayTest extends Specification{

	@BeforeTest
	public void setup() {
		sheetName="SearchFlightTwoWay";
	}
	
	@Test(dataProvider ="getData", priority=4)
	public void searchflighttwowayTest(String Destination,String FirstName,String LastName,String Contact,String Email,String City,
			String DebitCard,String CardName,String ExpMonth,String ExpYear,
			String SecurityCode) throws InterruptedException {
	
		new HomePage(driver)
		.roundtripbooking()
		.destination(Destination)
		.departuretab()
		.waittime(3000)
		.returndatetab()
		.returndate()
		.searchflight()
		.continuebutton()
		.waittime(4000)
		.titletab()
		.title()
		.firstname(FirstName)
		.lastname(LastName)
		.contactnumber(Contact)
		.email(Email)
		.city(City)
		.primarypass()
		.pagedown()
		.waittime(1000)
		.paymentcont();
	
		/*.paymentcontinuebutton()
		.waittime(1000)
		.skip()
		.waittime(1000)
		.cardframe()
		.debitcard(DebitCard)
		.switchframe()
		.nameframe()
		.waittime(1000)
		.cardname(CardName)
		.switchframe()
		.monthframe()
		.waittime(1000)
		.expmonth(ExpMonth)
        .switchframe()
       .yearframe()
       .waittime(1000)
        .expyear(ExpYear)
        .switchframe()
        .securityframe() 
        .waittime(1000)
		.securitycvv(SecurityCode)	
		.switchframe()
		 .waittime(1000)
		.payment()
		 .waittime(1000)
		.verifybooking();	*/
	}
}
