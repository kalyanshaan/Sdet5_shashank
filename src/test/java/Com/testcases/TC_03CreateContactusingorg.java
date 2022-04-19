package Com.testcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.generic.BaseClass;
import com.generic.Fake_Data;

import ObjectRepo.ContactInfopage;
import ObjectRepo.ContactOrg_popup;
import ObjectRepo.CreateContactinfopage;
import ObjectRepo.HomePage;

public class TC_03CreateContactusingorg extends BaseClass {
	@Test(groups = "integration")
	public void createcontactwithorgTest() throws InterruptedException, IOException 
	{
		HomePage homePage = new HomePage(driver);
		HomePage.getContactslink().click();

		ContactInfopage contactInfoPage = new ContactInfopage(driver);
		contactInfoPage.getCreatecontactsimg().click();

		CreateContactinfopage  contactPage = new CreateContactinfopage(driver);

		Fake_Data fake_Data = new Fake_Data();
		String contactname=fake_Data.lastname();
		contactPage.getLastNameEdt().sendKeys(contactname);

		contactPage.getOrganizationLookUpImage().click();
		// window switching

		//driverUtils.switchTowindow("Accounts");
		ContactOrg_popup org_popup = new ContactOrg_popup(driver);
		org_popup.searchandSelectforOrg("Mango");

		driverUtils.switchTowindow("Contact");

		contactPage.getSaveBtn().click();

		Thread.sleep(3000);
		homePage.getContactslink().click();

		//validation
		contactInfoPage.checkcontactcreated(contactname, "Last Name");

		Thread.sleep(3000);

		String fname=driver.findElement(By.xpath("//span[@vtfieldname='lastname']/..")).getText();
		{
			AssertJUnit.assertEquals(fname, "contactname");
		}
	}


	@Test(groups="smoke")
	public void createcontact() throws InterruptedException, IOException
	{
		HomePage homePage = new HomePage(driver);
		homePage.getContactslink().click();

		ContactInfopage contactInfoPage = new ContactInfopage(driver);
		contactInfoPage.getCreatecontactsimg().click();

		CreateContactinfopage  contactPage = new CreateContactinfopage(driver);

		Fake_Data fake_Data = new Fake_Data();
		String contactname=fake_Data.lastname();
		contactPage.getLastNameEdt().sendKeys(contactname);
		
		contactPage.getSaveBtn().click();

		Thread.sleep(3000);
		//homePage.getContactslink().click();

		contactInfoPage.checkcontactcreated(contactname, "Last Name");

		Thread.sleep(3000);

		String fname1=driver.findElement(By.xpath("//span[@vtfieldname='lastname']/..")).getText();
		{
			AssertJUnit.assertEquals(fname1, "contactname");
		}
	}

		//if(fname.equals(contactname)) {
			//System.out.println("TC Pass");
		//}
		//else {
			//System.out.println("TC Fail");
		
	
}


