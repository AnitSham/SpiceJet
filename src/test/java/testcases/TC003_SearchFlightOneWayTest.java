package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.Specification;
import pages.HomePage;


public class TC003_SearchFlightOneWayTest extends Specification{

	@BeforeTest
	public void setup() {
		sheetName="SearchFlightOneWay";
	}
	
	@Test(dataProvider ="getData", priority=3)
	public void searchflightonewayTest(String Destination,String FirstName,String LastName,String Contact,String Email,String City, String StudentIDCard1, String FirstName2,String LastName2,
			String MobileNum2,String StudentIDCard2,String DebitCard,String CardName,String ExpMonth,String ExpYear,
			String SecurityCode) throws InterruptedException {
		
		new HomePage(driver)
		.destinationPlace(Destination)
		.departuretab()
		.waititme(1000)
	//	.departuredate()
		.passengers()
		.addpassengers()
		.submitpassengers()
		.waititme(3000)
		.members()
		.searchflight()
		.termscond()
		.continuetermcond()
		.continuebutton()
		.waititme(4000)
		.titletab()
		.title()
		.firstname(FirstName)
		.lastname(LastName)
		.contactnumber(Contact)
		.email(Email)
		.city(City)
		.primarypass()
		.student1idcard(StudentIDCard1)
		.next()
		.firstname2(FirstName2)
		.lastname2(LastName2)
		.mobilenum2(MobileNum2)
		.student2idcard(StudentIDCard2)
		.paymentcont()
		.paymentcontinuebutton()
		.skip()
		.waititme(1000)
		.cardframe()
		.debitcard(DebitCard)
		.switchframe()
		.nameframe()
		.waititme(1000)
		.cardname(CardName)
		.switchframe()
		.monthframe()
		.waititme(1000)
		.expmonth(ExpMonth)
        .switchframe()
       .yearframe()
       .waititme(1000)
        .expyear(ExpYear)
        .switchframe()
        .securityframe() 
        .waititme(1000)
		.securitycvv(SecurityCode)	
		.switchframe()
		 .waititme(3000)
		.payment()
		.verifybooking();	
		
}
}