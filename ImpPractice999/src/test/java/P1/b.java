package P1;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		
		
		driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();
		
		Set<String> WinIDs = driver.getWindowHandles();
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		for(String ids:WinIDs)
			
		{
			String title1 = driver.switchTo().window(ids).getTitle();
			
			if(title1.equals("Human Resources Management Software | OrangeHRM"))
			{
				driver.findElement(By.name("EmailHomePage")).sendKeys("Chetan");
				
				
				Object fb = driver.findElement(By.xpath("//img[@alt='facebook logo']"));
				
				js.executeScript("arguments[0].click()", fb);
				
				driver.findElement(By.xpath("//img[@alt='facebook logo']")).click();
				
				//String title2 = driver.switchTo().window(ids).getTitle();
				
				if(title1.equals("OrangeHRM - World's Most Popular Opensource HRIS | Secaucus NJ | Facebook"))
				{
					//WebElement Account = driver.findElement(By.xpath("//span[text()='Create new account']"));
					
					//js.executeScript("arguments[0].click()", Account);
					
					String tit = driver.getTitle();
					
					System.out.println(tit);
				}
				
				
				
		
				
			}
		}
		
		
		

	}

}
