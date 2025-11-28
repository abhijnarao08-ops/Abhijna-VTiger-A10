package genericUtility;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

/**
 * This is an utility class which has functionalities present in Java library
 * @author Abhijna
 * @version 03.11.2025
 */

public class SeleniumUtility 
{
	/**
	 * This is a generic method to access a web application
	 * @param driver
	 * @param url
	 */
	public void accessApplication(WebDriver driver, String url)
	{
		driver.get(url);
	}
	
	/**
	 * This is a generic method to maximize the browser
	 * @param driver
	 */
	public void maximizeWindow(WebDriver driver)
	{
		driver.manage().window().maximize();
	}
	
	/**
	 * This is a generic method to provide implicit wait 
	 * @param driver
	 * @param maxTime
	 */
	
	public void implicitWait(WebDriver driver, int maxTime)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(maxTime));
	}
	
	/**
	 * This is a generic method to close the browser
	 * @param driver
	 */
	public void closeBrowser(WebDriver driver)
	{
		driver.quit();
	}
	
	/////////////*************HANDLING DROPDOWN***********/////////////////
	
	/**
	 * This is a generic method to select an option in dropdown by its index
	 * @param dropdownElement
	 * @param index
	 */
	public void selectOptionByIndex(WebElement dropdownElement, int index)
	{
		Select sel = new Select(dropdownElement);
		sel.selectByIndex(index);
	}
	
	/**
	 * This is a generic method to select an option in dropdown by its value attribute
	 * @param dropdownElement
	 * @param value
	 */
	public void selectOptionByValue(WebElement dropdownElement, String value)
	{
		Select sel = new Select(dropdownElement);
		sel.selectByValue(value);
	}
	
	/**
	 * This is a generic method to select an option in dropdown by its visibleText
	 * @param dropdownElement
	 * @param visibleText
	 */
	public void selectOptionByVisibleText(WebElement dropdownElement, String visibleText)
	{
		Select sel = new Select(dropdownElement);
		sel.selectByVisibleText(visibleText);
	}
	
	///////////////************MouseActions***************///////////////
	
	/**
	 * This is a generic method to perform mouse hovering action on webElement
	 * @param driver
	 * @param element
	 */
	public void mouseHoveringOperation(WebDriver driver, WebElement element)
	{
		Actions act = new Actions(driver);
		act.moveToElement(element).perform();
	}
	
	/**
	 * This is a generic method to perform right click action on a webElement
	 * @param driver
	 * @param element
	 */
	public void rightClickOperation(WebDriver driver, WebElement element)
	{
		Actions act = new Actions(driver);
		act.contextClick(element).perform();
	}
	
	/**
	 * This is a generic method to perform double click action on a webElement
	 * @param driver
	 * @param element
	 */
	public void doubleClickLOperation(WebDriver driver, WebElement element)
	{
		Actions act = new Actions(driver);
		act.doubleClick(element).perform();
	}
	
	/////////////**************HandlingAlert*************////////////
	
	/**
	 * This is a generic method to accept alert pop-up
	 * @param driver
	 */
	public void acceptAlert(WebDriver driver)
	{
		driver.switchTo().alert().accept();
	}
	
	/**
	 * This is a generic method to dismiss alert pop-up
	 * @param driver
	 */
	public void dismissAlert(WebDriver driver)
	{
		driver.switchTo().alert().dismiss();
	}
	
	///////////////**************HandlingFrames**********/////////////
	
	/**
	 * This is a generic method to switch to a frame using frame index
	 * @param driver
	 * @param frameIndex
	 */
	public void switchToFramesUsingFrameIndex(WebDriver driver, int frameIndex)
	{
		driver.switchTo().frame(frameIndex);
	}
	
	/////////************Taking webpage Screenshot ***********/////////////
	
	/**
	 * This is a generic method to take webpage screenshot
	 * @param driver
	 * @param screenshotName
	 * @return
	 * @throws IOException
	 */

	public String getWebpageScreenshot(WebDriver driver, String screenshotName) throws IOException
	{
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File(".\\Screenshots\\" +screenshotName+ ".png");
		Files.copy(source, destination);
		return destination.getAbsolutePath();            // used for listeners
	}
}
