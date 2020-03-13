package tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import pagedriver.Page;
import pages.BasePage;
import pages.CreateUser;
import utils.ConfigFileReader;
import utils.Messages;
import utils.Util;

public class Tests extends BasePage {

	@Test
	@Ignore
	public void Login() throws InterruptedException {
		Page.navigateTo(ConfigFileReader.getAppURL());
		assertEquals(Messages.APPLICATION_TITLE, Page.getTitle());
		loginFlow.login("parau.dan98@gmail.com", "dadada");
		assertEquals("Welcome: parau.dan98@gmail.com", userDashboard.getWelcomeMessage());

	}

	@Test
	@Ignore
	public void LoginWithoutPassword() {
		Page.navigateTo(ConfigFileReader.getAppURL());
		assertEquals(Messages.APPLICATION_TITLE, Page.getTitle());
		loginFlow.login("parau.dan98@gmail.com", "");
		String currentProblem = loginPage.getErrorMessage();
		assertTrue(currentProblem.contains(Messages.LOGIN_ERROR_INVALID_PASSWORD));

	}

	@Test
	@Ignore
	public void LoginWithoutEmail() {
		Page.navigateTo(ConfigFileReader.getAppURL());
		assertEquals(Messages.APPLICATION_TITLE, Page.getTitle());
		loginFlow.login("", "dada");

		String closeButton = loginPage.getCloseMessage();
		assertTrue(closeButton.contains(Messages.LOGIN_ERROR_NO_EMAIL));
	}

	@Test
	public void createNewUser() throws InterruptedException {
		Page.navigateTo(ConfigFileReader.getAppURL());
		assertEquals(Messages.APPLICATION_TITLE, Page.getTitle());
		loginFlow.login("parau.dan98@gmail.com", "dadada");
		loginPage.clickLogin();
		String randomize = Integer.toString(Util.generateRandomInt(2000));

		newUserFlow.createUser("Dorian", "Popa", "dada@f", "", "");
		
		String currentFirstname = userDashboard.getLastFirstName();
		String currentLastname = userDashboard.getLastLastName();
		assertEquals("Dorian"+randomize, currentFirstname);
		assertEquals("Popa"+randomize, currentLastname);
		userDashboard.deleteLastUser();
		userDashboard.acceptDeleteLastUser();
		Thread.sleep(3000);
		String currentFN = userDashboard.getLastFirstName();
		String currentLN = userDashboard.getLastLastName();
		assertNotEquals("Dorian"+randomize, currentFN);
		assertNotEquals("Popa"+randomize,currentLN);
	}

	@AfterClass
	public static void CloseTest() {
		Page.close();
	}

}
