package secondpackage;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

public class checkLisener {
	
	@Test
	public void pass()
	{
		int a=10;
		System.out.println("first tc");
		System.out.println(a);
		Assert.assertTrue(true);
	
	}
	
	@Test
	public void fail()
	{
		int a=10;
		System.out.println("Test Case has been failed");
		assertTrue(false);
	}

}
