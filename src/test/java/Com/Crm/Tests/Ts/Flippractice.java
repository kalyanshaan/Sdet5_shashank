package Com.Crm.Tests.Ts;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flippractice {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Shaa-Selenium\\Selenium driver\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		driver.findElement(By.name("q")).sendKeys("iphone");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector("[type=\"submit\"]")).click();
		
		driver.findElement(By.xpath("//div[text()='APPLE iPhone SE (Red, 128 GB)']")).click();
		String str2 = driver.findElement(By.xpath("//div[text()='₹27,999']")).getText();
		System.out.println(str2);
		//windows handle to print price on console 
		String parentWindow=driver.getWindowHandle();
		Set<String> handles=driver.getWindowHandles();
		for(String windowHandle: handles) {
			if(!windowHandle.equals(parentWindow)) {
				driver.switchTo().window(windowHandle);
				}
			}
		driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
		Thread.sleep(2000);
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,300)");
		driver.findElement(By.xpath("//button[text()='+']")).click();
		
	String str	=driver.findElement(By.xpath("//span[text()='55,998']")).getText();
	System.out.println(str);
		
	}
}
	
