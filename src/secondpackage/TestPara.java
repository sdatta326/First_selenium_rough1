package secondpackage;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestPara {
	
	@Test
	@Parameters({"a","b"})
	public void add(int a,int b)
	{
		
	int sum=a+b;
	System.out.println(sum);
	}
	
	@Test
	@Parameters({"a","b"})
	public void sub(int a,int b)
	{
	int su=a-b;	
	System.out.println(su);
	}
	

}
