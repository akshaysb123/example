package flight;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class sc2 {

	public static void main(String[] args) throws InterruptedException
	{
		
		System.setProperty( "webdriver.chrome.driver","C:./software/chromedriver.exe"); 
        
	       WebDriver driver = new ChromeDriver();
	       driver.get("https://evclub.travel");
	       driver.manage().window().maximize();
	       driver.findElement(By.xpath("//*[@id=\"owl-demo_flight\"]/div[1]/div/div[2]/div/a/div/div/img")).click();
	       Thread.sleep(3000);
	       driver.findElement(By.xpath("/html/body/div[2]/div[2]/section/div[1]/div[2]/div[2]/div/div[11]/div/div/div[1]/div[1]/div[3]/div/div[2]/div/form/button")).click();
	       Thread.sleep(1000);
	       driver.findElement(By.xpath("//input[@id='booking_user_name']")).sendKeys("akshayqa@gmail.com");
	       driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[3]/div/div/div[2]/div[1]/div/div/div[4]/div/div[2]/div[1]/div/div[4]/div/label")).click();
	       driver.findElement(By.id("booking_user_password")).sendKeys("Provab@123");
	       driver.findElement(By.xpath("//button[@id='continue_as_user']")).click();
	       JavascriptExecutor js = (JavascriptExecutor)driver;
	          js.executeScript("window.scrollBy(0,300)");           
	          Thread.sleep(3000);
	          System.out.println("Scrolled down..");
	          Thread.sleep(3000);
	          driver.findElement(By.xpath("//*[@id=\"pre-booking-form\"]/div[5]/div[12]/div/div[3]/div/label")).click();
	          driver.findElement(By.id("flip")).click();
	          Thread.sleep(3000);
	          driver.findElement(By.xpath("//button[@class='btn btn-success make-payment-btn' and @id='make-payment-btn']")).click();
	          
	          Thread.sleep(3000);
	         driver.findElement(By.xpath("//input[@name='CARDNUMBER' and @autocomplete='off']")).sendKeys("4444333322221111");
	         Select se = new Select(driver.findElement(By.xpath("//select[@name='CCMONTH' and @tabindex='11']")));
				se.selectByIndex(12);
				 Select se1 = new Select(driver.findElement(By.xpath("//select[@name='CCYEAR' and @tabindex='12']")));
					se1.selectByIndex(12);
				
				Thread.sleep(1000);
				driver.findElement(By.xpath("//input[@name='CVV' and @tabindex='13']")).sendKeys("123");
				driver.findElement(By.xpath("//input[@name='CARDHOLDERNAME' and @tabindex='14']")).sendKeys("TEST");
				driver.findElement(By.xpath("//input[@name='Submit' and @tabindex='26']")).click();
				driver.findElement(By.xpath("/html/body/div[2]/header/div[3]/div[1]/div[2]/div[2]/div[1]/a/div/div[2]")).click();
				driver.findElement(By.xpath("/html/body/div[2]/header/div[3]/div[1]/div[2]/div[2]/div[1]/div/div/div/ul/li[1]/a")).click();
                  Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div/ul/li[4]")).click();
				driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div/div/div/div[2]/div/div/div[2]/div/div[3]/div[2]/a")).click();
				Thread.sleep(10000);
				//driver.findElement(By.className("ful_logo")).click();
				 WebDriver driver1 = new ChromeDriver();
			       driver1.get("https://evclub.travel/supervision");
			       driver1.manage().window().maximize();
			       driver1.findElement(By.xpath("//input[@id='email' and @placeholder='Username']")).sendKeys("corporate@condotrust.com");
			       driver1.findElement(By.xpath("//input[@id='password' and @placeholder='Password']")).sendKeys("Lilo1958&");
			       driver1.findElement(By.xpath("/html/body/div[1]/div/div[1]/p[2]")).click();
			       driver1.findElement(By.id("login_submit")).click();
			       /*driver1.findElement(By.xpath("//button[@type='button' and @id='login_custom']")).click();
			       Thread.sleep(3000);
			       driver1.findElement(By.xpath("//input[@placeholder='OTP' and @id='opt_number']")).sendKeys("12345");
			       Thread.sleep(5000);*/
			       driver1.findElement(By.xpath("/html/body/div[1]/div[1]/section/div[2]/div[1]/div/div[1]/div/div/a")).click();
			      /* driver1.findElement(By.xpath("//button[@type='button' and @id='login_custom']")).click();
			       Thread.sleep(5000);
				   driver1.findElement(By.xpath("/html/body/div[1]/div[1]/section/div[2]/div[1]/div/div[1]/div/div/a")).click();
				   Thread.sleep(5000);*/
				   JavascriptExecutor js2 = (JavascriptExecutor)driver1;
			          js2.executeScript("window.scrollBy(0,1200)");            
			          Thread.sleep(3000);
			          System.out.println("Scrolled down.."); 
			          Thread.sleep(3000);
			          JavascriptExecutor js1 = (JavascriptExecutor)driver1;
			          js1.executeScript("window.scrollBy(800,0)");            
			          Thread.sleep(3000);
			          System.out.println("horizontal Scrolled ..");
				
				
				
				
				
				

	       
	       
	}

	
}
	     
