package Practice_pkg;

import java.sql.Date;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import net.bytebuddy.agent.builder.AgentBuilder.Transformer.ForAdvice;

public class mmt {
	
	@Test
	public void makemytrip() throws Throwable
	{
		Date d=new Date(0);
		String s1=d.toString();
		System.out.println(s1);
		
		String[] str=s1.split(" ");
		String date1=str[2];
		String days=str[0];
		String month=str[1];
		String year=str[5];
		String currentdata=days+" "+month+" "+date1+" "+year;
		System.out.println(currentdata);
		System.setProperty("webdriver.chrome.driver","C:\\Shaa-Selenium\\Selenium driver\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//Thread.sleep(3000);

		//From
		driver.findElement(By.className("langCardClose")).click();
		driver.findElement(By.xpath("//li[@data-cy='account']")).click();
			String src="blr";
			String dest="hyd";
		driver.findElement(By.id("fromCity")).sendKeys(src);
		driver.findElement(By.xpath("//div[text()='"+src+"')")).click();
		driver.findElement(By.id("toCity")).sendKeys(dest);
		driver.findElement(By.xpath("//div[text()='"+dest+"']")).click();
		driver.findElement(By.xpath("//span[text()='DEPARTURE']")).click();
		driver.findElement(By.xpath("//div[@aria-label='+currentdata+']")).click();
		for(int i=0; i<11;i++);
			try
			{
				driver.findElement(By.xpath("//div[@aria-label='Tue Apr 05 2022']")).click();
				
	}
			catch(Exception e) {
			
				driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
	
		}
		
	}

}
