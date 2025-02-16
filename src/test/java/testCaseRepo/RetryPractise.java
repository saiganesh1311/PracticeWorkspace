package testCaseRepo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RetryPractise {
	
	@Test(retryAnalyzer = genericUtility.RetryAnalyzerImplementation.class)
	public void Retry()
	{
		System.out.println("test started");
		//Assert.fail();
		System.out.println("test ended");

		
		


		System.out.println("old1");

		
		System.out.println("new1");
		


	}

}
