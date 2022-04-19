package Com.Crm.Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.generic.Fake_Data;
import com.generic.PropFile_Util;
import com.generic.webDriverUtils;

import ObjectRepo.HomePage;
import ObjectRepo.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Tc_002 {

	public static void main(String[] args) throws Throwable {
		//login vtigercrm
				PropFile_Util propFile_Util = new PropFile_Util();
				Fake_Data data= new Fake_Data();
				
				
				System.setProperty("webdriver.chrome.driver","C:\\Shaa-Selenium\\Selenium driver\\chromedriver.exe");
				 
				
				
				WebDriverManager.chromedriver().setup();
				WebDriver driver1=new ChromeDriver();
				webDriverUtils driverUtils = new webDriverUtils(driver1);
				driverUtils.pageloadtimeout();
				driverUtils.maximisewindow();
				
				driver1.get(propFile_Util.readdatafrompropfile("url"));
				//importing login page from com.page.object pkg
				LoginPage lp=new LoginPage(driver1);
				lp.loginToApp();
				
				//Login to vitiger 
				//Random r=new Random();
				//int x=r.nextInt(1000);
				//Importing from homepage com.page.object
				HomePage hp=new HomePage(driver1);
				hp.getorglnk().click();
				
				
				
//				//Create new  Organization
//				OrgINfoPAge organiazation=new OrgINfoPAge(driver1);
//				organiazation.getorgbtn().click();
//				
//				CreatenewOrg newOrgPage= new CreatenewOrg(driver1);
////				String orgname=data.getOrgname();
//				newOrgPage.getCreateorgbtn().sendKeys(orgname);
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
//					//driver1.findElement(By.name("user_name")).sendKeys(propFile_Util.readdatafrompropfile("username"));
//					//driver1.findElement(By.name("user_password")).sendKeys(propFile_Util.readdatafrompropfile("password"));
//					//driver1.findElement(By.id("submitButton")).click();
//				//	driver1.findElement(By.xpath("//a[text()='Organizations']")).click();
//			//	driver1.findElement(By.cssSelector("img[title='Create Organization...']")).click();
//					
//					//File file= new File("./organizationsheet.xlsx");
//					
//					
//				//	Fetching Data from excel
//				
//					//FileInputStream fis1=new FileInputStream(file);
//					//XSSFWorkbook workbook=new XSSFWorkbook(fis1);
//					//Sheet sheet=workbook.getSheetAt(0);
//				//	String  cellValue=sheet.getRow(0).getCell(0).getStringCellValue();
//					//System.out.println(cellValue);
//					
//					//driver1.findElement(By.name("accountname")).sendKeys(cellValue+x);
//					// WebElement industry=driver1.findElement(By.name("industry"));
//					 //driverUtils.selectValuefromDD(industry, "Chemicals");
//					 
//				//	WebElement acct = driver1.findElement(By.name("accounttype"));
//					//driverUtils.selectValuefromDD(acct, "Active");
//					
//					//WebElement ert=driver1.findElement(By.name("rating"));
//					//driverUtils.selectValuefromDD(ert, "Customer");
//					
//					//driver1.findElement(By.name("button")).click();
//					//Thread.sleep(2000);
//					
//					//Search for Organization & validation
//				//	driver1.findElement(By.xpath("//a[text()='Organizations']")).click();
//				//	driver1.findElement(By.className("txtBox")).sendKeys(cellValue);
//				//	WebElement ele3=driver1.findElement(By.id("bas_searchfield"));
//				//	ele3.click();
//				//driverUtils.selectValuefromDD(ele3, "Accountname");
//				//	driver1.findElement(By.name("submit")).click();
//				//Thread.sleep(3000);
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
//					//Logout
//					//logout vtigercrm
//				//	WebElement ele5=driver1.findElement(By.xpath("(//td[@class='small'])[2]"));
//					//driverUtils.movetoElement(ele5);
//					//WebElement ele6=driver1.findElement(By.xpath("//a[text()='Sign Out']"));
//					//driverUtils.movetoElement(ele6);
//					//ele6.click();
//					//Thread.sleep(8000);
//					//driverUtils.closeBrowser();
//						hp.getLogoutimg();
//						driverUtils.closeBrowser();
	}

}
