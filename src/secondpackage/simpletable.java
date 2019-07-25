package secondpackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class simpletable {
	
	public static void main(String[] args) {
		String baseUrl = "http://demo.guru99.com/test/write-xpath-table.html";
		// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver","C:\\work\\chromedriver.exe");
//				System.setProperty("webdriver.chrome.driver","C:\\work\\chromedriver.exe");
				
				ChromeDriver driver= new ChromeDriver();

		driver.get(baseUrl);
		String innerText = driver.findElement(By.xpath("//table/tbody/tr[2]/td[2]")).getText(); 	
	        System.out.println(innerText); 
	        int rows=driver.findElements(By.xpath("//table/tbody/tr")).size();
	        System.out.println(rows);
	        int cols=driver.findElements(By.xpath("//table/tbody/tr/td[1]")).size();
	        System.out.println(cols);
	        
	       WebElement ro=driver.findElement(By.xpath("//table/tbody"));
	       List<WebElement> r=ro.findElements(By.tagName("tr"));
	       int newr=r.size();
	       System.out.println("new row="+newr);
	       
	       WebElement co=driver.findElement(By.xpath("//table/tbody/tr"));
	       List<WebElement> c=co.findElements(By.tagName("td"));
	       int newc=c.size();
	       System.out.println("new col="+newc);
	        
	        driver.quit();
		}
	}


