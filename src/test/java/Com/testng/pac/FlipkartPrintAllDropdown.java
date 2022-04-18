package Com.testng.pac;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class FlipkartPrintAllDropdown {
	
	@Test
	public void flipkartalllist() throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Shaa-Selenium\\Selenium driver\\chromedriver(1).exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.MILLISECONDS);
		driver.findElement(By.xpath("//input[@type='text']")).click();
		
	List<WebElement>ele=driver.findElements(By.className("wXpsjT"));
	Thread.sleep(3000);
	for(WebElement i:ele)
	{
		String str1=i.getText();
		System.out.println(str1);
	
	//for(int i=1;i<ele.size();i++)	{
		// ele1 =ele.get(i).getText();
		// ch=ele1.charAt(i);
	//	if(ch=='s') {
			//System.out.println(ele1);
			
			//ele.get(i).click();
			//break;
		}
	}
		
		
	}


