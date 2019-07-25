package secondpackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkbox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\work\\chromedriver.exe");
//		System.setProperty("webdriver.chrome.driver","C:\\work\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
//      WebDriver driver= new FirefoxDriver();
		driver.get("https://www.toolsqa.com/automation-practice-form/");
		
		driver.manage().window().maximize();
		
		//driver.findElement(By.linkText("Sign In")).click();
		//input[@type='radio']
		
		List<WebElement>  radioelements=driver.findElements(By.xpath("//input[@type='radio']"));
		int si=radioelements.size();
		for(int i=0;i<si;i++)
		{
			Thread.sleep(3000);
			WebElement cbox=radioelements.get(i);
			String cboxvalue=radioelements.get(i).getAttribute("value");
			//System.out.println(cboxvalue);
			cbox.click();
		}
		
		//List<WebElement>
		WebElement  link=driver.findElement(By.xpath("//a[contains(text(),'Selenium Training')]"));
		String linkvalue=link.getText();
		//String linkvalue=link.getAttribute("value");
		System.out.println("link value "+linkvalue);
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("dutta");
		
		String name=driver.findElement(By.xpath("//input[@name='firstname']")).getAttribute("value");
		System.out.println("name value "+name);
		
		//for all link text use getText() to get value;
		//for all radio,check,textbox value use getattribute to get value; 
		
		
		
		
	}
}
