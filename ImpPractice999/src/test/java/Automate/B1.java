package Automate;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class B1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		  WebDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			
			driver.get("https://www.flipkart.com/");
			
			JavascriptExecutor js=(JavascriptExecutor) driver;
			
			driver.findElement(By.name("q")).sendKeys("iphone",Keys.ENTER);
			
			driver.findElement(By.xpath("//div[text()='Apple iPhone 12 (Blue, 64 GB)']")).click();
			
			Set<String> WinIds = driver.getWindowHandles();
			
			for(String Ids:WinIds)
			{
				String Title = driver.switchTo().window(Ids).getTitle();
				
				if(Title.equals("Apple iPhone 12 (Blue, 64 GB)"))
				{
					driver.findElement(By.xpath("//button[@class='QqFHMw vslbG+ In9uk2' and  text()='Add to cart']")).click();
					
					WebElement Remove = driver.findElement(By.xpath("//div[@class='sBxzFz' and  text()='Remove']"));
					
					js.executeScript("arguments[0].click()",Remove);
					
					WebElement Remove2 = driver.findElement(By.xpath("//div[@class='sBxzFz fF30ZI A0MXnh' and  text()='Remove']"));
					
					js.executeScript("arguments[0].click()", Remove2);
					
					driver.findElement(By.xpath("//img[@class='W5mR4e']")).click();
				}
			}
	}

}
