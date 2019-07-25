package secondpackage;
//dependsOnMethods control first go and execution start after methods tests,then check with priority,if no priority then
//check with alphabatic orders  test method name execute
import org.testng.annotations.Test;  
public class Class1   
{
@Test(priority=0,description="this is test case1 now") //
public void A()  
{  
System.out.println("A");  
}
@Test(priority=0,description="this is test case2 now",dependsOnMethods="D")
public void B()  
{  
System.out.println("B");  
} 
@Test(description="this is test case3 now",dependsOnMethods="A")
public void C()  
{  
System.out.println("C");  
}
@Test(description="this is test case4 now")  //,dependsOnMethods="B"
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