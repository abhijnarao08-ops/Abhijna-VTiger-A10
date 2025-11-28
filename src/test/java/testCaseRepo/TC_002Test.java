package testCaseRepo;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import genericUtility.BaseClass;
import objectRepo.CreateNewLeadPage;
import objectRepo.HomePage;
import objectRepo.LeadsPage;

public class TC_002Test extends BaseClass
{
	@Test (groups = {"Regression"})
	public void LE_002() throws EncryptedDocumentException, IOException
	{
		HomePage hp = new HomePage(driver);
		hp.clickOnLeadsMenu();
		LeadsPage lp = new LeadsPage(driver);
		lp.clickOnCreateNewLeadIcon();
		String lName = eUtil.getSingleCellDataFromExcel("Leads", 4, 1);
		String company = eUtil.getSingleCellDataFromExcel("Leads", 4, 2);
		String title = eUtil.getSingleCellDataFromExcel("Leads", 4, 3);
		String leadSource = eUtil.getSingleCellDataFromExcel("Leads", 4, 4);
		String mobile = eUtil.getSingleCellDataFromExcel("Leads", 4, 5);
		CreateNewLeadPage cnlp = new CreateNewLeadPage(driver);
		cnlp.createNewLead(lName, company, title, leadSource, mobile);
		
	}
}
