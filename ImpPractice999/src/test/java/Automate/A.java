package Automate;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 WebDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			
			driver.get("https://www.flipkart.com/");
			
			JavascriptExecutor js=(JavascriptExecutor) driver;
			
			driver.findElement(By.name("q")).sendKeys("iphone",Keys.ENTER);
			
			driver.findElement(By.xpath("//div[text()='Apple iPhone 15 (Blue, 128 GB)']")).click();
			
			Set<String> WinIds = driver.getWindowHandles();
			
			for(String Ids:WinIds)
			{
				String title = driver.switchTo().window(Ids).getTitle();
				
				if(title.equals("Apple iPhone 15 (Blue, 128 GB)"))
				{
					//driver.findElement(By.xpath("//a[@class='TSD49J' and text()='Flights']")).click();
					
					List<WebElement> lists = driver.findElements(By.xpath("//li[@class='_7eSDEz']"));
					
					for(WebElement list:lists)
					{
						String txt = list.getText();
						
						System.out.println(txt);

					}
					
				}
				
			}
			
			
	}
	
}
 
