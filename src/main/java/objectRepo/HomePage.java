package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericUtility.SeleniumUtility;

/**
 * This is a HomePage POM class
 * @author Abhijna
 * @version 04.11.2025
 */
public class HomePage 
{
	// locating the WebElements
	
	@FindBy(xpath = "//a[text() = 'Leads'][1]") // or @FindBy(xpath = "//td[@class = 'tabUnSelected']/a[text() = 'Leads']")
	private WebElement leadsButton;
	
	@FindBy(xpath = "//td[@align = 'center']/a[text() = 'Organizations']")
	private WebElement organisationsButton;
	
	@FindBy(xpath = "//td/img[@style = 'padding: 0px;padding-left:5px']") // or FindBy(xpath = "//img[@src= 'themes/softed/images/user.PNG']")
	private WebElement imageIconButton;
	
	@FindBy(xpath = "//a[text() = 'Sign Out']")
	private WebElement signOutButton;
	
	// initializing the WebElements
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	// public getter methods
	
	public WebElement getLeadsButton() 
	{
		return leadsButton;
	}

	public WebElement getOrganisationsButton() 
	{
		return organisationsButton;
	}

	public WebElement getImageIconButton() 
	{
		return imageIconButton;
	}

	public WebElement getSignOutButton() 
	{
		return signOutButton;
	}
	
	
	/**
	 * This is a business library to click on Leads menu
	 */
	public void clickOnLeadsMenu()
	{
		getLeadsButton().click();
		
	}
	
	/**
	 * This is a business library to click on Organisations menu
	 */
	public void clickOnOrganisationsMenu()
	{
		getOrganisationsButton().click();
		
	}

	/**
	 * This is a business library to click on signOut
	 * @param driver
	 */
	public void signOutOperations(WebDriver driver)
	{
		SeleniumUtility sUtil = new SeleniumUtility();
		sUtil.mouseHoveringOperation(driver, getImageIconButton());
		getSignOutButton().click();
		
	}
	
	
}
