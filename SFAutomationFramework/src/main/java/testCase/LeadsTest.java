package testCase;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import pages.LoginPage;
import pages.LeadsPage;
import utilities.CommonUtils;

public class LeadsTest extends BaseTest {

	WebDriver driver = BaseTest.getDriver();
	LeadsPage lp;
	
	
	public void navigateToHome() throws IOException, InterruptedException {
		driver = BaseTest.getDriver();
		LoginPage lp = new LoginPage(driver);
		lp.loginIntoApp(driver);
	}
	
	
	public void leads_TC20() throws IOException, InterruptedException {
		
		lp = new LeadsPage(driver);
		CommonUtils.waitForElement(driver, lp.leadsLink);
		lp.leadsLink.click();
		Thread.sleep(3000);
	}
	
	
	public void dropdownVerifyTest_TC21() throws IOException, InterruptedException {
		
		
		
	}
	
	
	public void dropdownVerifyTest_TC22() throws IOException, InterruptedException {
		
		lp = new LeadsPage(driver);
		CommonUtils.waitForElement(driver, lp.leadsLink);
		lp.leadsLink.click();
		Thread.sleep(3000);
		
		BaseTest.test.info("Selected today leads");
	}
	
	
	public void goVerifyTest_TC23() throws IOException, InterruptedException {
		
		lp = new LeadsPage(driver);
		CommonUtils.waitForElement(driver, lp.leadsLink);
		lp.leadsLink.click();
		Thread.sleep(3000);
		
		BaseTest.test.info("Selected go verify");
	}
	
	
	public void todayLeadVerifyTest_TC24() throws IOException, InterruptedException {
		
		lp = new LeadsPage(driver);
		CommonUtils.waitForElement(driver, lp.leadsLink);
		lp.leadsLink.click();
		Thread.sleep(3000);
		
		BaseTest.test.info("Selected today lead page");
	}
	
	
	public void newLeadVerifyTest_TC25() throws IOException, InterruptedException {
		
		lp = new LeadsPage(driver);
		CommonUtils.waitForElement(driver, lp.leadsLink);
		lp.leadsLink.click();
		Thread.sleep(3000);
		
		BaseTest.test.info("created new lead");
	}
	
	
}
