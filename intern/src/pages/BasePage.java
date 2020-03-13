package pages;

import org.openqa.selenium.WebDriver;

import actions.CreateUserActions;
import actions.LoginActions;
import pagedriver.BrowserInstance;

public class BasePage {
	protected static WebDriver driver = BrowserInstance.readBrowser();
	protected LoginPage loginPage = new LoginPage(driver);
	protected UserDashboard userDashboard = new UserDashboard(driver);
	protected LoginActions loginFlow = new LoginActions(driver);
	protected CreateUser newUser = new CreateUser(driver);
	protected CreateUserActions newUserFlow = new CreateUserActions(driver);
}
