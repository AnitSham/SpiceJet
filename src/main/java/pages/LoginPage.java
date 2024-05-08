package pages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Specification;

public class LoginPage extends Specification {

	@FindBy(xpath = "//div[text()='Email']")
	WebElement selectemail;

	@FindBy(xpath = "//input[@type='email']")
	WebElement loginemail;

	@FindBy(xpath = "//input[@type='password']")
	WebElement loginpassword;

	@FindBy(xpath = "//div[@data-testid='login-cta']")
	WebElement login;

	public LoginPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public LoginPage selectemail() {
		click(selectemail);
		return this;
	}

	public LoginPage loginemail(String EmailID) {
		sendKeys(loginemail, EmailID);
		return this;
	}

	public LoginPage loginpassword(String Password) {
		sendKeys(loginpassword, Password);
		return this;
	}

	public LoginPage login() {
		click(login);
		return this;
	}

	public LoginPage newWindow() {
		handlewindow();
		return this;
	}

	public LoginPage waitime(long time) throws InterruptedException {
		waitProperty(time);
		return this;

	}

}
