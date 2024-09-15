package A;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.name("q")).sendKeys("iphone",Keys.ENTER);
		
		driver.findElement(By.xpath("//div[text()='Apple iPhone 15 (Black, 128 GB)']")).click();
		
		Set<String> WinIDs = driver.getWindowHandles();
		
		for(String IDs:WinIDs)
		{
			String Title = driver.switchTo().window(IDs).getTitle();
			
			if(Title.equals("Apple iPhone 15 (Black, 128 GB)"))
			{
				List<WebElement> lists = driver.findElements(By.xpath("//li[@class='_7eSDEz']"));
				
				for(WebElement list:lists)
				{
					System.out.println(list.getText());
				}
			}
		}

	}

}
