package Tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import pages.GoogleSearchPage;

public class TestMethods {

	WebDriver driver;

	@BeforeTest
	public void beforeTest() {

		System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\chromedriver.exe");
		driver = new ChromeDriver();
		this.driver.manage().window().maximize();

	}

	@Test(priority = 0)
	public void openGoogle() {
	
		try {
			this.driver.get("https://www.google.com/");
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
	
	@Test(priority = 1)
	public void searchGoogle() {
		
		
		try {
			Thread.sleep(2000);
			GoogleSearchPage page = new GoogleSearchPage(driver);
			page.searchGoogle("Amazon");
			
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

	@AfterTest
	public void tearDown() {
		
		try {
			Thread.sleep(3000);
			driver.quit();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error: " + e.getMessage());
		}
		
	}

}
