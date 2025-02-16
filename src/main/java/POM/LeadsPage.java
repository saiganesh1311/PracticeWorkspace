package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeadsPage {
	
	@FindBy(xpath="//img[@alt=\"Create Lead...\"]")
	private WebElement createNewLeadsIcon;
	
	public LeadsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getCreateNewLeadsIcon()
	{
		return createNewLeadsIcon;
		
	}
	
	public void clickOnLeadsIcon()
	{
		getCreateNewLeadsIcon().click();
	}

}
