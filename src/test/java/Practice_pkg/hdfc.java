package Practice_pkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class hdfc {
	
	@Test
	public void bankhdfc()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hdfcbank.com/");
		//driver.switchTo().alert().accept();
		driver.findElement(By.cssSelector("g[stroke='none']")).click();
		driver.findElement(By.className("closeSummer")).click();
		driver.findElement(By.xpath("//button[@aria-label=\"Close\"]")).click();
		
		//driver.findElement(By.xpath("//a[text()='Select Product Type']")).click();
		//driver.findElement(By.className("dropdown1 dropdown-menu")).click();
		driver.findElement(By.xpath("//a[text()='Select Product Type']")).click();
		driver.findElement(By.xpath("//li[text()='Deposits']")).click();
		
		
	}
	

}
