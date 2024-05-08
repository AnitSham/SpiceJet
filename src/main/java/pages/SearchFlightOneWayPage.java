package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.Specification;

public class SearchFlightOneWayPage extends Specification {

	@FindBy(xpath = "//div[@data-testid='undefined-month-May-2024']//div[@data-testid='undefined-calendar-day-18']")
	WebElement departuretab;
	
	@FindBy(xpath = "//div[text()='16']")
	WebElement departuredate;

	@FindBy(xpath = "(//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep'])[5]")
	WebElement passengers;

	@FindBy(xpath = "//div[@data-testid='Adult-testID-plus-one-cta']")
	WebElement addpassengers;

	@FindBy(xpath = "//div[@data-testid='home-page-travellers-done-cta']")
	WebElement submitpassengers;

	@FindBy(xpath = "//div[text()='Students']")
	WebElement members;

	@FindBy(xpath = "//div[@data-testid='home-page-flight-cta']")
	WebElement searchflight;

	@FindBy(xpath = "//div[@class='css-1dbjc4n r-1tf5bf9 r-1777fci r-1ww30s9']")
	WebElement termscond;

	@FindBy(xpath = "//div[@class='css-1dbjc4n r-1awozwy r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-d9fdf6 r-1w50u8q r-ah5dr5 r-1otgn73']")
	WebElement continuetermcond;

	@FindBy(xpath = "//div[@data-testid='continue-search-page-cta']")
	WebElement continuebutton;

	@FindBy(xpath = "(//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep'])[1]")
	WebElement titletab;

	@FindBy(xpath = "//div[text()='Mrs']")
	WebElement title;

	@FindBy(xpath = "//input[@data-testid='first-inputbox-contact-details']")
	WebElement firstname;

	@FindBy(xpath = "//input[@data-testid='last-inputbox-contact-details']")
	WebElement lastname;

	@FindBy(xpath = "//input[@data-testid='contact-number-input-box']")
	WebElement contactnumber;

	@FindBy(xpath = "//input[@data-testid='emailAddress-inputbox-contact-details']")
	WebElement email;

	@FindBy(xpath = "//input[@data-testid='city-inputbox-contact-details']")
	WebElement city;

	@FindBy(xpath = "//div[text()='I am flying as the primary passenger']")
	WebElement primarypass;

	@FindBy(xpath = "(//input[@class='css-1cwyjr8 r-homxoj r-poiln3 r-ubezar r-1eimq0t r-1e081e0 r-xfkzu9 r-lnhwgy'])[7]")
	WebElement student1idcard;

	@FindBy(xpath = "//div[text()='Next']")
	WebElement next;

	@FindBy(xpath = "//input[@data-testid='traveller-1-first-traveller-info-input-box']")
	WebElement firstname2;

	@FindBy(xpath = "//input[@data-testid='traveller-1-last-traveller-info-input-box']")
	WebElement lastname2;

	@FindBy(xpath = "//input[@data-testid='sc-member-mobile-number-input-box']")
	WebElement mobilenum2;

	@FindBy(xpath = "(//input[@class='css-1cwyjr8 r-homxoj r-poiln3 r-ubezar r-1eimq0t r-1e081e0 r-xfkzu9 r-lnhwgy'])[7]")
	WebElement student2idcard;

	@FindBy(xpath = "//div[@data-testid='traveller-info-continue-cta']")
	WebElement paymentcont;

	@FindBy(xpath = "//span[text()='Skip this to skip comfort.']")
	WebElement skip;

	@FindBy(xpath = "//div[@data-testid='add-ons-continue-footer-button'][3]")
	WebElement paymentcontinuebutton;

	@FindBy(className = "card_number_iframe")
	WebElement cardframe;

	@FindBy(xpath = "//input[@placeholder='Enter Card Number Here']")
	WebElement debitcard;

	@FindBy(className = "name_on_card_iframe")
	WebElement nameframe;

	@FindBy(id = "name_on_card")
	WebElement cardname;

	@FindBy(className = "card_exp_month_iframe")
	WebElement monthframe;

	@FindBy(xpath = "//input[@placeholder='MM']")
	WebElement expmonth;

	@FindBy(className = "card_exp_year_iframe")
	WebElement yearframe;

	@FindBy(xpath = "//input[@placeholder='YY']")
	WebElement expyear;

	@FindBy(className = "security_code_iframe")
	WebElement securityframe;

	@FindBy(xpath = "//input[@placeholder='123']")
	WebElement securitycvv;

	@FindBy(xpath = "//div[text()='Proceed to pay']")
	WebElement payment;

	@FindBy(xpath = "//div[text()='Payment Failed']")
	WebElement verifybooking;

	public SearchFlightOneWayPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public SearchFlightOneWayPage departuretab() {
		click(departuretab);
		return this;
	}

	public SearchFlightOneWayPage departuredate() {
		click(departuredate);
		return this;
	}

	public SearchFlightOneWayPage passengers() {
		click(passengers);
		return this;
	}

	public SearchFlightOneWayPage addpassengers() {
		click(addpassengers);
		return this;
	}

	public SearchFlightOneWayPage submitpassengers() {
		click(submitpassengers);
		return this;
	}

	public SearchFlightOneWayPage members() {
		click(members);
		return this;
	}

	public SearchFlightOneWayPage searchflight() {
		click(searchflight);
		return this;
	}

	public SearchFlightOneWayPage termscond() {
		click(termscond);
		return this;
	}

	public SearchFlightOneWayPage continuetermcond() {
		click(continuetermcond);
		return new SearchFlightOneWayPage(driver);
	}

	public SearchFlightOneWayPage continuebutton() {
		click(continuebutton);
		return this;
	}

	public SearchFlightOneWayPage titletab() {
		click(titletab);
		return this;
	}

	public SearchFlightOneWayPage title() {
		click(title);
		return this;
	}

	public SearchFlightOneWayPage firstname(String FirstName) {
		sendKeys(firstname, FirstName);
		return this;
	}

	public SearchFlightOneWayPage lastname(String LastName) {
		sendKeys(lastname, LastName);
		return this;
	}

	public SearchFlightOneWayPage contactnumber(String Contact) {
		sendKeys(contactnumber, Contact);
		return this;
	}

	public SearchFlightOneWayPage email(String Email) {
		sendKeys(email, Email);
		return this;
	}

	public SearchFlightOneWayPage city(String City) {
		sendKeys(city, City);
		return this;
	}

	public SearchFlightOneWayPage primarypass() {
		click(primarypass);
		return this;
	}

	public SearchFlightOneWayPage student1idcard(String StudentIDCard1) {
		sendKeys(student1idcard, StudentIDCard1);
		return this;
	}

	public SearchFlightOneWayPage next() {
		click(next);
		return this;
	}

	public SearchFlightOneWayPage firstname2(String FirstName2) {
		sendKeys(firstname2, FirstName2);
		return this;
	}

	public SearchFlightOneWayPage lastname2(String LastName2) {
		sendKeys(lastname2, LastName2);
		return this;
	}

	public SearchFlightOneWayPage mobilenum2(String MobileNum2) {
		sendKeys(mobilenum2, MobileNum2);
		return this;
	}

	public SearchFlightOneWayPage student2idcard(String StudentIDCard2) {
		sendKeys(student2idcard, StudentIDCard2);
		return this;
	}

	public SearchFlightOneWayPage paymentcont() {
		click(paymentcont);
		return this;
	}

	public SearchFlightOneWayPage skip() {
		click(skip);
		return this;
	}

	public SearchFlightOneWayPage paymentcontinuebutton() {
		click(paymentcontinuebutton);
		return this;
	}

	public SearchFlightOneWayPage cardframe() {
		driver.switchTo().frame(cardframe);
		return this;
	}

	public SearchFlightOneWayPage debitcard(String DebitCard) {
		sendKeys(debitcard, DebitCard);
		return this;
	}

	public SearchFlightOneWayPage nameframe() {
		driver.switchTo().frame(nameframe);
		return this;
	}

	public SearchFlightOneWayPage cardname(String CardName) {
		sendKeys(cardname, CardName);
		return this;
	}

	public SearchFlightOneWayPage monthframe() {
		driver.switchTo().frame(monthframe);
		return this;
	}

	public SearchFlightOneWayPage expmonth(String ExpMonth) {
		sendKeys(expmonth, ExpMonth);
		return this;
	}

	public SearchFlightOneWayPage yearframe() {
		driver.switchTo().frame(yearframe);
		return this;
	}

	public SearchFlightOneWayPage expyear(String ExpYear) {
		sendKeys(expyear, ExpYear);
		return this;
	}

	public SearchFlightOneWayPage securityframe() {
		driver.switchTo().frame(securityframe);
		return this;
	}

	public SearchFlightOneWayPage securitycvv(String SecurityCode) {
		sendKeys(securitycvv, SecurityCode);
		return this;
	}

	public SearchFlightOneWayPage payment() {
		Actions action = new Actions(driver);
		action.click(payment).build().perform();
		return this;
	}

	public SearchFlightOneWayPage verifybooking() {
		String x = verifybooking.getText();
		System.out.println("Booking Failed");
		return this;
	}


	public SearchFlightOneWayPage waititme(long time) throws InterruptedException {
		waitProperty(time);
		return this;
	}

	public SearchFlightOneWayPage switchframe() {
		driver.switchTo().defaultContent();
		return this;
	}

}
