package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationsPage 
{
	@FindBy(xpath = "//img[@alt = 'Create Organization...']")
	private WebElement createNewOrganizationIcon;
	
	// initializing the web element
	public OrganizationsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	//public getter methods
	public WebElement getCreateNewOrganizationIcon() 
	{
		return createNewOrganizationIcon;
	}
	
	// utilizing the webElement
	 public void clickOnCreateNewOrganizationIcon()
	 {
		 getCreateNewOrganizationIcon().click();
	 }
	
}
