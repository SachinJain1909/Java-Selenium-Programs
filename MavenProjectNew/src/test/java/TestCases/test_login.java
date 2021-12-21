package TestCases;

import org.testng.annotations.Test;

import Utils.SeleniumUtility;

public class test_login extends SeleniumUtility{
	
	@Test
	public void LoginTest() {
		SeleniumUtility.setUp("chrome", "https://opensource-demo.orangehrmlive.com/");
		testSample obj = new testSample(driver);
		obj.LoginMethod("Admin", "admin123");
	}
	

}
