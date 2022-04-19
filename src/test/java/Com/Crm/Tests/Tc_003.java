package Com.Crm.Tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Random;
import java.util.Set;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;

import com.generic.Fake_Data;
import com.generic.PropFile_Util;
import com.generic.webDriverUtils;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Tc_003 {

	private static final Object Ramesh = null;

	public static void main(String[] args) throws Throwable {
//		PropFile_Util propFile_Util = new PropFile_Util();
//		Fake_Data data= new Fake_Data();
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver=new ChromeDriver();
//		
//		
//		//System.setProperty("webdriver.chrome.driver","C:\\Shaa-Selenium\\Selenium driver\\chromedriver.exe");
//		 
//	
//		webDriverUtils driverUtils = new webDriverUtils(driver);
//		LoginPage lp=new LoginPage(driver);
//		driverUtils.pageloadtimeout();
//		driverUtils.maximisewindow();
//		driver.manage().window().maximize();
//		driver.get(propFile_Util.readdatafrompropfile("url"));
//		
//		//Login to vitiger 
//		//Random r=new Random();
//		//int x=r.nextInt(1000);
//			//driver.findElement(By.name("user_name")).sendKeys(propFile_Util.readdatafrompropfile("username"));
//			//river.findElement(By.name("user_password")).sendKeys(propFile_Util.readdatafrompropfile("password"));
//			//driver.findElement(By.id("submitButton")).click();
//		//System.setProperty("webdriver.chrome.driver","C:\\Shaa-Selenium\\Selenium driver\\chromedriver.exe");
//		
//		
//		lp.loginToApp();
//		
//		HomePage hp=new HomePage(driver);
//		hp.getorglnk().click();
//		
//		
//		
//		
//		//Creating contacts
//		//driver.findElement(By.xpath("//a[text()='Contacts']")).click();
//		//driver.findElement(By.cssSelector("img[title='Create Contact...']")).click();
//		//WebElement ele=driver.findElement(By.name("salutationtype"));
//		CreateContactinfopage contact=new CreateContactinfopage(driver);
//		contact.getContacttab().click();
//		
//		CreateNewContacts newcontact=new CreateNewContacts(driver);
//		
//		
//		Fake_Data fakedata= new Fake_Data();
//		
//		
//		String contactname=fakedata.lastname();
//		newcontact.getLastnameclick().sendKeys(contactname);
//		
//		newcontact.getOrganization().click();
//		
//	//	Select s=new Select(ele);
//		//s.selectByIndex(1);
//		
//		//driver.findElement(By.name("firstname")).sendKeys("Ramesh");
//		//driver.findElement(By.name("lastname")).sendKeys("kapoor");
//		//driver.findElement(By.cssSelector("img[title='Select']")).click();
//		
//		//String mainID = driver.getWindowHandle();
//	//Set<String>allID=driver.getWindowHandles();
//	//for(String i:allID) {
//		//if(!mainID.equals(i))
//		//{
//			//driver.switchTo().window(i);
//			
//	//	}
//		
//	
//	//}
//	//driver.findElement(By.id("search_txt")).sendKeys("Organization Name:265");
//	//driver.findElement(By.name("search")).click();
//	//driver.findElement(By.xpath("//a[text()='Organization Name:265']")).click();
//	//driver.switchTo().window(mainID);
//	//driver.findElement(By.name("button")).click();
//	//Thread.sleep(3000);
//	//
//	//driver.findElement(By.xpath("//a[text()='Contacts']")).click();
//	//driver.findElement(By.name("search_text")).sendKeys("Ramesh");
//	//WebElement ele1=driver.findElement(By.id("bas_searchfield"));
//	//Select s1=new Select(ele1);
//	//s1.selectByIndex(1);
//	//river.findElement(By.name("submit")).click();
//		
//		//windows switching
//		driverUtils.switchTowindow("Accounts");
//		Contactpopup orgpopup=new Contactpopup();
//		orgpopup.searchandSelectforOrg(contactname);
//		
//		driverUtils.switchTowindow("Contact");
//		CreateNewContacts.getSaveBtn().click();
//		Thread.sleep(3000);
//		HomePage.getContactslink().click();
//		
//	CreateContactinfopage contactsinfo = new CreateContactinfopage(driver);
//		//validation
//		contactsinfo.checkcontactcreated(contactname, "lastName");
//		
//	//String actual_contact=driver.findElement(By.xpath("//a[@title='Contacts']")).getText();
//		String fname=driver.findElement(By.xpath("//span[@vtfieldname='lastname']/..")).getText();
//
//	
//	
//	//Object Ramesh = null;
//	if(fname.equals(Ramesh)) 
//	{
//		System.out.println("Tc Passed");
//		
//	}
//	else
//	{
//		System.out.println("Fail");
//	}
//	
//	//logout vtigercrm
//
//	hp.getLogoutimg();
//	driverUtils.closeBrowser();

			
	
	}

}

