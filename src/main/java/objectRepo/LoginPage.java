package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * This is a LoginPage POM class
 * @author Abhijna
 * @version 04.11.2025
 */
public class LoginPage 
{
	// Locating WebElements
	@FindBy(xpath = "//input[@name = 'user_name']")
	private WebElement usernameTextField;
	
	@FindBy(name = "user_password")
	private WebElement passwordTextField;
	
	@FindBy(id = "submitButton")
	private WebElement loginButton;
	
	// initializing the WebElements
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	// public getter methods
	
	public WebElement getUsernameTextField() 
	{
		return usernameTextField;
	}

	public WebElement getPasswordTextField() 
	{
		return passwordTextField;
	}

	public WebElement getLoginButton() 
	{
		return loginButton;
	}
	
	// utilizing the WebElements
	
	/**
	 * This is a business library to perform login operation to the web application
	 * @param UN
	 * @param PWD
	 */
	public void loginToApplication(String UN, String PWD)
	{
		getUsernameTextField().sendKeys(UN);
		getPasswordTextField().sendKeys(PWD);
		getLoginButton().click();
		
	}
	
}
