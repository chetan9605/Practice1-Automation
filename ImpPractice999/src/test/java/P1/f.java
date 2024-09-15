package P1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class f {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		

		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		
		
		driver.get("https://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html");
		
		driver.findElement(By.id("menu1")).click();
		
		Thread.sleep(3000);
		
		List<WebElement> Drops = driver.findElements(By.xpath("//li[@role='presentation']"));
		
		      System.out.println(Drops.size());
		      
		      for(WebElement drop:Drops)
		      {
		    	  System.out.println(drop.getText());
		      }
		
		
		
		//driver.findElement(By.xpath("//a[text()='JavaScript']")).click();
		
		
		
		

	}

}
