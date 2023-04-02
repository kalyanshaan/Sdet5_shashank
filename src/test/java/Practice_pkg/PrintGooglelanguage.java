package Practice_pkg;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintGooglelanguage {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Shaa-Selenium\\Selenium driver\\chromedriver(1).exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		List<WebElement> options=driver.findElements("//a[text()='हिन्दी']");
		

	}

}
