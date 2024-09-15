package A;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.name("q")).sendKeys("Mobiles",Keys.ENTER);
		
		List<WebElement> lists = driver.findElements(By.xpath("//div[@class='KzDlHZ']"));
		
		int length = lists.size();
		
		System.out.println(length);
		
		if(length!=0)
		{
			for(WebElement difflist:lists)
			{
				String txt = difflist.getText();
				
					System.out.println(txt);
					
					boolean status = difflist.getText().contains("Motorola Edge 50 Fusion (Hot Pink, 128 GB)");
					
					System.out.println("status " +status);
				
					if(status==true)
					{
						difflist.click();	
					}
					else
					{
						System.out.println("status not true");
					}
			}
		}
		
		else
		{
			System.out.println("lenth is not equal to zero");
		}

	}

}
