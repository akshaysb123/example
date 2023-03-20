package test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class test1 
{
	public static void main(String args[]) throws InterruptedException 
    { 
  System.out.println("Akshay");
  System.setProperty( "webdriver.chrome.driver", "C:./software/chromedriver.exe"); 
  WebDriver driver = new ChromeDriver();
  driver.get("https://travel-agent.site/agent/index.php/accounting");
  driver.manage().window().maximize();
  driver.findElement(By.name("email")).sendKeys("akshayb.provab@gmail.com");
  driver.findElement(By.name("password")).sendKeys("Provab@123");
  driver.findElement(By.className("logbtn")).click();
  JavascriptExecutor j = (JavascriptExecutor)driver;
  if (j.executeScript("return document.readyState").toString().equals("complete"))
  {
     System.out.println("Page has loaded");
  }
  for (int i=0; i<50; i++){
     try {
        Thread.sleep(5000);
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
  driver.findElement(By.xpath("//a[@data-toggle='offcanvas']")).click();
  Thread.sleep(2000);
  driver.findElement(By.xpath("/html/body/div/aside/section/ul/li[5]/a/span")).click();
  driver.findElement(By.xpath("/html/body/div[1]/div[2]/section/div[2]/div[1]/div/div[1]/nav/div[2]/ul/li[1]/a")).click();
  driver.findElement(By.xpath("/html/body/div[1]/div[2]/section/div[2]/div[1]/div/div[1]/nav/div[2]/ul/li[1]/ul/li[1]/a")).click();
  Thread.sleep(5000);
  driver.findElement(By.xpath("//input [@class='form-control ui-autocomplete-input' and @id='lei_acc_no']")).sendKeys("13");
  Thread.sleep(2000);
  driver.findElement(By.xpath("//input[@class='form-control' and @id='lei_name']")).sendKeys("Akshay");
  Thread.sleep(2000);
  driver.findElement(By.xpath("//*[@id=\"lei_group\"]")).sendKeys("P");
  Thread.sleep(2000);
  driver.findElement(By.xpath("//*[@id=\"lis\" and @mytag=\"Provab \" ]")).click();
  Thread.sleep(2000);
  driver.findElement(By.xpath("//input[@class='form-control' and @id='lei_vat_reg']")).sendKeys("9663332854");
  Thread.sleep(2000);
  driver.findElement(By.xpath("//select[@class='form-control' and @id='lei_consultant']")).click();
  Thread.sleep(2000);
  Select drpCountry = new Select(driver.findElement(By.xpath("//select[@class='form-control' and @id='lei_consultant']")));
	drpCountry.selectByVisibleText("Akshay");
	driver.findElement(By.xpath("//*[@id=\"lei_division\"]")).sendKeys("P");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id=\"lis\" and @mytag=\"Provab\"]")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id=\"lei_tel\"]")).sendKeys("9663332854");
	  driver.findElement(By.xpath("//*[@id=\"lei_fax\"]")).sendKeys("12345");
	  driver.findElement(By.xpath("//*[@id=\"lei_email\"]")).sendKeys("akshayb3.provab@gmail.com");
	  driver.findElement(By.xpath("//*[@id=\"lei_contact\"]")).sendKeys("9663332854");
	  driver.findElement(By.xpath("//*[@id=\"lei_tel_postal\"]")).sendKeys("Provab");
	  driver.findElement(By.xpath("//*[@id=\"lei_fax_postal\"]")).sendKeys("Electronic city");
	  driver.findElement(By.xpath("//*[@id=\"lei_email_postal\"]")).sendKeys("Bangalore");
	  //Thread.sleep(5000);
	  driver.findElement(By.xpath("//*[@id=\"lei_tel_phy\"]")).sendKeys("Provab");
	  driver.findElement(By.xpath("//*[@id=\"lei_fax_phy\"]")).sendKeys("Electronic city");
	  driver.findElement(By.xpath("//*[@id=\"lei_email_phy\"]")).sendKeys("Bangalore");
	  driver.findElement(By.xpath("//*[@id=\"myLeisure\"]/div/div/div[2]/div/div/div[2]/button[1]")).click();
	  
    }
}
 	
   
	
		
	

