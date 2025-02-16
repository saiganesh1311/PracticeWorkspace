package genericUtility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

public class SeleniumUtility {
	
	
	public void navigateToURL(WebDriver driver, String URL)
	{
		driver.get(URL);
	}
	
	public void maximizeWebPage(WebDriver driver)
	{
		driver.manage().window().maximize();
	}
	
	public void implicitWait(WebDriver driver, int count)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(count));
	}

}
