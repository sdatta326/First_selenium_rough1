package secondpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class javaSPT {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Eclipse Workspace\\chromedriver.exe");


		driver = new ChromeDriver();
		driver.get("http://www.newtours.demoaut.com");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("REGISTER")).click();
		//WebElement email =  driver.findElement(By.id("userName"));
		WebElement ele=driver.findElement(By.name("confirmPassword"));
		
		//JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeScript("alert('Javascript message box')");
		scroll(ele,driver);

	}

	public static void scroll(WebElement ele,WebDriver driver)
	{
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeScript("argument[0].style.border='3px solid red'",ele);
		//js.executeScript("arguments[0].scrollIntoView(true)",ele);
		  //js.executeScript("arguments[0].scrollIntoView();",ele);
		//js.executeScript("alert('javamsg')");
		//js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
		//js.executeScript("arguments[0].scrollIntoView(true)",ele);
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");

	}
}


/*public static void scroll(WebElement element, WebDriver driver)
{
    JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("arguments[0].scrollIntoView(true)", element);
    
}*/




