package A;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class H {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone",Keys.ENTER);
		
		List<WebElement> lists = driver.findElements(By.xpath("//span[contains(@class,'a-size-medium ')]"));
		
		System.out.println(lists.size());
		
		for(WebElement list:lists)
		{
			String txt = list.getText();
			
			System.out.println(txt);
			
			if(txt.contains("Apple iPhone 13 (128GB) - Pink"))
			{
				list.click();
				
				System.out.println("click on Apple iPhone 13 (128GB) - Pink");
				
				Set<String> WinIDs = driver.getWindowHandles();
				
				for(String ids:WinIDs)
				{
					String title = driver.switchTo().window(ids).getTitle();
					
					System.out.println(title);
					
					if(title.equals("Apple iPhone 13 (128GB) - Pink : Amazon.in: Electronics"))
					{
						driver.findElement(By.xpath("(//input[@id='add-to-cart-button'])[2]")).click();
						
					}
				}
				
			}
		
		}
		
	//	Object ids = driver.switchTo().window(WinIDs).getTitle();
		
		

	}

}
