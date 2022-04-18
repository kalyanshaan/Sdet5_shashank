package Com.testng.pac;

import org.testng.annotations.Test;

public class test2 {
	@Test(priority=1)
	public void A()
	{
		System.out.println("Executed all the annotation methods");
	}
	//1
	@Test(priority=0)
	public void B()
	
	{
		System.out.println(" executed before the execution of all the test cases");
	}
	@Test(priority=2)
	public void C()
	{
		System.out.println(" executed after the execution of all the test methods in the Suite");
	}
	//2
	@Test(priority=3)
	public void D()
	{
		System.out.println("executed first before any test belonging to that folder");
	}
	@Test(priority=4)
	public void E()
	{
		System.out.println("@AfterTest annotated method is executed after the execution of all the test methods of the available classes");
	}
	@Test(priority=-1)
	public void F()
	{
		System.out.println("@BeforeClass annotated method runs before the execution of test methods in a current class.");
	}
	@Test(priority=6)
	public void G()
	{
		System.out.println("method will be executed after all the test methods of a current class have been invoked.");
	}
	@Test(priority=7)
	public void H() {
		System.out.println("nnotated method will be invoked before the execution of each test method where the test method is nothing but a test case.");
		
	}
	@Test(priority=5)
	public void I()
	{
		System.out.println(" @AfterMethod annotated method will be invoked after the execution of each test method. ");
	}
	
}
