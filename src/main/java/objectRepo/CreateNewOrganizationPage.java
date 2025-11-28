package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericUtility.SeleniumUtility;

/**
 * This is a Creating New Organization Page POM class
 */
public class CreateNewOrganizationPage 
{
	@FindBy(xpath = "//input[@name = 'accountname']")
	private WebElement organizationTextField;
	
	@FindBy(xpath = "//input[@name ='website']")
	private WebElement websiteTextField;
	
	@FindBy(xpath = "//input[@name = 'employees']")
	private WebElement employeesTextField;
	
	@FindBy(xpath = "//select[@name ='industry']")
	private WebElement industryDropdown;
	
	@FindBy(xpath = "//input[@name = 'phone']")
	private WebElement phoneTextField;
	
	@FindBy(xpath = "//input[@name = 'email1']")
	private WebElement emailTextField;
	
	@FindBy(xpath = "//input[@name = 'ship_city']")
	private WebElement shippingCityTextField;
	
	@FindBy(xpath = "//input[@name = 'ship_state']")
	private WebElement shippingStateTextField;
	
	@FindBy(xpath = "//input[@name = 'ship_country']")
	private WebElement shippingCountryTextField;
	
	@FindBy(xpath = "//input[@title = 'Save [Alt+S]']")
	private WebElement saveButton;
	
	// initializing the WebElement
	public CreateNewOrganizationPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	// public getter methods
	
	public WebElement getOrganizationTextField() 
	{
		return organizationTextField;
	}

	public WebElement getWebsiteTextField() 
	{
		return websiteTextField;
	}

	public WebElement getEmployeesTextField() 
	{
		return employeesTextField;
	}

	public WebElement getIndustryDropdown() 
	{
		return industryDropdown;
	}

	public WebElement getPhoneTextField() 
	{
		return phoneTextField;
	}

	public WebElement getEmailTextField() 
	{
		return emailTextField;
	}

	public WebElement getShippingCityTextField() 
	{
		return shippingCityTextField;
	}

	public WebElement getShippingStateTextField() 
	{
		return shippingStateTextField;
	}

	public WebElement getShippingCountryTextField() 
	{
		return shippingCountryTextField;
	}

	public WebElement getSaveButton() 
	{
		return saveButton;
	}
	
	// utilizing the WebElements
	/**
	 * This is a business library to create new organization
	 * @param orgName
	 * @param website
	 * @param employees
	 */
	public void createNewOrganization(String orgName, String website, String employees)
	{
		getOrganizationTextField().sendKeys(orgName);
		getWebsiteTextField().sendKeys(website);
		getEmployeesTextField().sendKeys(employees);
		getSaveButton().click();
	}
	
	/**
	 * This is a business library to create new organization
	 * @param orgName
	 * @param website
	 * @param industry
	 * @param mobile
	 */
	public void createNewOrganization(String orgName, String website, String industry, String mobile)
	{
		getOrganizationTextField().sendKeys(orgName);
		getWebsiteTextField().sendKeys(website);
		SeleniumUtility sUtil = new SeleniumUtility();
		sUtil.selectOptionByValue(getIndustryDropdown(), industry);
		getPhoneTextField().sendKeys(mobile);
		getSaveButton().click();
	}
	
	/**
	 * This is a business library to create new organization
	 * @param orgName
	 * @param website
	 * @param mobile
	 * @param email
	 * @param shipCity
	 * @param shipState
	 * @param shipCountry
	 */
	public void createNewOrganization(String orgName, String website, String mobile, String email, String shipCity, String shipState, String shipCountry)
	{
		getOrganizationTextField().sendKeys(orgName);
		getWebsiteTextField().sendKeys(website);
		getPhoneTextField().sendKeys(mobile);
		getEmailTextField().sendKeys(email);
		getShippingCityTextField().sendKeys(shipCity);
		getShippingStateTextField().sendKeys(shipState);
		getShippingCountryTextField().sendKeys(shipCountry);
		getSaveButton().click();
	}
}
