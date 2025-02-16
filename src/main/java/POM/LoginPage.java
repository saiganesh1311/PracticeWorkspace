package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * 
 */
public class LoginPage {
	
	@FindBy(xpath="//input[@name='user_name']")
	private WebElement Username;
	
	@FindBy(xpath="//input[@name='user_password']")
	private WebElement Password;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement Submit;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	public WebElement getUsername() {
		return Username;
	}

	public WebElement getPassword() {
		return Password;
	}

	public WebElement getSubmit() {
		return Submit;
	}
	
	public void loginToApplication(String username, String password)
	{
		getUsername().sendKeys(username);
		getPassword().sendKeys(password);
		getSubmit().click();
		
		
		
	}

}
