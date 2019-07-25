package secondpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class TestGuru99MultipleSession {
	

	 @Test    
    public void executSessionOne(){
            //First session of WebDriver
    	
	
		System.setProperty("webdriver.chrome.driver","C:\\Eclipse Workspace\\chromedriver.exe");//right path of chrome driver.exe
		
		WebDriver driver= new ChromeDriver();
	    driver.get("http://demo.guru99.com/V4/");
		driver.manage().window().maximize();
		//Goto guru99 site
       //find user name text box and fill it
       driver.findElement(By.name("uid")).sendKeys("Driver 1");
       System.out.println("driver 1");    
        }
        
    @Test    
        public void executeSessionTwo(){
            //Second session of WebDriver
    	System.setProperty("webdriver.chrome.driver","C:\\Eclipse Workspace\\chromedriver.exe");
    	WebDriver driver= new ChromeDriver();
            //Goto guru99 site
        driver.get("http://demo.guru99.com/V4/");
        //find user name text box and fill it
        driver.findElement(By.name("uid")).sendKeys("Driver 2");
        System.out.println("driver 2");
        
        }
        
    @Test    
        public void bexecutSessionThree(){
            //Third session of WebDriver
    	System.setProperty("webdriver.chrome.driver","C:\\Eclipse Workspace\\chromedriver.exe");
    	WebDriver driver= new ChromeDriver();
       
            //Goto guru99 site
        driver.get("http://demo.guru99.com/V4/");
        driver.manage().window().maximize();
        //find user name text box and fill it
        driver.findElement(By.name("uid")).sendKeys("Driver 3");
        System.out.println("driver 3");
        }   
	
}