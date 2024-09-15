package P1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class a1 {
	
	WebDriver driver;
	
	@BeforeClass
	void open()
	{
		  driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			
			
			
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	@Test (dataProvider="dp")
	void login(String user, String pwd)
	{
      driver.findElement(By.name("username")).sendKeys(user);
		
		driver.findElement(By.name("password")).sendKeys(pwd);
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
	}
	
	@AfterClass
	void teardown()
	{
		driver.quit();
	}
	
	
	@DataProvider (name="dp")
	Object[][] logindata()
	{
		Object data[] [] = {{"Admin","admin123"},
				            {"chetan","chetan123"},
				            {"Admin","admin123"},
				            {"arjun","arjun123"}
				            };
		
		return data;

	}
	

}
