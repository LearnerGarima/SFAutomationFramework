package testCase;

import java.io.IOException;
import java.lang.reflect.Method;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Listeners;
import listenerss.SaleforceListeners;
import pages.LoginPage;

@Listeners(SaleforceListeners.class)
public class LoginTest extends BaseTest {

	WebDriver driver;


	public void loginTest1() throws IOException, InterruptedException {

		driver = BaseTest.getDriver();
		LoginPage lp = new LoginPage(driver);
		lp.loginIntoApp(driver);
		BaseTest.test.info("Login sucessfully");
		System.out.println("Login sucessfully");
		Thread.sleep(2000);
	}

	
	public void loginPagePassword_TC2(Method name) throws IOException, InterruptedException {
		driver = BaseTest.getDriver();
		LoginPage lp = new LoginPage(driver);
		lp.loginIntoAppWithNoPassword(driver);
		System.out.println("Please enter your password.");
	}

	
	public void loginTestForgotPassword_TC3(Method name) throws IOException, InterruptedException {
		driver = BaseTest.getDriver();
		LoginPage lp = new LoginPage(driver);
		lp.loginIntoAppWithForgotPassword(driver);
		System.out.println("Forgot Password");
	}

	
	public void loginTestWrongDetail_TC4(Method name) throws IOException, InterruptedException {
		driver = BaseTest.getDriver();
		LoginPage lp = new LoginPage(driver);
		lp.loginIntoAppWithIncorrectDetail(driver);
		System.out.println(
				"Your login attempt has failed. The username or password may be incorrect, or your location or login time may be restricted. Please contact the administrator at your company for help");
	}

}
