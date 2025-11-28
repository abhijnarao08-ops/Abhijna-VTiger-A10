package genericUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * This is an Utility class which works with Properties file
 * @author Abhijna
 * @version 28.10.2025
 */

public class PropertiesUtility 
{
	/**
	 * This is a generic method to fetch data from Properties file
	 * @param key
	 * @return
	 * @throws IOException
	 */
	
	public String getDataFromProperties(String key) throws IOException
	{
		//FileInputStream fis = new FileInputStream("D:\\Abhijna\\TestData.properties");
		FileInputStream fis = new FileInputStream(IpathUtility.propertiesPath);
		Properties prop = new Properties();
		prop.load(fis);
		String value = prop.getProperty(key);
		return value;
	}
	
}
