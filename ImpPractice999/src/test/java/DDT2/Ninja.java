package DDT2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Ninja {
	
	public WebDriver driver;
	
	@Test (dataProvider="MyShop", dataProviderClass=DataExcel.class)
	public void MyShopDta(String user , String pwd)
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("http://www.automationpractice.pl/index.php?controller=authentication&back=my-account");
		driver.findElement(By.id("email")).sendKeys(user);
		driver.findElement(By.id("passwd")).sendKeys(pwd);
		
		driver.findElement(By.id("SubmitLogin")).click();
		
		
	}

}
