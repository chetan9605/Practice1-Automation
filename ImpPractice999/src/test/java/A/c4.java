package A;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class c4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.name("q")).sendKeys("Mobiles",Keys.ENTER);
		
		List<WebElement> lists = driver.findElements(By.xpath("//div[@class='KzDlHZ']"));
		
		int lenth = lists.size();
		
		System.out.println(lenth);
		
		if(lenth!=0)
		{
			for(WebElement difflist:lists)
			{
				String txt = difflist.getText();
				
				System.out.println(txt);
				
				boolean status = txt.contains("SAMSUNG Galaxy S23 5G (Green, 128 GB)");
				
				System.out.println("status " + status);
				
				if(status==true)
				{
					difflist.click();
				}
				else
				{
					System.out.println("status is not true");
				}
			}
		}
		else
		{
			System.out.println("length is not 0");
		}

	}

}
