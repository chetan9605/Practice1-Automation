package Automate;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class H {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int count=0;
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.name("q")).sendKeys("one plus mobiles",Keys.ENTER);
		
		List<WebElement> Prices = driver.findElements(By.xpath("//div[@class='Nx9bqj _4b5DiR']"));
		
		System.out.println(Prices.size());
		
		
		
		
		for(int i=0;i<Prices.size();i++)
		{
		  String txtPrice = Prices.get(i).getText();
		  
		 }
		
	/*	for(WebElement price:Prices)
		{
			//System.out.println(price.getText());
			
			double pri = Double.parseDouble(price.toString());
			
			//int IntPrice = Integer.parseInt(price.toString());
		
			System.out.println(pri);
			
			if(IntPrice<=30000)
			{
				System.out.println(price.getText());
				count++;
			}    
		  

	}   */

}
  
}