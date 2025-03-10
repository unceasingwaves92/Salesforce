package task;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SFO19_CreateTask {
	
	@Test
	public void createTask() {
		
		String url = System.getProperty("url");
		
		if(url == null) {
			url = "https://login.salesforce.com";
		}
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		System.out.println("Welcome to salesforce application");
		// Load the URL
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		// 1. Login to https://login.salesforce.com
		driver.findElementById("username").sendKeys("cypress@testleaf.com");
		driver.findElementById("password").sendKeys("Bootcamp$123");
		driver.findElementById("Login").click();
		System.out.println("Not successfully");
		System.out.println("Welcome to salesforce application");
		System.out.println("Welcome to salesforce application1");
		
		// 2. Click on toggle menu button from the left corner
		driver.findElementByClassName("slds-icon-waffle").click();
		
		// 3. Click view All and click Sales from App Launcher
		driver.findElementByXPath("//button[text()='View All']").click();
		
		// Close the browser
		driver.close();
		
	}

}
