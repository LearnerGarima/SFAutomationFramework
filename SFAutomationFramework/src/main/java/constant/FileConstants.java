package constant;
import utilities.CommonUtils;

public class FileConstants {

	
	public static final String LOGIN_TESTDATA_FILE_PATH2 = System.getProperty("Users.dir") + "\\src\\test\\resources\\configFiles\\config.properties";
	
	public static final String USER_MENU_TESTDATA_FILE_PATH = System.getProperty("Users.dir") + "\\src\\test\\resources\\configFiles\\userMenuTestData.properties";
	
	public static final String PROFILE_PHOTO_FILE_PATH = System.getProperty("user.dir") + "\\src\\test\\resources\\configFiles\\upload_pic.jpeg";
	
	public static final String ACCOUNT_TESTDATA_FILE_PATH = System.getProperty("Users.dir") + "\\src\\test\\resources\\configFiles\\accountDetails.properties";
	
	public static final String 	CONTACTS_TESTDATA_FILE_PATH = System.getProperty("Users.dir") + "\\src\\test\\resources\\configFiles\\contacts.properties";
	
	public static final String 	OPPORTUNITIES_TESTDATA_FILE_PATH = System.getProperty("Users.dir") + "\\src\\test\\resources\\configFiles\\opportunities.properties";

	public static final String 	LEADS_TESTDATA_FILE_PATH = System.getProperty("Users.dir") + "\\src\\test\\resources\\configFiles\\leads.properties";

	public static final String 	REPORT_PATH = System.getProperty("Users.dir") + "\\src\\main\\resources\\reports"+CommonUtils.getStringDateAndTime()+"SalesforceAutomationFramework.html";

	public static final String 	SCREENSHOT_PATH = System.getProperty("Users.dir") + "\\src\\main\\resources\\reports"+CommonUtils.getStringDateAndTime()+"SalesforceAutomationFramework.PNG";

}