package Com.testng.pac;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class annotation {
	
	@Test
	public void tc3()
	{
		System.out.println("tc3");
	}
	//1
	@BeforeSuite
	public void bs()
	
	{
		System.out.println(" BeforeSuite");
	}
	@AfterSuite
	public void As()
	{
		System.out.println("Aftersuite");
	}
	//2
	@BeforeTest
	public void BT()
	{
		System.out.println("beforetest");
	}
	@AfterTest
	public void AT()
	{
		System.out.println("aftertest");
	}
	@BeforeClass
	public void BC()
	{
		System.out.println("beforeclass");
	}
	@AfterClass
	public void AC()
	{
		System.out.println("afterclass");
	}
	@BeforeMethod
	public void BM() {
		System.out.println("beforemethod");
		
	}
	@AfterMethod
	public void AM()
	{
		System.out.println("aftermethod");
	}
	

}
