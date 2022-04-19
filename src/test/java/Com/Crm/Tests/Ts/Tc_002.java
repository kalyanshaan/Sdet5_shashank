package Com.Crm.Tests.Ts;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.generic.Fake_Data;
import com.generic.PropFile_Util;
import com.generic.webDriverUtils;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tc_002 {

	public static void main(String[] args) throws Throwable {
//		//login vtigercrm
//				PropFile_Util propFile_Util = new PropFile_Util();
//				Fake_Data data= new Fake_Data();
//				
//				
//				System.setProperty("webdriver.chrome.driver","C:\\Shaa-Selenium\\Selenium driver\\chromedriver.exe");
//				 
//				
//				
//				WebDriverManager.chromedriver().setup();
//				WebDriver driver1=new ChromeDriver();
//				webDriverUtils driverUtils = new webDriverUtils(driver1);
//				driverUtils.pageloadtimeout();
//				driverUtils.maximisewindow();
//				
//				driver1.get(propFile_Util.readdatafrompropfile("url"));
//				//importing login page from com.page.object pkg
//				LoginPage lp=new LoginPage(driver1);
//				lp.loginToApp();
//				
//				//Login to vitiger 
//				//Random r=new Random();
//				//int x=r.nextInt(1000);
//				//Importing from homepage com.page.object
//				HomePage hp=new HomePage(driver1);
//				hp.getorglnk().click();
//				
//				
//				
//				//Create new  Organization
//				OrgINfoPAge organiazation=new OrgINfoPAge(driver1);
//				organiazation.getCreateorgbtn().click();
//				
//				CreateNewOrgPage newOrgPage= new CreateNewOrgPage(driver1);
//				String orgname=data.getOrgname();
//				newOrgPage.getOrgnametxtbox().sendKeys(orgname);
//				
//				newOrgPage.getSavebtn().click();
//				Thread.sleep(3000);
//				
//				hp.getorglnk().click();
//				
//				
//				organiazation.searchforOrg(orgname, "accountname");
//				
//				
//				
//					
//					
//					String actual_orgname=driver1.findElement(By.xpath("//a[@title='Organizations']")).getText();
//					
//					if(actual_orgname.equals(orgname))
//					{
//						System.out.println("Tc Passed");
//					}
//					else
//					{
//						System.out.println("Fail");
//					}
//					
//					
//						hp.getLogoutimg();
//						driverUtils.closeBrowser();
	}

}
