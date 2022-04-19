package ObjectRepo;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.generic.PropFile_Util;

public class LoginPage {
	
		
		//Rule-3 Create separate java class for every page in application & initialze the elements 
		//By using pagefactory.initElement
		
		WebDriver driver;
		
		public LoginPage(WebDriver driver) {
			//this.driver=driver;
			PageFactory.initElements(driver, this);
			
		}

		//Rule-2:Indentify all the elements by using findBy,findBys,findall
		
		@FindBy(xpath="//input[@name='user_name']")
		WebElement username;
		
		@FindBy(xpath="//input[@name='user_password']")
		WebElement Password;
		
		@FindBy(xpath="//input[@type='submit']")
		WebElement Loginbtn;

		
		
		//Rule 4: Read data by using getter methods by changing to private 
		
		
		private WebElement getUsername() {
			return username;
		}

		private WebElement getPassword() {
			return Password;
		}

		private WebElement getLoginbtn() {
			return Loginbtn;
		}
		//Rule5: Business logic
		public void loginToApp() throws IOException {
			PropFile_Util propFile_Util = new PropFile_Util();
			getUsername().sendKeys(propFile_Util.readdatafrompropfile("username"));
			getPassword().sendKeys(propFile_Util.readdatafrompropfile("password"));
			getLoginbtn().click();
		}


			}


