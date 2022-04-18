package Com.Crm.Tests.Ts;


import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.generic.Fake_Data;
import com.generic.PropFile_Util;
import com.generic.webDriverUtils;

import Com.page.object.CreateNewOrgPage;
import Com.page.object.OrgINfoPAge;
import Com.page.object.HomePage;
import Com.page.object.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Tc_001 {

	public static void main(String[] args) throws IOException, Exception{
		
		//login vtigercrm
				Fake_Data data= new Fake_Data();
				WebDriverManager.chromedriver().setup();
				WebDriver driver=new ChromeDriver();
				webDriverUtils driverUtils = new webDriverUtils(driver);
				LoginPage loginPage = new LoginPage(driver);

				driverUtils.pageloadtimeout();
				
				PropFile_Util propFile_Util = new PropFile_Util();
				driver.get(propFile_Util.readdatafrompropfile("url"));

				driverUtils.maximisewindow();

				loginPage.loginToApp();

				HomePage homePage = new HomePage(driver);
				homePage.getorglnk().click();

				OrgINfoPAge Org = new  OrgINfoPAge(driver);
				Org.getCreateorgbtn().click();

				CreateNewOrgPage newOrgPage = new CreateNewOrgPage(driver);
				String orgname=data.getOrgname();
				newOrgPage.getOrgnametxtbox().sendKeys(orgname);

				driverUtils.selectValuefromDD(newOrgPage.getIndustrydd(), "Chemicals");
				driverUtils.selectValuefromDD(newOrgPage.getRatngdd(), "Active");
				driverUtils.selectValuefromDD(newOrgPage.getTypedd(), "Customer");

				Org.getCreateorgbtn().click();
				Thread.sleep(3000);

				homePage.getorglnk().click();
				
				Org.searchforOrg(orgname, "accountname");
				
				Thread.sleep(3000);


				String actual_orgname=	driver.findElement(By.xpath("//a[@title='Organizations']")).getText();

				if(actual_orgname.equals(orgname)) 
				{
					System.out.println("TC Passed");	
				}
				else {
					System.out.println("FAil");
				}	

				//logout vtigercrm

				homePage.logoutfromApp();
				
				driverUtils.closeBrowser();
		
	
}
}
