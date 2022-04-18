package Com.Assesrt.Tests;




import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;
@Listeners(Com.Assesrt.Tests.Listerners_Execution.class)
public class LoginScenarion {

	@Test
	public void vtigerlogin()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
		driver.get("http://localhost:8888");
		String title=driver.getTitle();
		//SoftAssert
		//SoftAssert softAssert=new SoftAssert();
		//softAssert.assertEquals(title,"Vitiger");
		
		//hard Assert
		Assert.assertEquals(title,"Vitiger");
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.id("submitButton")).click();
	}
}
