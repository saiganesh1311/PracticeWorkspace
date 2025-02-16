package testCaseRepo;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import POM.CreatingNewLeadsPage;
import POM.HomePage;
import POM.LeadsPage;
import genericUtility.BaseClass;
import genericUtility.ListernersImplementation;

@Listeners(genericUtility.ListernersImplementation.class)
public class TC_001 extends BaseClass {
	
	
	@Test(groups = {"Smoke"})
	public void LEAD_001() throws IOException
	{
		HomePage hp= new HomePage(driver);
		hp.clickOnLeadsMenu();
		
		LeadsPage lp= new LeadsPage(driver);
		lp.clickOnLeadsIcon();
		
		String FirstName= eUtil.getDataFromExcel("Leads", 2, 2);
		String LastName= eUtil.getDataFromExcel("Leads", 2, 3);
		String comp= eUtil.getDataFromExcel("Leads", 2, 4);
		
		Assert.fail();
		CreatingNewLeadsPage clp= new CreatingNewLeadsPage(driver);
		clp.createNewLeads(FirstName, LastName, comp);
		
		
		
		
		
	
	}
	
	
	
	

}
