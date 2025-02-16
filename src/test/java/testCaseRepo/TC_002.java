package testCaseRepo;

import java.io.IOException;

import javax.swing.GroupLayout.Group;

import org.testng.annotations.Test;

import POM.CreatingNewLeadsPage;
import POM.HomePage;
import POM.LeadsPage;
import genericUtility.BaseClass;

public class TC_002 extends BaseClass {
	
	@Test( dependsOnGroups = {"LEAD_001"})
	public void LEAD_002() throws IOException
	{
		HomePage hp = new HomePage(driver);
		hp.clickOnLeadsMenu();
		
		LeadsPage lp= new LeadsPage(driver);
		lp.clickOnLeadsIcon();
		
		String FirstName= eUtil.getDataFromExcel("Leads", 2, 2);
		String LastName= eUtil.getDataFromExcel("Leads", 2, 3);
		String comp= eUtil.getDataFromExcel("Leads", 2, 4);
		
		CreatingNewLeadsPage clp= new CreatingNewLeadsPage(driver);
		clp.createNewLeads(FirstName, LastName, comp);
		System.out.println("after commit");
		
		System.out.println("hello world");
		System.out.println("hello who");
		System.out.println("welcome ");
		System.out.println("welcome to new practice");

		System.out.println("hello all");

		System.out.println("branch push");

	}

}
