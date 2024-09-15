package p3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class B {
	
WebDriver driver;
	
	@BeforeClass 
	void Open()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("http://www.automationpractice.pl/index.php?controller=authentication&back=my-account");
	}
	
	
	@Test ( dataProvider="dp")
	void Login(String user, String pwd)
	{
		driver.findElement(By.id("email")).sendKeys(user);
		
		driver.findElement(By.id("passwd")).sendKeys(pwd);
		
		driver.findElement(By.id("SubmitLogin")).click();
	}
	
	
	@AfterClass 
	void Quit()
	{
		driver.quit();
	}
	
	
	
	@DataProvider(name="dp")
	Object[] [] loginData()
	{
		Object [] [] data= { 
				{"xyzg@gmail.com","Ankit@123"},
				{"admin","1234"},
				{"hiii","85236"}
				 };
		
		return data;
	}

}
