package secondpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String baseUrl = "http://demo.guru99.com/test/write-xpath-table.html";
		// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver","C:\\work\\chromedriver.exe");
//				System.setProperty("webdriver.chrome.driver","C:\\work\\chromedriver.exe");
				
				ChromeDriver driver= new ChromeDriver();

		driver.get(baseUrl);
		driver.manage().window().maximize();
		
		//String t=driver.getTitle();
		//System.out.println(t);
		//String t2=driver.findElement(By.tagName(“title”).getText();
		//System.out.println("hello "+t2);
	//String t2=driver.findElement(By.tagName("title")).getText();
	//System.out.println("hello "+t2);
	
	
String f=driver.findElement(By.xpath("//table/tbody/tr/td")).getText();
System.out.println(f);

String s=driver.findElement(By.xpath("//table/tbody/tr/td[1]//following-sibling::td[1]")).getText();
System.out.println(s);

String forth=driver.findElement(By.xpath("//table/tbody/tr[2]/td[2]")).getText();
System.out.println(forth);

//table/tbody/tr[2]/td[1]



		
		

	}

}
