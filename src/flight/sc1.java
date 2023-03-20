package flight;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class sc1 {

	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty( "webdriver.chrome.driver","C:./software/chromedriver.exe"); 
			        
			       WebDriver driver = new ChromeDriver();
			       driver.get("https://acqua.evclub.travel/");
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
			       driver.findElement(By.xpath("//input[@placeholder='Account ID']")).sendKeys("ACQUA063729");
			       driver.findElement(By.xpath("//input[@data-content='Password Ex: A3#FD*3377^*']")).sendKeys("Provab@123");
			       driver.findElement(By.xpath("//button[@class='logbtn' and @id='login_submit']")).click();
			       Thread.sleep(1000);
			       //driver.findElement(By.xpath("//a[@class='dropdown-toggle' and @ aria-expanded='true']")).click();
			       driver.findElement(By.xpath("/html/body/div[2]/header/div[3]/div[1]/div[2]/div[1]/ul/li[2]/a")).click();
			       JavascriptExecutor js = (JavascriptExecutor)driver;
			          js.executeScript("window.scrollBy(0,1200)");            //Scroll Down(+ve)
			          Thread.sleep(3000);
			          System.out.println("Scrolled down.."); 
			       
			       driver.findElement(By.xpath("//*[@id=\"owl-demo2\"]/div[1]/div/div[3]/div/div/div/img")).click();
			       
			       Thread.sleep(10000);
			       driver.findElement(By.xpath("/html/body/div[2]/div[2]/section/div/div[2]/div[2]/div/div[2]/div[3]/div[2]/div/div[2]/div/div[2]/div[2]/form/button")).click();
			       
			      driver.findElement(By.xpath("/html/body/div[2]/div[2]/section/div/div[2]/div[2]/div/div[2]/div[3]/div[1]/div/div[2]/div/div[2]/div[2]/form/button")).click();
			      Thread.sleep(10000);
			      
			      driver.findElement(By.xpath("//*[@id=\"room-list\"]/div[1]/div[19]/div[3]/div/form/button")).click();
			      driver.findElement(By.xpath("//input[@ placeholder='Enter First Name'  and @id='passenger-first-name-1' ]")).sendKeys("Akshay");
			      driver.findElement(By.xpath("//input[@id='passenger-last-name-1']")).sendKeys("QA");
			      JavascriptExecutor js1 = (JavascriptExecutor)driver;
		          js1.executeScript("window.scrollBy(0,380)");           
		          Thread.sleep(3000);
		          System.out.println("Scrolled down..");
		          driver.findElement(By.xpath("//input[@id='passenger-contact' and @placeholder='Mobile Number']")).sendKeys("9663332854");
		          driver.findElement(By.xpath("//input[@id='billing-email' and @placeholder='Email']")).sendKeys("akshayb.provab@gmail.com");
		          driver.findElement(By.xpath("//input[@id='terms_cond1' and @type='terms_cond1']")).click();
		          
		          
		          
			      
			       
			     
	}

}
