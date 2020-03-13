package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	public WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

//Ui mapper
	By emailField = By.xpath("//input[@placeholder='email']");
	By passwordField = By.xpath("//input[@placeholder='password']");
	By loginBtn = By.xpath("//button/span[text()='Login']");
	By eroorSnack = By.xpath("//app-snack/span");
	By submitBtn = By.xpath("//button[@class=\"mat-button mat-accent\"]");

//Actions
	public void enterEmail(String email) {
		driver.findElement(emailField).sendKeys(email);
	}

	public void enterPassword(String password) {
		driver.findElement(passwordField).sendKeys(password);
	}

	public void clickLogin() {
		driver.findElement(loginBtn).click();
	}

	public String getErrorMessage() {
		return driver.findElement(eroorSnack).getText();
	}

	public String getCloseMessage() {
		return driver.findElement(submitBtn).getText();
	}

}
