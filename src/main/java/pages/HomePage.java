package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Specification;

public class HomePage extends Specification {

	@FindBy(linkText = "Signup")
	WebElement signup;

	@FindBy(xpath = "//div[@class='css-1dbjc4n r-1jkjb']")
	WebElement loginmain;

	@FindBy(xpath = "//input[@value='Select Destination']")
	WebElement destination;

	@FindBy(xpath = "//div[text()='round trip']")
	WebElement roundtripbooking;

	@FindBy(xpath = "//div[text()='check-in']")
	WebElement validatecheckin;

	@FindBy(xpath = "//div[text()='flight status']")
	WebElement validateflightstatus;

	@FindBy(xpath = "//div[text()='manage booking']")
	WebElement validatemanagebooking;

	public HomePage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public SignUpPage clickSignUp() {
		click(signup);
		return new SignUpPage(driver);
	}

	public LoginPage clickloginmain() {
		click(loginmain);
		return new LoginPage(driver);
	}

	public SearchFlightOneWayPage destinationPlace(String Destination) {
		sendKeys(destination, Destination);
		return new SearchFlightOneWayPage(driver);
	}

	public SeachFlightTwoWayPage roundtripbooking() {
		click(roundtripbooking);
		return new SeachFlightTwoWayPage(driver);
	}

	public HomePage validatecheckin() {
		if (validatecheckin.isDisplayed()) {
			System.out.println("Check-in field is available");
		} else {
			System.out.println("Check-in field is not available");
		}
		return this;
	}

	public HomePage validateflightstatus() {
		if (validateflightstatus.isDisplayed()) {
			System.out.println("Flight status field is available");
		} else {
			System.out.println("Flight status field is not available");
		}
		return this;
	}

	public HomePage validatemanagebooking() {
		if (validatemanagebooking.isDisplayed()) {
			System.out.println("Manage booking field is available");
		} else {
			System.out.println("Manage booking field is not available");
		}
		return this;
	}

	public HomePage waititme(long time) throws InterruptedException {
		waitProperty(time);
		return this;

	}

}