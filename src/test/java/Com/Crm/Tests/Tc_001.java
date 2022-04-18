package Com.Crm.Tests;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Random;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.generic.Fake_Data;
import com.generic.PropFile_Util;
import com.generic.webDriverUtils;

import Com.page.object.CreatenewOrg;
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
				Org.getorgbtn().click();

				CreatenewOrg newOrgPage = new CreatenewOrg(driver);
				String orgname=data.getOrgname();
				newOrgPage.getCreateorgname().sendKeys(orgname);

				driverUtils.selectValuefromDD(newOrgPage.getIndustrydd(), "Chemicals");
				driverUtils.selectValuefromDD(newOrgPage.getRatngdd(), "Active");
				driverUtils.selectValuefromDD(newOrgPage.getType(), "Customer");

				Org.getSaveorgbtn().click();
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
		
		
		//PropertiesFetch pf=new PropertiesFetch();
		//FileInputStream fis=new FileInputStream("C:\\Users\\Kalyankar Shashank\\eclipse-workspace\\SDET5_Shashank\\vtiger1.PROPERTIES");
		//Properties pobj=new Properties();
		//pobj.load(fis);
		
//		String url = pobj.getProperty("url");
	//	System.out.println(url);
		//String username = pobj.getProperty("username");
		//System.out.println(username);
		//String password = pobj.getProperty("password");
		//System.out.println(password);
		//System.setProperty("webdriver.chrome.driver","C:\\Shaa-Selenium\\Selenium driver\\chromedriver.exe");
		 
		//ChromeDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		//driver.get(url);
		
		//Login to vitiger 
		//Random r=new Random();
		//int x=r.nextInt(1000);
			//driver.findElement(By.name("user_name")).sendKeys("admin",Keys.TAB,"admin",Keys.TAB,Keys.ENTER);
			//driver.findElement(By.xpath("//a[text()='Organizations']")).click();
		//driver.findElement(By.cssSelector("img[title='Create Organization...']")).click();
			
			//File file= new File("./organizationsheet.xlsx");
			
			
		//	Fetching Data from excel
		
		//	FileInputStream fis1=new FileInputStream(file);
			//XSSFWorkbook workbook=new XSSFWorkbook(fis1);
			//Sheet sheet=workbook.getSheetAt(0);
			//String  cellValue=sheet.getRow(0).getCell(0).getStringCellValue();
			//System.out.println(cellValue);
			
			//driver.findElement(By.name("accountname")).sendKeys(cellValue+x);
			 //WebElement ele=driver.findElement(By.name("industry"));
			//Select s=new Select(ele);
			//s.selectByIndex(4);
			//WebElement ele1 = driver.findElement(By.name("accounttype"));
			//Select s1=new Select(ele1);
			//s1.selectByIndex(3);
			//WebElement ele2=driver.findElement(By.name("rating"));
			//Select s2=new Select(ele2);
			//s2.selectByIndex(2);
			//driver.findElement(By.name("button")).click();
			//Thread.sleep(2000);
			
			
			//validation
		
			//Logout
		//	driver.findElement(By.cssSelector("img[src=\"themes/softed/images/user.PNG\"]")).click();
			//driver.findElement(By.xpath("//a[text()='Sign Out']")).click();

}
}
