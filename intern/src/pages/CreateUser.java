package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateUser {
	public WebDriver driver;

	public CreateUser(WebDriver driver) {
		this.driver = driver;
	}

	//Ui Mapper
	By newUserBtn = By.xpath("//app-employee/button");
	By firstName = By.xpath("//input[@placeholder=\"first name\"]");
	By lastName = By.xpath("//input[@placeholder=\"last name\"]");
	By email = By.xpath("//input[@placeholder=\"email\"]");
	By company = By.xpath("//input[@placeholder=\"company\"]");
	By phone = By.xpath("//input[@placeholder=\"phone\"]");
	By agreeBtn = By.xpath("//label[@class='mat-checkbox-layout']");
	By sendBtn = By.xpath("//button[@class=\"mat-raised-button mat-accent\"]");

//Actions
	public void openNewUser() {
		driver.findElement(newUserBtn).click();
	}

	public void enterFirstName(String fname) {
		driver.findElement(firstName).sendKeys(fname);
	}

	public void enterLastName(String lname) {
		driver.findElement(lastName).sendKeys(lname);
	}

	public void enterEmail(String emails) {
		driver.findElement(email).sendKeys(emails);
	}

	public void enterPhone(String phoneNumber) {
		driver.findElement(phone).sendKeys(phoneNumber);
	}

	public void enterCompany(String companyName) {
		driver.findElement(company).sendKeys(companyName);
	}

	public void clickAgree() {
		driver.findElement(agreeBtn).click();
	}

	public void clickSubmit() {
		driver.findElement(sendBtn).click();
	}
}
