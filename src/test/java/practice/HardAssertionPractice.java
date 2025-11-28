package practice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertionPractice 
{
	@Test
	public void strictLevelHardAssertion()
	{
		String expectedValue = "java";
		String actualValue = "java";
		System.out.println("Strict level hard assertion starts");
		Assert.assertEquals(actualValue, expectedValue);
		// Assert.assertFalse(!actualValue.equals(expectedValue));
		System.out.println("Strict level hard assertion ends");
		
	}
	
	@Test
	public void containsLevelHardAssertion()
	{
		String expectedValue = "Abhijna";
		String actualValue = "AbhijnaRao";
		System.out.println("Contains level hard assertion starts");
		Assert.assertEquals(actualValue.contains(expectedValue), true);
		// Assert.assertTrue(actualValue.contains(expectedValue));
		System.out.println("Contains level hard assertion ends");
	}

}
