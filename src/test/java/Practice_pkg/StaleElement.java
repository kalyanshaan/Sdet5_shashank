package Practice_pkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElement {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver","C:\\Shaa-Selenium\\Selenium driver\\chromedriver.exe");
		 
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:8888/");
		
		
		WebElement un=driver.findElement(By.name("user_name"));
		
		
		WebElement pd=driver.findElement(By.name("user_password"));
	
		WebElement btn=driver.findElement(By.id("submitButton"));
	
		
		un.sendKeys("admin");
		driver.navigate().refresh();
		pd.sendKeys("admin");
		btn.click();
		
	}

}
