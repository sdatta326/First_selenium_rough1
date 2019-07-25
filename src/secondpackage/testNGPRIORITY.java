package secondpackage;

import org.testng.annotations.Test;

public class testNGPRIORITY {

	//C,D,A,B
	@Test(priority=0) //
	public void A()  
	{  
		System.out.println("A"); 

	}
	@Test(priority=0,dependsOnMethods="D")//
	public void B()  
	{  
		System.out.println("B");  
	} 
	@Test(priority=0)
	public void C()  
	{  
		System.out.println("C");  
	}
	@Test()  
	public void D()  
	{  
		System.out.println("D");  
	}  
	/*@Test(dependsOnMethods={"WebStudentLogin","MobileStudentLogin"})
	public void APIStudentLogin()  
	{  
	System.out.println("Student login through API");  
	}*/  
}  


