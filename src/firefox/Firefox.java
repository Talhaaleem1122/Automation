package firefox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox 
{
	public static void main(String[] args) throws InterruptedException {

		// Create a new instance of the Firefox driver
		WebDriver driver = new FirefoxDriver();

		//Launch the Online Store Website
		driver.get("https://www.toolsqa.com/selenium-webdriver/selenium-test/");

		// Print a Log In message to the screen
		System.out.println("Successfully opened the website www.Store.Demoqa.com");

		//Wait for 5 Sec
		Thread.sleep(5000);

		// Close the driver
		driver.quit();
	}

}
