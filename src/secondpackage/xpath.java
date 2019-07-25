package secondpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Eclipse Workspace\\chromedriver.exe");
		
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		
		driver.findElement(By.xpath("//div[@class='zi6sUf _3Ed3Ub']/ul/li[2]/span")).click();
		//driver.findElement(By.xpath("//li[@class='Wbt_B2 _1YVU3_']/preceding-sibling::li")).click();
		//driver.findElement(By.xpath("//li[@class='_1KCOnI _3ZgIXy']/preceding-sibling::li[1]")).click();
		
		
		
		//driver.findElement(By.xpath("//div[@class='zi6sUf _3Ed3Ub']/ul/li[1]/span")).click();
		

	}

}
