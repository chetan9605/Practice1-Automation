package P2;

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
						
						if(txt.equals("128 GB ROM") & txt.equals("15.49 cm (6.1 inch) Super Retina XDR Display") & txt.equals("48MP + 12MP | 12MP Front Camera") & txt.equals("A16 Bionic Chip, 6 Core Processor Processor"))
						{
							System.out.println("pass");
							
							driver.findElement(By.xpath("//button[@class='QqFHMw vslbG+ In9uk2' and text()='Add to cart']")).click();
							    
							WebElement Remove1 = driver.findElement(By.xpath("//div[@class='sBxzFz' and text()='Remove']"));
							
							js.executeScript("arguments[0].click()", Remove1);
							
							WebElement Remove2 = driver.findElement(By.xpath("//div[@class='sBxzFz fF30ZI A0MXnh' and text()='Remove']"));
							
							
							js.executeScript("arguments[0].click()", Remove2);
							
							driver.findElement(By.xpath("//img[@class='W5mR4e']")).click();
							
						//	driver.findElement(By.xpath("//span[@role='button' and  @class='_30XB9F']")).click();
							
							}
						else
						{
							System.out.println("fail");
						}
					}
				}
			}
			
			
			

	}

}
