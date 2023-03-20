package flight;

//import java.awt.Desktop.Action;
//import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class launch 
{
	public static void main(String args[]) throws InterruptedException 
	    { 
	        System.setProperty( "webdriver.chrome.driver", "C:./software/chromedriver.exe"); 
	         WebDriver driver = new ChromeDriver(); 
	      driver.get("https://provabdev.com/");
	      driver.findElement(By.xpath("//input[@id='from']")).sendKeys("Maa");
	   WebElement  ele = driver.findElement(By.xpath("//input[contains(.,'chennai')])[1]"));
	      Actions a= new Actions(driver);
	     a.moveToElement(ele).click();
	 
	
	  
	  
}
}
