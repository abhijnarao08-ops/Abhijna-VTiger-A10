package practice;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import genericUtility.PropertiesUtility;

public class FetchingDataFromPropertiesFile 
{

	public static void main(String[] args) throws IOException, InterruptedException
	{
//		FileInputStream fis = new FileInputStream("D:\\Abhijna\\TestData.properties");
//		Properties prop = new Properties();
//		prop.load(fis);
//		String Url = prop.getProperty("url");
//		String UN = prop.getProperty("username");
//		String pwd = prop.getProperty("password");
		PropertiesUtility pUtil = new PropertiesUtility();
		String URL = pUtil.getDataFromProperties("url");
		String UN = pUtil.getDataFromProperties("username");
		String pwd = pUtil.getDataFromProperties("password");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(10000);
		driver.get(URL);
		WebElement username = driver.findElement(By.xpath("//input[@name = 'username']"));
		username.sendKeys(UN);
		Thread.sleep(3000);
		WebElement password = driver.findElement(By.xpath("//input[@name = 'password']"));
		password.sendKeys(pwd);
		System.out.println(URL);
		System.out.println(UN);
		System.out.println(pwd);
		
		
		
		

	}

}
