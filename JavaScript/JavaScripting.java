package TestLogin;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utility.Selenium_Utility;

public class JavaScripting extends Selenium_Utility{

	public static void main(String[] args) {
	WebDriver driver;
	driver = setUp( "chrome", "https://opensource-demo.orangehrmlive.com/");
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	//UserId
	js.executeScript("document.getElementById(\"txtUsername\").value = 'Admin';");
	
	//Password
	js.executeScript("document.getElementById(\"txtPassword\").value='admin123';");
	
	WebElement SignIn = driver.findElement(By.xpath("//input[@id=\"btnLogin\"]"));
	js.executeScript("arguments[0].click();", SignIn);
	
	//For Scroll Page
	js.executeScript("window.scrollBy(0,600)");
	
	//Print Domain of the page
	String DomainName = js.executeScript("return document.domain;").toString();			
    System.out.println("Domain name of the site = "+DomainName);

    //Print Page URL
    String URL = js.executeScript("return document.URL;").toString();			
    System.out.println("Domain name of the site = "+URL);
    
    long start_time = System.currentTimeMillis();			
    
    //Call executeAsyncScript() method to wait for 5 seconds		
    js.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 5000);");			
    		
   //Get the difference (currentTime - startTime)  of times.		
   System.out.println("Passed time: " + (System.currentTimeMillis() - start_time));
   
   cleanUp();
	}
}
