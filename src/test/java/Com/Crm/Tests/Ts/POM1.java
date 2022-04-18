package Com.Crm.Tests.Ts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class POM1
{
	
	WebDriver driver=new ChromeDriver();
	
	
	//Goes with And Condition
	@FindBys(value = { @FindBy (name="user_name"),@FindBy (xpath="//input[@name='user_name']")})

	WebElement un;

	public POM1() 
	{
		PageFactory.initElements(driver,this);
		}
	
	//@Goes with or Condition
	@FindAll(value = { @FindBy (name="user_pword"),@FindBy(xpath="//input[@name='user_password']") })
	WebElement pd;
	@FindBy(id="submitButton")
	WebElement btn;
	@Test
	public void st()
	
	{
		driver.manage().window().maximize();
		driver.get("http://localhost:8888");
		
		un.sendKeys("admin");
		pd.sendKeys("admin");
		driver.navigate().refresh();
		btn.click();
		
		
	}

	}
	
	
	
	

