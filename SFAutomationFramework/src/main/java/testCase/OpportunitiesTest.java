package testCase;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.LoginPage;
import pages.OpportunitiesPage;
import utilities.CommonUtils;

public class OpportunitiesTest extends BaseTest {
	
	WebDriver driver = BaseTest.getDriver();
	OpportunitiesPage opp;
	
	
	public void navigateToHome() throws IOException, InterruptedException {
		driver = BaseTest.getDriver();
		LoginPage lp = new LoginPage(driver);
		lp.loginIntoApp(driver);
	}
	
	
	public void opportunities_TC15() throws IOException, InterruptedException {
		
		opp = new OpportunitiesPage(driver);
		CommonUtils.waitForElement(driver, opp.opportunitiesLink);
		opp.opportunitiesLink.click();
		Thread.sleep(4000);
		Assert.assertTrue(opp.verifyOpportunitiesDropdown(), "fail");            
		BaseTest.test.info("Dropdown verified");
	}
	
	
	public void editOpportunitiesTest_TC16() throws IOException, InterruptedException {
		
		opp = new OpportunitiesPage(driver);
		CommonUtils.waitForElement(driver, opp.opportunitiesLink);
		opp.opportunitiesLink.click();
		Thread.sleep(4000);
		Assert.assertTrue(opp.creatNewOppertunity(driver), "");
		BaseTest.test.info("created new oppertunity");
	}
	
	
	public void pipelineTest_TC17() throws IOException, InterruptedException {
		
		opp = new OpportunitiesPage(driver);
		CommonUtils.waitForElement(driver, opp.opportunitiesLink);
		opp.opportunitiesLink.click();
		Thread.sleep(4000);
		Assert.assertTrue(opp.clickPipeline(driver), "");
		BaseTest.test.info("Selected pipeline");
	}
	
	
	public void stuckOppertunityLinkTest_TC18() throws IOException, InterruptedException {
		
		opp = new OpportunitiesPage(driver);
		CommonUtils.waitForElement(driver, opp.opportunitiesLink);
		opp.opportunitiesLink.click();
		Thread.sleep(4000);
		Assert.assertTrue(opp.clickStuckOppertunity(driver), "");
		BaseTest.test.info("Selected stuck oppertunity");
	}
	
	
	public void quarterlySummaryLinkTest_TC19() throws IOException, InterruptedException {
		
		opp = new OpportunitiesPage(driver);
		CommonUtils.waitForElement(driver, opp.opportunitiesLink);
		opp.opportunitiesLink.click();
		Thread.sleep(4000);
		Assert.assertTrue(opp.clickQuarterlySummary(driver), "");
		BaseTest.test.info("Selected quarterly summary");
	}
		
}
