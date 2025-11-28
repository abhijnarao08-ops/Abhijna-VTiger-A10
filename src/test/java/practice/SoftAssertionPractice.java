package practice;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertionPractice 
{
	@Test
	public void strictLevelSoftAssertion()
	{
		String expectedValue = "Selenium";
		String actualValue = "Selenium";
		System.out.println("Strict level soft assertion starts");
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(actualValue, expectedValue);
		sa.assertAll();
		System.out.println("Strict level soft assertion ends");
	}
	
	@Test
	public void containsLevelSoftASsertion()
	{
		String expectedValue = "don";
		String actualValue = "London";
		System.out.println("Contains level soft assertion starts");
		SoftAssert sa = new SoftAssert();
		sa.assertTrue(actualValue.contains(expectedValue));
		System.out.println("Contains level soft assertion ends");
		sa.assertEquals(actualValue.contains(expectedValue), false);
		sa.assertAll();
	}
}
