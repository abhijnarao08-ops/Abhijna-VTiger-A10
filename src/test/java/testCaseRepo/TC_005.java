package testCaseRepo;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import genericUtility.BaseClass;
import objectRepo.CreateNewOrganizationPage;
import objectRepo.HomePage;
import objectRepo.OrganizationsPage;

public class TC_005 extends BaseClass
{
	@Test (groups = {"Regression"})
	public void ORG_002() throws EncryptedDocumentException, IOException, InterruptedException
	{
		HomePage hp = new HomePage(driver);
		hp.clickOnOrganisationsMenu();
		OrganizationsPage op = new OrganizationsPage(driver);
		op.clickOnCreateNewOrganizationIcon();
		String orgName = eUtil.getSingleCellDataFromExcel("Organizations", 4, 1);
		String website = eUtil.getSingleCellDataFromExcel("Organizations", 4, 2);
		String industry = eUtil.getSingleCellDataFromExcel("Organizations", 4, 3);
		String phone = eUtil.getSingleCellDataFromExcel("Organizations", 4, 4);
		int randomNum = jUtil.generateRandomNumber(1000);
		CreateNewOrganizationPage cnop = new CreateNewOrganizationPage(driver);
		cnop.createNewOrganization(orgName+randomNum, website, industry, phone);
		Thread.sleep(5000);
		
	}
}
