package testCase;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import constant.WaitConstants;
import pages.AccountPage;
import pages.LoginPage;
import testCase.BaseTest;
import org.apache.logging.log4j.core.util.Assert;

import utilities.CommonUtils;

public class AccountTest extends BaseTest {

	WebDriver driver = BaseTest.getDriver();
	AccountPage acc;
	
	
	public void navigateToHome() throws IOException, InterruptedException {
		driver = BaseTest.getDriver();
		LoginPage lp = new LoginPage(driver);
		lp.loginIntoApp(driver);
	}
	
	
	public void accountTest_TC10() throws IOException, InterruptedException {
		
		acc = new AccountPage(driver);
		WebDriverWait wait = new WebDriverWait(driver, WaitConstants.WAIT_FOR_ELEMENT);
		CommonUtils.waitForElement(driver, acc.accountLink);
		acc.accountLink.click();
		System.out.println("accountlink click");
		
		BaseTest.test.info("Selected create new account");
	}
	
	
	public void newViewLinkTest_TC11() throws IOException, InterruptedException {
		
		acc = new AccountPage(driver);
		WebDriverWait wait = new WebDriverWait(driver, WaitConstants.WAIT_FOR_ELEMENT);
		CommonUtils.waitForElement(driver, acc.accountLink);
		acc.accountLink.click();
		
		BaseTest.test.info("Selected create new view");
	}
	
	
	public void editLinkTest_TC12() throws IOException, InterruptedException {
		
		acc = new AccountPage(driver);
		WebDriverWait wait = new WebDriverWait(driver, WaitConstants.WAIT_FOR_ELEMENT);
		CommonUtils.waitForElement(driver, acc.accountLink);
		acc.accountLink.click();
		
		BaseTest.test.info("Selected edit");
	}
	
	
	public void mergeAccountTest_TC13() throws IOException, InterruptedException {
		
		acc = new AccountPage(driver);
		WebDriverWait wait = new WebDriverWait(driver, WaitConstants.WAIT_FOR_ELEMENT);
		CommonUtils.waitForElement(driver, acc.accountLink);
		acc.accountLink.click();
		
		BaseTest.test.info("Selected merge account");
	}
	
	
	public void historyTest_TC14() throws IOException, InterruptedException {
		
		acc = new AccountPage(driver);
		WebDriverWait wait = new WebDriverWait(driver, WaitConstants.WAIT_FOR_ELEMENT);
		CommonUtils.waitForElement(driver, acc.accountLink);
		acc.accountLink.click();
		 
		BaseTest.test.info("Selected last activity history");
	}
		
}
