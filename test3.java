import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test3 {

	public static void main(String[] args) {
		 
		
			System.setProperty( "webdriver.chrome.driver","C:./software/chromedriver.exe"); 
	        
		       WebDriver driver = new ChromeDriver();
		       driver.get("https://www.travelo.bt/travelo_bt_dev/");
		       driver.manage().window().maximize();
		      

	

}
