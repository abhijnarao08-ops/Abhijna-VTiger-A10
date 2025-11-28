package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * This is a Leads page POM class
 * @author Abhijna
 * @version 05.11.2025
 */
public class LeadsPage 
{
	// locating the web elements
	
	@FindBy(xpath = "//img[@title = 'Create Lead...']")
	private WebElement createNewLeadIcon ;
	
	// initialising the web element
	public LeadsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	// public getter methods
	
	public WebElement getCreateNewLeadIcon() 
	{
		return createNewLeadIcon;
	}
	
	// utilizing the webElement
	/**
	 * This is a business library to click on create new lead icon
	 */
	public void clickOnCreateNewLeadIcon()
	{
		getCreateNewLeadIcon().click();
	}
	
}
