package secondpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MultiSession2 {
	
	@Test
	public void multisession4()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Eclipse Workspace\\chromedriver.exe");//right path of chrome driver.exe
		WebDriver driver= new ChromeDriver();
		driver.get("http://demo.guru99.com/V4/");
		driver.manage().window().maximize();
        //find user name text box and fill it
        driver.findElement(By.name("uid")).sendKeys("Driver 4");
        System.out.println("driver 4");
	}
}
