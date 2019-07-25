package secondpackage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenGoogle {

	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
		
	System.setProperty("webdriver.chrome.driver","C:\\Eclipse Workspace\\chromedriver.exe");
	
	
	WebDriver driver= new ChromeDriver();
	
	driver.get("https://www.google.com");
	driver.manage().window().maximize();
	Thread.sleep(10000);
	System.out.println(driver.getCurrentUrl());
	
	
	driver.close();
	
	System.out.println("hello world");
	
	
	

	}

}
