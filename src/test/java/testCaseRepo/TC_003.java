package testCaseRepo;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import genericUtility.BaseClass;
import objectRepo.CreateNewLeadPage;
import objectRepo.HomePage;
import objectRepo.LeadsPage;

public class TC_003 extends BaseClass
{
	@Test(groups = {"Smoke"})
	
	public void LE_003() throws EncryptedDocumentException, IOException
	{
		HomePage hp = new HomePage(driver);
		hp.clickOnLeadsMenu();
		LeadsPage lp = new LeadsPage(driver);
		lp.clickOnCreateNewLeadIcon();
		String lName = eUtil.getSingleCellDataFromExcel("Leads", 7, 1);
		String company = eUtil.getSingleCellDataFromExcel("Leads", 7, 2);
		String title = eUtil.getSingleCellDataFromExcel("Leads", 7, 3);
		String noOfEmp = eUtil.getSingleCellDataFromExcel("Leads", 7, 4);
		String mobile = eUtil.getSingleCellDataFromExcel("Leads", 7, 5);
		String city = eUtil.getSingleCellDataFromExcel("Leads", 7, 6);
		String state = eUtil.getSingleCellDataFromExcel("Leads", 7, 7);
		String country = eUtil.getSingleCellDataFromExcel("Leads", 7, 8);
		CreateNewLeadPage cnlp = new CreateNewLeadPage(driver);
		cnlp.createNewLead(lName, company, title, mobile, noOfEmp, city, state, country);
	
	}
	
	/**
	 * this method is to execute maven command mvn -Dtest=className#methodName im command prompt ( method level execution)
	 * mvn -Dtest=className test is for class level execution
	 */
//	@Test
//	public void m1()
//	{
//		System.out.println("Abhijna");
//	}
}
