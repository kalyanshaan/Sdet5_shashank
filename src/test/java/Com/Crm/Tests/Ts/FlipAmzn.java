package Com.Crm.Tests.Ts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FlipAmzn {
	
	
	@Test
	public void Comparingprice() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Shaa-Selenium\\Selenium driver\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		driver.findElement(By.name("q")).sendKeys("Redmi Note 11 (Horizon Blue, 64 GB)");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector("[type=\"submit\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='Redmi Note 11 (Horizon Blue, 64 GB)']")).click();
		String str1=driver.findElement(By.xpath("//div[text()='Redmi Note 11 (Horizon Blue, 64 GB)']/../../div[2]/div/div/div")).getText();
		System.out.println(str1);
		
		
		String newPrice=str1.replace(",","");
		String flipkartPc=newPrice.replace("₹","");
		int flipkartPrice=Integer.parseInt(flipkartPc);
		

		
		System.setProperty("webdriver.chrome.driver", "C:\\Shaa-Selenium\\Selenium driver\\chromedriver.exe");
		ChromeDriver driver1= new ChromeDriver();
		driver1.manage().window().maximize();
		driver1.navigate().to("https://www.amazon.in/");
		driver1.findElement(By.id("twotabsearchtextbox")).sendKeys("Redmi Note 11 (Horizon Blue, 64 GB)");
		
		driver1.findElement(By.cssSelector("[class='nav-search-submit nav-sprite']")).click();
		Thread.sleep(2000);
	String str2=driver1.findElement(By.xpath("//span[contains(text(), 'Redmi Note 11 (Horizon Blue, 6GB RAM, 64GB ')]/../../../../div[3]/div/div/div/div/a/span/span[2]/span[2]")).getText();
		System.out.println(str2);
		String newPrice1=str2.replace(",","");
		String amazonPc=newPrice1.replace("₹ "," ");
		int amazonPrice1=Integer.parseInt(amazonPc);
		if(flipkartPrice>amazonPrice1) {
			System.out.println(amazonPrice1+"TC Passed");
		}
		else
		{
			System.out.println(flipkartPrice+"TC Fail");
		}
		
	}

}
