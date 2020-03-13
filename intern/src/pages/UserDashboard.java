package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserDashboard {
	public WebDriver driver;

	public UserDashboard(WebDriver driver) {
		this.driver = driver;
	}

//UI MAPPER
	By userWelcomeMessageLabel = By.xpath("//div[@class='welcome']");
	By lastFirstName = By.xpath("//table/tbody/tr[last()]/td[1]");
	By lastLastName = By.xpath("//table/tbody/tr[last()]/td[2]");
	By deleteBtn = By.xpath("//table/tbody/tr[last()]/td/button[2]");
	By YesBtn = By.xpath("//button[@class='mat-button'][2]");
	By email=By.xpath("//input[@placeholder=\"email\"]");
	
//Actions
	public String getWelcomeMessage() {
		return driver.findElement(userWelcomeMessageLabel).getText();

	}

	public String getLastFirstName() {
		return driver.findElement(lastFirstName).getText();
	}

	public String getLastLastName() {
		return driver.findElement(lastLastName).getText();
	}
	public String getEmail() {
		return driver.findElement(email).getText();
		
	}

	public void deleteLastUser() {
		driver.findElement(deleteBtn).click();
	}

	public void acceptDeleteLastUser() {
		driver.findElement(YesBtn).click();
	}
}
