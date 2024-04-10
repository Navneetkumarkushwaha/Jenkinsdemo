package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GoogleSearchPage {
	
	WebDriver driver;

	public GoogleSearchPage(WebDriver driver) {
		this.driver = driver;
	}

	By searchBox = By.xpath("//textarea[@class='gLFyf']");
	By searchBtn = By.xpath("(//input[@name='btnK'])[1]");
	

	public void searchGoogle(String text) {
		try {
			this.driver.findElement(searchBox).sendKeys(text);
			Thread.sleep(1000);
			this.driver.findElement(searchBtn).click();
			Thread.sleep(1000);
		} catch (Exception e) {
			System.out.println("Erorr Encountered" + e.getMessage());
		}
	}

}
