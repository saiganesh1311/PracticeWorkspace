package genericUtility;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import POM.HomePage;
import POM.LoginPage;

public class BaseClass {
	
	public WebDriver driver;
	SeleniumUtility sUtil= new SeleniumUtility();
	JavaUtility jUtil = new JavaUtility();
	PropertiesUtility pUtil= new PropertiesUtility();
	public ExcelUtility eUtil= new ExcelUtility();
	
	@BeforeSuite(alwaysRun = true)
	public void dbConnecivity()
	{
		System.out.println("DB Connected");
	}
	
	@Parameters("browser")
	@BeforeClass(alwaysRun = true)
	public void launchingBrowser(@Optional("chrome")String BROWSER) throws IOException
	{
		if(BROWSER.equals("chrome")) 
		{
		driver= new ChromeDriver();
		}
		if(BROWSER.equals("edge"))
		{
			driver= new EdgeDriver();
		}
		
		String URL= pUtil.getDataFromProperties("url");
		sUtil.navigateToURL(driver, URL);
		sUtil.maximizeWebPage(driver);
		sUtil.implicitWait(driver, 10);
		System.out.println("Browser successfully launch");
		
	}
	
	@BeforeMethod(alwaysRun = true)
	public void loginToApplication() throws IOException
	{
		String username= pUtil.getDataFromProperties("username");
		String password= pUtil.getDataFromProperties("password");
		LoginPage lp= new LoginPage(driver);
		lp.loginToApplication(username, password);
		System.out.println("Login successful");
		
		
	}
	 
	@AfterMethod(alwaysRun = true)
	public void logoutFromApplication()
	{
		HomePage hp= new HomePage( driver);
		hp.signOutOperation(driver);
		
		
	}
	@AfterClass(alwaysRun = true)
	public void exitBrowser()
	{
		driver.quit();
		System.out.println("browser closed ");
	}
	
	@AfterSuite(alwaysRun = true)
	public void exitDBConnectivity()
	{
		System.out.println("exit DB Connectivity");
	}
	

}
