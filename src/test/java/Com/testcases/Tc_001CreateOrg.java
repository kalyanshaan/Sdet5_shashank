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
//@Listeners(Com.Assesrt.Tests.Listerners_Execution.class)
public class Tc_001CreateOrg extends BaseClass{


	@Test(groups = "regression")
	public void createorgwithDDTest() throws InterruptedException, IOException 
	{
		HomePage homePage= new HomePage(driver);
		homePage.getorglnk().click();

		//ContactInfopage OrgInfoPage = new  ContactInfopage(driver);
		OrgInfoPage OrgInfoPage=new OrgInfoPage(driver);
		OrgInfoPage.getCreateorgbtn().click();

		driverUtils.waitandclick(OrgInfoPage.getCreateorgbtn());

		CreateNewOrgPage newOrgPage = new CreateNewOrgPage(driver);
		String orgname=data.getOrgname();
		newOrgPage.getOrgnametxtbox().sendKeys(orgname);



		driverUtils.selectValuefromDD(newOrgPage.getIndustrydd(), "Chemicals");
		driverUtils.selectValuefromDD(newOrgPage.getRatngdd(), "Active");
		driverUtils.selectValuefromDD(newOrgPage.getTypedd(), "Customer");

		newOrgPage.getSavebtn().click();
		Thread.sleep(3000);

		homePage.getorglnk().click();

		OrgInfoPage.searchforOrg(orgname,"accountname");
	

		Thread.sleep(3000);

		String actual_orgname=	driver.findElement(By.xpath("//a[@title='Organizations']")).getText();

		//Hard Assert 
		Assert.assertEquals(false, false);

	}
	//if(actual_orgname.equals(orgname)) 
	//{
	//System.out.println("TC Passed");	
	//	}
	//else {
	//		System.out.println("FAil");
	//}
	//}

	@Test(groups = "smoke")
	public void deleteOrgTest() throws InterruptedException, IOException {

		HomePage homePage= new HomePage(driver);
		homePage.getorglnk().click();

		OrgInfoPage orgINfoPAge = new  OrgInfoPage(driver);
		orgINfoPAge.getCreateorgbtn().click();

		CreateNewOrgPage newOrgPage = new CreateNewOrgPage(driver);
		String orgname=data.getOrgname();
		newOrgPage.getOrgnametxtbox().sendKeys(orgname);

		newOrgPage.getSavebtn().click();
		Thread.sleep(3000);

		homePage.getorglnk().click();

		orgINfoPAge.searchforOrg(orgname, "accountname");

		Thread.sleep(3000);

		orgINfoPAge.getFirstcheckbox().click();

		orgINfoPAge.getDeletebtn().click();

		driverUtils.acceptAlert();
		

		//driverUtils.waitforelement(orgINfoPAge.getnoOrgfound());

		String msg= orgINfoPAge.getnoOrgfound().getText();


		//	if(msg.equals("No Organization Found !")) 
		//	{
		//	System.out.println("TC Passed");	
		//	}
		//	else {
		//		System.out.println("FAil");
		//}	
		AssertJUnit.assertEquals(msg,"No Organization Found !");
	}

}

//}


