package secondpackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class obRepo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		WebDriver driver;           
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Desktop\\IBM Upskill program\\Selenium setup files\\Chrome driver 74\\chromedriver_win32\\chromedriver.exe");      
		System.setProperty("webdriver.chrome.driver","C:\\Eclipse Workspace\\chromedriver.exe");
		driver = new ChromeDriver();                    
		driver.get("http://demowebshop.tricentis.com"); 
		driver.manage().window().maximize();
		
Properties obj=new Properties();
FileInputStream file=new FileInputStream("C:\\Selenium\\FirstSelenium\\src\\secondpackage\\orepo.properties");
obj.load(file);
driver.findElement(By.linkText(obj.getProperty("login"))).click();
driver.findElement(By.id(obj.getProperty("email"))).sendKeys("s@gmail.com");

	}

}
