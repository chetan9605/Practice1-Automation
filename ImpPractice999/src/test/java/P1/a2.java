package P1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class a2 {
	
WebDriver driver;
	
    @Parameters({"browser"})
	@BeforeClass
	void open( String bro)
	{
    	
    	switch (bro.toLowerCase()) 
    	{
    	case "chrome":
    	 driver=new ChromeDriver();
    		break;
    		
    	case "edge":
       	 driver=new EdgeDriver();
       		break;
       		
    	case "firefox":
       	 driver=new FirefoxDriver();
       		break;
    	 
    	 
		  default:
			  
			  System.out.println("invalid");
			break;
		}
		 
			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			
			
			
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	@Test 
	void login() throws InterruptedException
	{
      driver.findElement(By.name("username")).sendKeys("Admin");
		
		driver.findElement(By.name("password")).sendKeys("admin123");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		Thread.sleep(3000);
		
	}
	
	@AfterClass
	void teardown()
	{
		driver.quit();
	}

}
