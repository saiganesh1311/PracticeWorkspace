package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatingNewLeadsPage {
	@FindBy(xpath="//input[@name='firstname']")
	private WebElement FirstName;
	
	@FindBy(xpath="//input[@name='lastname']")
	private WebElement LastName;
	
	@FindBy(xpath="//input[@name='company']")
	private WebElement company;
	 
	@FindBy(xpath="//input[@id='designation']")
	private WebElement title;
	
	@FindBy(xpath="//input[@id='phone']")
	private WebElement phone;
	
	@FindBy(xpath="//input[@id='mobile']")
	private WebElement mobile;
	
	@FindBy(xpath="//input[@id='email']")
	private WebElement email;
	
	@FindBy(xpath="//input[@id='noofemployees']")
	private WebElement emp;
	
	@FindBy(xpath="//textarea[@name='lane']")
	private WebElement street;
	
	@FindBy(xpath="//input[@id='pobox']")
	private WebElement pobox;
	
	@FindBy(xpath="//input[@id='code']")
	private WebElement pCode;
	
	@FindBy(xpath="//input[@id='city']")
	private WebElement city;
	
	@FindBy(xpath="//input[@id='country']")
	private WebElement country;
	
	@FindBy(xpath="//input[@id='state']")
	private WebElement state;
	
	public CreatingNewLeadsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getFirstName() {
		return FirstName;
	}

	public WebElement getLastName() {
		return LastName;
	}

	public WebElement getCompany() {
		return company;
	}

	public WebElement getTitle() {
		return title;
	}

	public WebElement getPhone() {
		return phone;
	}

	public WebElement getMobile() {
		return mobile;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getEmp() {
		return emp;
	}

	public WebElement getStreet() {
		return street;
	}

	public WebElement getPobox() {
		return pobox;
	}

	public WebElement getpCode() {
		return pCode;
	}

	public WebElement getCity() {
		return city;
	}

	public WebElement getCountry() {
		return country;
	}

	public WebElement getState() {
		return state;
	}
	
	public void createNewLeads(String FirstName,String LastName, String company)
	{
		getFirstName().sendKeys(FirstName);
		getLastName().sendKeys(LastName);
		getCompany().sendKeys(company);
		
	}
	
	public void createNewLeads(String FirstName,String LastName, String company,String title, String phone, String mobile, String email,  String emp, String street, String PoBox, String poCode, String city, String country, String state )
	
	{
		getFirstName().sendKeys(FirstName);
		getLastName().sendKeys(LastName);
		getCompany().sendKeys(company);
		getTitle().sendKeys(title);
		getPhone().sendKeys(phone);
		getMobile().sendKeys(email);
		getEmail().sendKeys(email);
		getEmp().sendKeys(emp);
		getStreet().sendKeys(street);
		getPobox().sendKeys(PoBox);
		getpCode().sendKeys(poCode);
		getCity().sendKeys(city);
		getCountry().sendKeys(country);
		getState().sendKeys(state);
		
}
	
	
	
      public void createNewLeads(String FirstName,String LastName, String company,String title, String phone, String mobile, String email,  String emp)
	
	    {
		getFirstName().sendKeys(FirstName);
		getLastName().sendKeys(LastName);
		getCompany().sendKeys(company);
		getTitle().sendKeys(title);
		getPhone().sendKeys(phone);
		getMobile().sendKeys(email);
		getEmail().sendKeys(email);
		getEmp().sendKeys(emp);
		
		
         }

       public void createNewLeads(String FirstName,String LastName, String company,String street, String PoBox, String poCode, String city, String country, String state )

    {
	          getFirstName().sendKeys(FirstName);
	          getLastName().sendKeys(LastName);
	          getCompany().sendKeys(company);
	          getStreet().sendKeys(street);
	          getPobox().sendKeys(PoBox);
	          getpCode().sendKeys(poCode);
	          getCity().sendKeys(city);
	          getCountry().sendKeys(country);
	          getState().sendKeys(state);
	
     }

}
