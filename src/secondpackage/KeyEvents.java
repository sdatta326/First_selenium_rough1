package secondpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class KeyEvents {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Eclipse Workspace\\chromedriver.exe");//right path of chrome driver.exe
		WebDriver driver;
		driver= new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();


		/* WebElement link_Home = driver.findElement(By.linkText("Home"));
         WebElement td_Home = driver
                 .findElement(By
                 .xpath("//html/body/div"
                 + "/table/tbody/tr/td"
                 + "/table/tbody/tr/td"
                 + "/table/tbody/tr/td"
                 + "/table/tbody/tr"));    

         Actions builder = new Actions(driver);
         Action mouseOverHome = builder
                 .moveToElement(link_Home)
                 .build();

         String bgColor = td_Home.getCssValue("background-color");
         System.out.println("Before hover: " + bgColor);        
         mouseOverHome.perform();        
         bgColor = td_Home.getCssValue("background-color");
         System.out.println("After hover: " + bgColor);
         driver.close();*/
		WebElement w=driver.findElement(By.name("userName"));
		WebElement link=driver.findElement(By.linkText("Home"));
		String backcolor=driver.findElement(By.xpath("//html/body/div/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr")).getCssValue("background-color");
		System.out.println(backcolor);
		Actions a=new Actions(driver);
		Action m=a.moveToElement(link).build();
		m.perform();
		String aftercolor=driver.findElement(By.xpath("//html/body/div/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr")).getCssValue("background-color");
		System.out.println(aftercolor);
		WebElement uname=driver.findElement(By.name("userName"));
		uname.sendKeys("ram");
		uname.sendKeys(Keys.CONTROL,"a");
		uname.sendKeys(Keys.CONTROL,"c");
		WebElement pwd=driver.findElement(By.name("password"));
		pwd.sendKeys(Keys.CONTROL,"v");

		Actions a1=new Actions(driver);
		a1.moveToElement(uname).click().keyDown(uname,Keys.SHIFT).sendKeys("ram").keyUp(uname,Keys.SHIFT).doubleClick(uname).contextClick();
		Action d=a1.build();
		d.perform();
		//pwd.sendKeys("v",Keys.CONTROL);



	}

}
