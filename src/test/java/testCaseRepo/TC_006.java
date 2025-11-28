package testCaseRepo;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import genericUtility.BaseClass;
import objectRepo.CreateNewOrganizationPage;
import objectRepo.HomePage;
import objectRepo.OrganizationsPage;

public class TC_006 extends BaseClass
{
	@Test (groups = {"Smoke"})
	public void ORG_003() throws EncryptedDocumentException, IOException, InterruptedException
	{
		HomePage hp = new HomePage(driver);
		hp.clickOnOrganisationsMenu();
		OrganizationsPage op = new OrganizationsPage(driver);
		op.clickOnCreateNewOrganizationIcon();
		String orgName = eUtil.getSingleCellDataFromExcel("Organizations", 8, 1);
		String website = eUtil.getSingleCellDataFromExcel("Organizations", 8, 2);
		String phone = eUtil.getSingleCellDataFromExcel("Organizations", 8, 3);
		String email = eUtil.getSingleCellDataFromExcel("Organizations", 8, 4);
		String shipCity = eUtil.getSingleCellDataFromExcel("Organizations", 8, 5);
		String shipState = eUtil.getSingleCellDataFromExcel("Organizations", 8, 6);
		String shipCountry = eUtil.getSingleCellDataFromExcel("Organizations", 8, 7);
		int randomNum = jUtil.generateRandomNumber(1000);
		CreateNewOrganizationPage cnop = new CreateNewOrganizationPage(driver);
		cnop.createNewOrganization(orgName+randomNum, website, phone, email, shipCity, shipState, shipCountry);
		Thread.sleep(5000);
	}
}
