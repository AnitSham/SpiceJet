package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.Specification;

public class SeachFlightTwoWayPage extends Specification {

	@FindBy(xpath = "//input[@value='Select Destination']")
	WebElement destination;

	@FindBy(xpath = "(//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep'])[3]")
	WebElement departuretab;

	@FindBy(xpath = "//div[text()='30']")
	WebElement departuredate;

	@FindBy(xpath = "//div[text()='Select Date']")
	WebElement returndatetab;

	@FindBy(xpath = "//div[text()='22']")
	WebElement returndate;

	@FindBy(xpath = "//div[@data-testid='home-page-flight-cta']")
	WebElement searchflight;

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

	@FindBy(xpath = "//div[@data-testid='traveller-info-continue-cta']")
	WebElement paymentcont;

	@FindBy(xpath = "(//div[@class='css-1dbjc4n r-1awozwy r-19m6qjp r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-6ity3w r-d9fdf6 r-9qu9m4 r-ah5dr5 r-1otgn73'])[3]")
	WebElement paymentcontinuebutton;

	@FindBy(tagName = "p")
	WebElement skip;

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

	@FindBy(xpath = "//div[@class='css-1dbjc4n r-1awozwy r-un1frt r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-6ity3w r-d9fdf6 r-9qu9m4 r-ah5dr5 r-1otgn73']")
	WebElement payment;

	@FindBy(xpath = "//div[text()='Payment Failed']")
	WebElement verifybooking;

	public SeachFlightTwoWayPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public SeachFlightTwoWayPage destination(String Destination) {
		sendKeys(destination, Destination);
		return this;
	}

	public SeachFlightTwoWayPage departuretab() {
		click(departuretab);
		return this;
	}

	public SeachFlightTwoWayPage departuredate() {
		click(departuredate);
		return this;
	}

	public SeachFlightTwoWayPage returndatetab() {
		click(returndatetab);
		return this;
	}

	public SeachFlightTwoWayPage returndate() {
		click(returndate);
		return this;
	}

	public SeachFlightTwoWayPage searchflight() {
		click(searchflight);
		return this;
	}

	public SeachFlightTwoWayPage continuebutton() {
		click(continuebutton);
		return this;
	}

	public SeachFlightTwoWayPage titletab() {
		click(titletab);
		return this;
	}

	public SeachFlightTwoWayPage title() {
		click(title);
		return this;
	}

	public SeachFlightTwoWayPage firstname(String FirstName) {
		sendKeys(firstname, FirstName);
		return this;
	}

	public SeachFlightTwoWayPage lastname(String LastName) {
		sendKeys(lastname, LastName);
		return this;
	}

	public SeachFlightTwoWayPage contactnumber(String Contact) {
		sendKeys(contactnumber, Contact);
		return this;
	}

	public SeachFlightTwoWayPage email(String Email) {
		sendKeys(email, Email);
		return this;
	}

	public SeachFlightTwoWayPage city(String City) {
		sendKeys(city, City);
		return this;
	}

	public SeachFlightTwoWayPage primarypass() {
		click(primarypass);
		return this;
	}

	public SeachFlightTwoWayPage pagedown() {
		Actions action = new Actions(driver);
		action.sendKeys(Keys.PAGE_DOWN).build().perform();
		return this;
	}

	public SeachFlightTwoWayPage paymentcont() {
		Actions action = new Actions(driver);
		action.moveToElement(paymentcont).click().build().perform();
		return this;
	}

	public SeachFlightTwoWayPage paymentcontinuebutton() {
		Actions action = new Actions(driver);
		action.click(paymentcontinuebutton).build().perform();
		return this;
	}

	public SeachFlightTwoWayPage skip() {
		Actions action = new Actions(driver);
		action.moveToElement(skip).click().build().perform();
		return this;
	}

	public SeachFlightTwoWayPage cardframe() {
		driver.switchTo().frame(cardframe);
		return this;
	}

	public SeachFlightTwoWayPage debitcard(String DebitCard) {
		sendKeys(debitcard, DebitCard);
		return this;
	}

	public SeachFlightTwoWayPage nameframe() {
		driver.switchTo().frame(nameframe);
		return this;
	}

	public SeachFlightTwoWayPage cardname(String CardName) {
		sendKeys(cardname, CardName);
		return this;
	}

	public SeachFlightTwoWayPage monthframe() {
		driver.switchTo().frame(monthframe);
		return this;
	}

	public SeachFlightTwoWayPage expmonth(String ExpMonth) {
		sendKeys(expmonth, ExpMonth);
		return this;
	}

	public SeachFlightTwoWayPage yearframe() {
		driver.switchTo().frame(yearframe);
		return this;
	}

	public SeachFlightTwoWayPage expyear(String ExpYear) {
		sendKeys(expyear, ExpYear);
		return this;
	}

	public SeachFlightTwoWayPage securityframe() {
		driver.switchTo().frame(securityframe);
		return this;
	}

	public SeachFlightTwoWayPage securitycvv(String SecurityCode) {
		sendKeys(securitycvv, SecurityCode);
		return this;
	}

	public SeachFlightTwoWayPage payment() {
		Actions action = new Actions(driver);
		action.click(payment).build().perform();
		return this;
	}

	public SeachFlightTwoWayPage verifybooking() {
		String x = verifybooking.getText();
		System.out.println("Booking Failed");
		return this;
	}

	public SeachFlightTwoWayPage waittime(long time) throws InterruptedException {
		waitProperty(time);
		return this;
	}

	public SeachFlightTwoWayPage switchframe() {
		driver.switchTo().defaultContent();
		return this;
	}

}
