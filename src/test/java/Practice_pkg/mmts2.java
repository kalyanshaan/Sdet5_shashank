package Practice_pkg;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class mmts2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Shaa-Selenium\\Selenium driver\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.className("langCardClose")).click();
		driver.findElement(By.xpath("//li[@data-cy='account']")).click();
		String src="bangalore";
		String dest="hyderabad";
		driver.findElement(By.id("fromCity")).click();
	}

}
