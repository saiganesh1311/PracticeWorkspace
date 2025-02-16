package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	@FindBy(xpath="//a[text()='Leads']")
	private WebElement Leads;
	
	@FindBy(xpath="//a[text()='Organizations']")
	private WebElement Organizations;
	
	@FindBy(xpath="//a[text()='Contacts']")
	private WebElement Contacts;
	
	@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
	private WebElement accountsIcon;
	
	@FindBy(xpath="//a[text()='Sign Out']")
	private WebElement signOut;
	
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}


	public WebElement getLeads() {
		return Leads;
	}


	public WebElement getOrganizations() {
		return Organizations;
	}


	public WebElement getContacts() {
		return Contacts;
	}


	public WebElement getAccountsIcon() {
		return accountsIcon;
	}


	public WebElement getSignOut() {
		return signOut;
	}
	
	
	public void clickOnLeadsMenu()
	{
		getLeads().click();
	}
	
	public void clickOnOrganizationsMenu()
	{
		getOrganizations().click();
		
	}
	
	public void clickOnContactsMenu()
	{
		getContacts().click();
	}
	
	public void signOutOperation(WebDriver driver)
	{
		Actions a = new Actions(driver);
		a.moveToElement(getAccountsIcon()).perform();
		a.click(getSignOut()).perform();
		
	}
	
	
	

}
