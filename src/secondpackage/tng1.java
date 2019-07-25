package secondpackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class tng1 {
	/*@BeforeTest
	public void test30()
	{
		System.out.println("Before test executed");
	}
	
	
	@AfterTest
	public void test4()
	{
		System.out.println("After test executed");
	}
	@BeforeClass
	public void test5()
	{
		System.out.println("Before class executed");
	}
	
	@AfterClass
	public void test6()
	{
		System.out.println("Afetr class executed");
	}
	
	@BeforeMethod
	public void test7()
	{
		System.out.println("Before method executed");
	}
	
	@AfterMethod
	public void test8()
	{
		System.out.println("After method executed");
	}*/
	
	@Test
	public void test1()
	{
		System.out.println("test1 executed");
	}
	
	/*@AfterSuite
	public void test3()
	{
		System.out.println("After suite tests are executed");
	}
	*/
	
	
	@Test(groups={"TEST9"})
	public void test9()
	{
		System.out.println("test9 executed");
	}
	
	@Test(enabled=true)
	public void test2()
	{
		System.out.println("test2 executed");
	}

}
