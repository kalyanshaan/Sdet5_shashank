package Com.testcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.generic.BaseClass;

import ObjectRepo.CreateNewOrgPage;
import ObjectRepo.HomePage;
import ObjectRepo.OrgInfoPage;

public class TC_002CreateOrgtest extends BaseClass {
	@Test(groups = "smoke")
	public void createorgTest() throws InterruptedException, IOException
	{
		HomePage homePage= new HomePage(driver);
		homePage.getorglnk().click();
		//Create New Organisation
		OrgInfoPage orgINfoPAge = new  OrgInfoPage(driver);
		orgINfoPAge.getCreateorgbtn().click();

		CreateNewOrgPage newOrgPage = new CreateNewOrgPage(driver);
		String orgname=data.getOrgname();
		newOrgPage.getOrgnametxtbox().sendKeys(orgname);

		newOrgPage.getSavebtn().click();
		Thread.sleep(3000);

		homePage.getorglnk().click();

		orgINfoPAge.searchforOrg(orgname, "accountname");

		String actual_orgname=	driver.findElement(By.xpath("//a[@title='Organizations']")).getText();
		{
			AssertJUnit.assertEquals(actual_orgname, "tyss");

		//if(actual_orgname.equals(orgname)) 
		//{
		//	System.out.println("TC Passed");	
		//}
		//else {
		//	System.out.println("FAil");
		}	

	}

	@Test(groups = "integration")
	public void createorgwithmobilenoTest() throws InterruptedException, IOException 
	{
		HomePage homePage= new HomePage(driver);
		homePage.getorglnk().click();
		//Create New Organisation
		OrgInfoPage orgINfoPAge = new  OrgInfoPage(driver);
		orgINfoPAge.getCreateorgbtn().click();

		CreateNewOrgPage newOrgPage = new CreateNewOrgPage(driver);
		String orgname=data.getOrgname();
		newOrgPage.getOrgnametxtbox().sendKeys(orgname);

		newOrgPage.getPhonenotxtbox().sendKeys(data.phonenumber());

		newOrgPage.getSavebtn().click();
		Thread.sleep(3000);

		homePage.getorglnk().click();

		orgINfoPAge.searchforOrg(orgname, "accountname");

		String actual_orgname=	driver.findElement(By.xpath("//a[@title='Organizations']")).getText();
		{
			Assert.assertEquals(actual_orgname, orgname);

		}
	
	}

}


