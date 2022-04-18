package Com.Crm.Tests.Ts;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.w3c.dom.Text;

public class FlipTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Shaa-Selenium\\Selenium driver\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		driver.findElement(By.name("q")).sendKeys("mobiles under 20,000");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("[type=\"submit\"]")).click();
		Thread.sleep(2000);
		//JavascriptExecutor jse=(JavascriptExecutor)driver;
		//jse.executeScript("window.scrollBy(200,300)");
		Thread.sleep(2000);
	driver.findElement(By.xpath("(//div[@class='_3879cV'])[5]")).click();
	//Search for the product 
	Thread.sleep(3000);
	String str=driver.findElement(By.xpath("//div[text()='Redmi Note 11 (Space Black, 64 GB)']")).getText();
	if(str.contains("Redmi"))
	{
		System.out.println("Tc passed");
	}
	else
	{
		System.out.println("Tc failed ");
	}
	String price=driver.findElement(By.xpath("//div[text()='Redmi Note 11 (Horizon Blue, 64 GB)']/../../div[2]/div/div/div")).getText();
	String newprice=price.replace(",", "");
	String newprice2=newprice.replace("₹ ","");
	int chPrice=Integer.parseInt(newprice2);
	if(chPrice<20000) {
		System.out.println(chPrice+"TC Passed");
	}
	else
	{
		System.out.println(chPrice+"TC Fail");
	}
	
	
			
	
		
		
	}

}
