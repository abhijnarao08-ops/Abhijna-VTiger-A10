package genericUtility;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzerImplementation implements IRetryAnalyzer
{
	int count = 1;
	int maxCount = 4; // identified manually (maximum is 5) if its more than 5 times, then there is an issue in the application

	@Override
	public boolean retry(ITestResult result) 
	{
		while(count <= maxCount)
		{
			count++ ; 
			return true;
		}
		return false;
	}
	
}
