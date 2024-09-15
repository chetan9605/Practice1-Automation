package p3;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class e {
	
	WebDriver driver;
	
	@Test
	void Login()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		SoftAssert s=new SoftAssert();
		
		String Actual=driver.getTitle();
		
		String Expected="OrangeHR";
		
		s.assertEquals(Actual, Expected);
		
		System.out.println("Title match");
		
		String Actual2=driver.getCurrentUrl();
		
		String Expected2="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		
		s.assertEquals(Actual2, Expected2);
		
		System.out.println("url match");
		
		s.assertAll();
		
		
	}

}
