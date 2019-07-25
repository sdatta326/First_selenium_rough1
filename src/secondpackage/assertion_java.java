package secondpackage;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;




public class assertion_java {


	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","c:\\work\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		String actualtitle="google";
		System.out.println(actualtitle);

		String expectedtitle=driver.getTitle();
		System.out.println(expectedtitle);
		Thread.sleep(300);
		try
		{
			Assert.assertEquals(actualtitle,expectedtitle,"title not  matched");


			
		}
		catch(Error e)
		{
			System.out.println("Assert  equals failed. test execution is not  aborted because catch handle it and then finally executed.");
			System.out.println("Error message: " + e.toString());
		}
			finally
			{

		System.out.println("hello");
			}

		}

	}
