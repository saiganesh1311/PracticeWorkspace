package genericUtility;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzerImplementation implements IRetryAnalyzer{
	int count=1;
	int maxcount=4;
	@Override
	public boolean retry(ITestResult result) {
		 while(count<=maxcount)
		 {
			 count++;
			 return true;
		 }
		
		return false;
	}
	
	
	

}
