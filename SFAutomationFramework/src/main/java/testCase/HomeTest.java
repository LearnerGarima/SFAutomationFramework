package testCase;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import constant.WaitConstants;
import pages.LoginPage;
import pages.HomePage;
import utilities.CommonUtils;

public class HomeTest extends BaseTest {

	WebDriver driver = BaseTest.getDriver();
	HomePage hp;
	
	
	public void navigateToHome() throws IOException, InterruptedException {
		driver = BaseTest.getDriver();
		LoginPage lp = new LoginPage(driver);
		lp.loginIntoApp(driver);
	}
	
	
	public void homeTest_TC34() throws IOException, InterruptedException {
		
		hp = new HomePage(driver);
		CommonUtils.waitForElement(driver, hp.home);
		hp.home.click();
		System.out.println("Home clicked");


		Thread.sleep(2000);
	}
	

	public void selectEdit_TC35() throws IOException, InterruptedException {
		
		hp = new HomePage(driver);
		WebDriverWait wait = new WebDriverWait(driver, WaitConstants.WAIT_FOR_ELEMENT);
		CommonUtils.waitForElement(driver, hp.home);
		hp.home.click();
		
		BaseTest.test.info("Selected edit");
		Thread.sleep(2000);
	}
	

	public void customizeTab_TC36() throws IOException, InterruptedException {
		
		hp = new HomePage(driver);
		//WebDriverWait wait = new WebDriverWait(driver, WaitConstants.WAIT_FOR_ELEMENT);
    	CommonUtils.waitForElement(driver, hp.home);
		hp.home.click();
		
		BaseTest.test.info("Selected customize tab");
		Thread.sleep(2000);
	}
	

	public void newEvent_TC37() throws IOException, InterruptedException {
		
	hp = new HomePage(driver);
		//WebDriverWait wait = new WebDriverWait(driver, WaitConstants.WAIT_FOR_ELEMENT);
		CommonUtils.waitForElement(driver, hp.home);
     	hp.home.click();
		
		BaseTest.test.info("Selected new event");
		Thread.sleep(2000);
	}
	
	
}
