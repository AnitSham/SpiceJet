package pages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import base.Specification;

public class SignUpPage extends Specification {

	@FindBy(xpath = "//select[@class='form-control form-select ']")
	WebElement title;

	@FindBy(id = "first_name")
	WebElement firstname;

	@FindBy(id = "last_name")
	WebElement lastname;

	@FindBy(id = "dobDate")
	WebElement dob;

	@FindBy(xpath = "//select[@class=\"react-datepicker__year-select\"]")
	WebElement year;

	@FindBy(xpath = "//select[@class=\"react-datepicker__month-select\"]")
	WebElement month;

	@FindBy(xpath = "//div[@aria-label=\"Choose Saturday, March 29th, 1997\"]")
	WebElement date;

	@FindBy(xpath = "//input[@type=\"tel\"]")
	WebElement mobile;

	@FindBy(id = "email_id")
	WebElement email;

	@FindBy(id = "new-password")
	WebElement password;

	@FindBy(id = "c-password")
	WebElement conpassword;

	@FindBy(id = "defaultCheck1")
	WebElement checkbox;

	@FindBy(linkText = "Submit")
	WebElement signsubmitbutton;

	public SignUpPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public SignUpPage title(String inputtitle) {

		Select Title = new Select(title);
		Title.selectByValue(inputtitle);
		return this;
	}

	public SignUpPage firstname(String FirstName) {
		sendKeys(firstname, FirstName);
		return this;
	}

	public SignUpPage lastname(String LastName) {
		sendKeys(lastname, LastName);
		return this;
	}

	public SignUpPage dob() {
		click(dob);
		return this;
	}

	public SignUpPage year(String inputyear) {
		Select Year = new Select(year);
		Year.selectByValue(inputyear);
		return this;
	}

	public SignUpPage month(String inputmonth) {
		Select Month = new Select(month);
		Month.selectByVisibleText(inputmonth);
		return this;
	}

	public SignUpPage date() {
		click(date);
		return this;
	}

	public SignUpPage mobile(String Mobile) {
		sendKeys(mobile, Mobile);
		return this;
	}

	public SignUpPage email(String Email) {
		sendKeys(email, Email);
		return this;
	}

	public SignUpPage password(String Pass) {
		sendKeys(password, Pass);
		return this;
	}

	public SignUpPage conpassword(String CPass) {
		sendKeys(conpassword, CPass);
		return this;
	}

	public SignUpPage checkbox() {
		click(checkbox);
		return this;
	}

	public SignUpPage signsubmitbutton() {
		click(signsubmitbutton);
		return this;
	}

	public SignUpPage newWindow() {
		handlewindow();
		return this;
	}

	public SignUpPage waittime(long time) throws InterruptedException {
		waitProperty(time);
		return this;
	}
}
