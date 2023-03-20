package flight;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sc {

	public static void main(String[] args) 
	
		throws InterruptedException 
	    { 
	        System.setProperty( 
	            "webdriver.chrome.driver", 
	            "C:./software/chromedriver.exe"); 
	        
	       WebDriver driver = new ChromeDriver(); 
	      
	       
	  driver.get("https://www.travelsoho.com/flyrepeat/"); 
	  
	  driver.findElement(By.id("details-button")).click();
	  driver.findElement(By.id("proceed-link")).click();
	  Thread.sleep(3000);
	  JavascriptExecutor j = (JavascriptExecutor)driver;
      if (j.executeScript("return document.readyState").toString().equals("complete"))
      {
         System.out.println("Page has loaded");
      }
      for (int i=0; i<50; i++){
         try {
            Thread.sleep(1000);
         }
         catch (InterruptedException ex) 
         {
            System.out.println("Page has not loaded yet ");
         }
        
         if (j.executeScript("return document.readyState").toString().equals("complete"))
         {
            break;
         }
      }
      driver.findElement(By.id("from")).sendKeys("maa");
	  /*JavascriptExecutor js= (JavascriptExecutor)driver;
	  for(int i=0; i<3; i++)
	  {
		  js.executeScript("window.ScrollBy(0,-500)" );
		  Thread.sleep(3000);
	  }*/
      }
	    }

	


