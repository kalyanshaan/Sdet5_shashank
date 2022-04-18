package Com.testng.pac;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class test1 {
	@BeforeSuite  
	 public void before_suite()  
	 {  
	     System.out.println("First method");  
	 }  
		
		@BeforeClass
		public void beforeclass()
		{
			System.out.println("Execute Before class");
		}
		@BeforeMethod
		public void beforemethd()
		{
			System.out.println("Execute before method");
		}
		@Test
		public void test()
		{
			System.out.println("Tc-1 running");
		}
		
		@AfterMethod
		public void beforemethod()
		{
			System.out.println("Execute AfterMethod");
		}
		@AfterClass
		public void afterclass()
		{
			System.out.println("Execute afterclass");
		}
		@AfterSuite  
		public void after_suite()  
		{  
		    System.out.println("Last method");  
		      
		}  
		
}
