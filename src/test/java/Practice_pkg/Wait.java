package Practice_pkg;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Wait {

	
	@Test
	public void waitstatements() 
	{
		//	WebDriver driver = new ChromeDriver();

		driver.get("http://localhost:8888");

		driver.manage().timeouts().implicitlyWait(15,TimeUnit.MILLISECONDS);

		//		WebElement username = driver.findElement(By.name("user_name"));
		//		WebElement password = driver.findElement(By.name("user_password"));
		//		WebElement loginbtn = driver.findElement(By.id("submitButton"));

		
		String str = "furniture";
		
		char ch = str.charAt(str.length()-1);
		if (ch=='e') 
		{
			// logic to click on that
		}
		
		username.sendKeys("admin");
		driver.navigate().refresh();
		password.sendKeys("12345");

		loginbtn.click();
	}
	//WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		// Goes with AND condition

		@FindBys(value = { @FindBy (name="user_name" ),@FindBy (xpath="//input[@name=\"user_name\"]")})
		WebElement username;

		public Wait() 
		{
			PageFactory.initElements(driver, Wait.class);
		}

		// Goes with OR condition
		@FindAll(value = { @FindBy (name="user_pasd"),@FindBy(xpath="//input[@name=\"user_password\"]")})
		WebElement password;

		@FindBy(id="submitButton")
		WebElement loginbtn;





}

