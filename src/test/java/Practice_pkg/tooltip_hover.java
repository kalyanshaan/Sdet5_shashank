package Practice_pkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tooltip_hover {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Shaa-Selenium\\Selenium driver\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.cssSelector("input[type=\"password\"]")).sendKeys("Manager");
		//tooltip
		
		WebElement ele=driver.findElement((By.id("keepLoggedInCheckBox")));
		String str=ele.getAttribute("title");
		System.out.println(str);

	}

}
