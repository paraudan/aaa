package actions;

import org.openqa.selenium.WebDriver;

import pages.CreateUser;
import utils.Util;

public class CreateUserActions {
	public WebDriver driver;

	public CreateUserActions(WebDriver driver) {
		this.driver = driver;
	}
	
	public void createUser(String firstname, String lastname, String email, String company, String phone) {
		CreateUser user = new CreateUser(driver);

		user.openNewUser();
		user.enterFirstName("Dorian");
		user.enterLastName("Popa");
		user.enterEmail("dada@f");
		user.enterPhone("22112");
		user.enterCompany("dd");
		user.clickAgree();
		user.clickSubmit();

	}
}
