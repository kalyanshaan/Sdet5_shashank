package ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.generic.webDriverUtils;

public class HomePage {
	
	 WebDriver driver;

		//Rule:3 //Rule-3 Create separate java class for every page in application & initialze the elements 
		//By using pagefactory.initElement
		
		//WebDriver driver;	//global driver variable 
		
		public HomePage(WebDriver driver) {
			
			this.driver=driver;
			PageFactory.initElements(driver,this);
		}
	 
		
		//Rule-2:Indentify all the elements by using findBy,findBys,findall
		
		@FindBy(xpath="//img[@alt='Create Organization...']")
		private WebElement getorglnk;
		

		@FindBy(xpath="(//td[@class='small'])[2]")
		private static WebElement logoutimg;
		
		@FindBy(xpath="//a[text()='Sign Out']")
		private WebElement logoutbtn;
		
		@FindBy(xpath="//a[text()='Contacts']")
		private static WebElement getcontactslnk;

			//Rule 4: Read data by using getter methods by changing to private 
			
			
		public  WebElement getorglnk() {
			 return getorglnk;
		}
		
			public  WebElement getLogoutimg() {
			 return logoutimg;
		}

		private WebElement getLogoutbtn() {
			return logoutbtn;
		}

		public static WebElement getContactslink() {
			return getcontactslnk;
		}

		//Rule 5: Business Library
			public void logoutfromApp() 
			{
				webDriverUtils driverUtils = new webDriverUtils(driver);
				driverUtils.movetoElement(logoutimg);
				driverUtils.movetoElement(logoutbtn);
				logoutbtn.click();
			}
			
				
			}
			
			



