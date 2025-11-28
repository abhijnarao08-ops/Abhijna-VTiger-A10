package genericUtility;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;
/**
 * This is an utility class which has functionalities present in Java library
 * @author Abhijna
 * @version 03.11.2025
 */
public class JavaUtility 
{
	/**
	 * This is a generic method to fetch Calendar details
	 * @param pattern
	 * @return
	 */
	public String getCalendarDetails(String pattern)
	{
		Calendar cal = Calendar.getInstance();
		Date d = cal.getTime();
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		String value = sdf.format(d);
		return value;
	}
	
	/**
	 * This is a generic method to generate random number
	 * @param boundary
	 * @return
	 */
	
	public int generateRandomNumber(int boundary)
	{
		Random r = new Random();
		int num = r.nextInt(boundary);
		return num;
	}
}
