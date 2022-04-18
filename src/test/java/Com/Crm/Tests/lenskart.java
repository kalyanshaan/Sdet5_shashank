package Com.Crm.Tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class lenskart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
			WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.lenskart.com ");
			driver.manage().window().maximize();
			
			driver.findElement(By.xpath("//input[@class='search_input-bar autoSuggest']")).click();
			Thread.sleep(3000);
			List<WebElement> options=driver.findElements(By.xpath("//ul[@class='trending_list menu-link']//li"));
			for(WebElement ele:options)
			{
				String OptionList=ele.getText();
				System.out.println(OptionList);
			}
			Thread.sleep(3000);
	}

}
