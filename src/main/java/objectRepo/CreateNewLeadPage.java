package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericUtility.SeleniumUtility;

public class CreateNewLeadPage 
{
	@FindBy(xpath = "//input[@name = 'firstname']")
	private WebElement firstNameTextField ; 
	
	@FindBy(xpath = "//input[@name = 'lastname']")
	private WebElement lastNameTextField ; 
	
	@FindBy(xpath = "//input[@name = 'company']")
	private WebElement companyTextField ;
	
	@FindBy(xpath = "//input[@name = 'designation']")
	private WebElement titleTextField ;
	
	@FindBy(xpath = "//select[@name = 'leadsource']")
	private WebElement leadSourceDropdown ;
	
	@FindBy(xpath = "//input[@name = 'mobile']")
	private WebElement mobileTextField ;
	
	@FindBy(xpath = "//input[@name = 'noofemployees']")
	private WebElement noOfEmployeesTextField ;
	
	@FindBy(xpath = "//input[@name = 'city']")
	private WebElement cityTextField ;
	
	@FindBy(xpath = "//input[@name = 'state']")
	private WebElement stateTextField ;
	
	@FindBy(xpath = "//input[@name = 'country']")
	private WebElement countryTextField ;
	
	@FindBy(xpath = "//input[@title = 'Save [Alt+S]']")
	private WebElement saveButton ;
	
	// initializing the WebElements
	
	public CreateNewLeadPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	// public getter methods
	
	public WebElement getFirstNameTextField() 
	{
		return firstNameTextField;
	}

	public WebElement getLastNameTextField() 
	{
		return lastNameTextField;
	}

	public WebElement getCompanyTextField() 
	{
		return companyTextField;
	}

	public WebElement getTitleTextField() 
	{
		return titleTextField;
	}

	public WebElement getLeadSourceDropdown() 
	{
		return leadSourceDropdown;
	}

	public WebElement getMobileTextField() 
	{
		return mobileTextField;
	}

	public WebElement getNoOfEmployeesTextField() 
	{
		return noOfEmployeesTextField;
	}

	public WebElement getCityTextField() 
	{
		return cityTextField;
	}

	public WebElement getStateTextField() 
	{
		return stateTextField;
	}

	public WebElement getCountryTextField() 
	{
		return countryTextField;
	}

	public WebElement getSaveButton() 
	{
		return saveButton;
	}
	
	
	public void createNewLead(String firstName, String lastName, String company)
	{
		getFirstNameTextField().sendKeys(firstName);
		getLastNameTextField().sendKeys(lastName);
		getCompanyTextField().sendKeys(company);
		getSaveButton().click();
	}
	
	/**
	 * This is a business library to create new lead
	 * @param lastName
	 * @param company
	 * @param title
	 * @param leadSource
	 * @param mobile
	 */
	public void createNewLead(String lastName, String company, String title, String leadSource, String mobile)
	{
		getLastNameTextField().sendKeys(lastName);
		getCompanyTextField().sendKeys(company);
		getTitleTextField().sendKeys(title);
		SeleniumUtility sUtil = new SeleniumUtility();
		sUtil.selectOptionByValue(getLeadSourceDropdown(), leadSource);
		getMobileTextField().sendKeys(mobile);
		getSaveButton().click();
	}
	
	/**
	 * This is a business library to create new lead 
	 * @param lastName
	 * @param company
	 * @param title
	 * @param mobile
	 * @param noOfEmployees
	 * @param city
	 * @param state
	 * @param country
	 */
	public void createNewLead(String lastName, String company, String title, String mobile, String noOfEmployees, String city, String state, String country)
	{
		getLastNameTextField().sendKeys(lastName);
		getCompanyTextField().sendKeys(company);
		getTitleTextField().sendKeys(title);
		getMobileTextField().sendKeys(mobile);
		getNoOfEmployeesTextField().sendKeys(noOfEmployees);
		getCityTextField().sendKeys(city);
		getStateTextField().sendKeys(state);
		getCountryTextField().sendKeys(country);
		getSaveButton().click();
	}
}
