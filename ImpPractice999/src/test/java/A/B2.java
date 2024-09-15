package A;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class B2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.name("q")).sendKeys("iphone",Keys.ENTER);
		
		driver.findElement(By.xpath("//div[text()='Apple iPhone 15 (Black, 128 GB)']")).click();
		
		Set<String> WinIdS = driver.getWindowHandles();
		
		for(String ids:WinIdS)
		{
			String title = driver.switchTo().window(ids).getTitle();
			
			if(title.equals("Apple iPhone 15 (Black, 128 GB)"))
			{
				driver.findElement(By.xpath("//button[@class='QqFHMw vslbG+ In9uk2']")).click();
				
				WebElement remove1 = driver.findElement(By.xpath("//div[@class='sBxzFz' and  text()='Remove']"));
				
				JavascriptExecutor js=(JavascriptExecutor) driver;
				
				js.executeScript("arguments[0].click()",remove1);
				
				WebElement remove2 = driver.findElement(By.xpath("//div[@class='sBxzFz fF30ZI A0MXnh' and  text()='Remove']"));
				
				js.executeScript("arguments[0].click()",remove2);
				
				//	driver.findElement(By.xpath("//div[@class='sBxzFz' and  text()='Remove']")).click();
				
			//	driver.findElement(By.xpath("//div[@class='sBxzFz fF30ZI A0MXnh' and  text()='Remove']")).click();
				
				
				driver.findElement(By.xpath("//img[@class='W5mR4e']")).click();
				
				String tit = driver.getTitle();
				
				if(tit.equals("Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!"))
				{
					Assert.assertTrue(true);
					System.out.println("Done");
					driver.quit();
				}
				else
				{
					Assert.assertFalse(false);
					
					System.out.println("not done");
					
					driver.quit();
					
				}
			}
		}
		
		
		
		

	}

}
