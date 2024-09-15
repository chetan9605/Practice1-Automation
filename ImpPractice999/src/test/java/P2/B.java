package P2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		 WebDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			
			driver.get("https://www.flipkart.com/");
			
			driver.findElement(By.name("q")).sendKeys("phones",Keys.ENTER);
			
			List<WebElement> phones = driver.findElements(By.xpath("//div[@class='KzDlHZ']"));
			
			System.out.println(phones.size());
			
			for(WebElement phoes:phones)
			{
			      String txt = phoes.getText();
			      
			      boolean ys = txt.contains("Motorola g64 5G (Mint Green, 256 GB)");
			
			      System.out.println(ys);
			     
			    		  
			     
			}

	}

}
