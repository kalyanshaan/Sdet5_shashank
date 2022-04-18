package com.generic;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import ObjectRepo.HomePage;
import ObjectRepo.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;


public class BaseClass{
	
	
	    public WebDriver driver;
		public Fake_Data data= new Fake_Data();
		public webDriverUtils driverUtils;
		public static WebDriver sdriver;
		public HomePage homePage;
		PropFile_Util propFile_Util = new PropFile_Util();
		
		
		@BeforeSuite
		public void bs() throws IOException
		{
			System.out.println("Connection to DB");
		}

		@AfterSuite
		public void afterSuite()throws IOException
		{
			System.out.println("Dis-Connect from DB");
		}
		//@Parameters("BROWSER")
		@BeforeClass
		public void beforeclass() throws IOException
		{
			String BROWSER=propFile_Util.readdatafrompropfile("browser");
			if(BROWSER.equalsIgnoreCase("chrome")) {
				WebDriverManager.chromedriver().setup();
				driver=new ChromeDriver();
			}
			
			else if (BROWSER.equalsIgnoreCase("firefox")) {
				WebDriverManager.firefoxdriver().setup();
				driver= new FirefoxDriver();
			}
			sdriver=driver;

			driverUtils = new webDriverUtils(driver);

		}

		@AfterClass
		public void afterClass() throws InterruptedException {
			driverUtils.closeBrowser();
		}

		@BeforeMethod
		public void logintoVtiger() throws IOException {
			
			LoginPage lp=new LoginPage(driver);
			driverUtils.pageloadtimeout();


			driver.get(propFile_Util.readdatafrompropfile("url"));

			driverUtils.maximisewindow();

			lp.loginToApp();
		}

		@AfterMethod
		public void logout()
		{
			HomePage homePage=new HomePage(driver);
			homePage.logoutfromApp();
		}
	

}
