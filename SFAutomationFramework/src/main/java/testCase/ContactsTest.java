package testCase;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import pages.LoginPage;
import pages.ContactsPage;
import utilities.CommonUtils;

public class ContactsTest extends BaseTest{

	WebDriver driver = BaseTest.getDriver();
	ContactsPage cp;
	
	
	public void navigateToHome() throws IOException, InterruptedException {
		driver = BaseTest.getDriver();
		LoginPage lp = new LoginPage(driver);
		lp.loginIntoApp(driver);
	}
	
	
	public void newContactsTest_TC26() throws IOException, InterruptedException {
		
		cp = new ContactsPage(driver);
		CommonUtils.waitForElement(driver, cp.contactsLink);
		cp.contactsLink.click();
		Thread.sleep(3000);
		
		BaseTest.test.info("Selected new");
	}
	
	
	public void newViewTest_TC27() throws InterruptedException, IOException {
		
		cp = new ContactsPage(driver);
		CommonUtils.waitForElement(driver, cp.contactsLink);
		cp.contactsLink.click();
		Thread.sleep(3000);
		
		BaseTest.test.info("Selected new view");
	}
	
	
	public void recentlyCreatedTest_TC28() throws InterruptedException, IOException {
		
		cp = new ContactsPage(driver);
		CommonUtils.waitForElement(driver, cp.contactsLink);
		cp.contactsLink.click();
		Thread.sleep(3000);
		
		BaseTest.test.info("Selected recently created");
	}

	
	public void newViewTest_TC29() throws InterruptedException, IOException {
	
		cp = new ContactsPage(driver);
		CommonUtils.waitForElement(driver, cp.contactsLink);
		cp.contactsLink.click();
		Thread.sleep(3000);
		
		BaseTest.test.info("Selected my contacts");
	}
	
	
	public void recentContactsNameTest_TC30() throws InterruptedException, IOException {
	
		cp = new ContactsPage(driver);
		CommonUtils.waitForElement(driver, cp.contactsLink);
		cp.contactsLink.click();
		Thread.sleep(3000);
		
		BaseTest.test.info("Selected recent contacts name");
	}
	
	
	public void errorViewUniqueNameTest_TC31() throws InterruptedException, IOException {
		
		cp = new ContactsPage(driver);
		CommonUtils.waitForElement(driver, cp.contactsLink);
		cp.contactsLink.click();
		Thread.sleep(3000);
		
		BaseTest.test.info("Selected view unique name");
	}
	
	
	public void cancleButtonTest_TC32() throws InterruptedException, IOException {
		
		cp = new ContactsPage(driver);
		CommonUtils.waitForElement(driver, cp.contactsLink);
		cp.contactsLink.click();
		Thread.sleep(3000);
		
		BaseTest.test.info("Selected new view cancel button");
	}
	
	
	public void newContactWithErrorTest_TC33() throws InterruptedException, IOException {
		
		cp = new ContactsPage(driver);
		CommonUtils.waitForElement(driver, cp.contactsLink);
		cp.contactsLink.click();
		Thread.sleep(3000);
		
		BaseTest.test.info("Selected new");
	}
	
}
