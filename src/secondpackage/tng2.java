package secondpackage;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class tng2 {
	
	/*@BeforeSuite
	public void test3()
	{
		System.out.println("Before suite tests are executed in SECOND CLASS");
	}
 */
	@Test(groups={"TEST10"})
	public void test9()
	{
	System.out.println("test 9 another class in SECOND CLASS");	
	}
	@Test
	public void test12()
	{
	System.out.println("test 12 another class in SECOND CLASS");	
	}
}
