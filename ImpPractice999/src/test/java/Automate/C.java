package Automate;

import java.time.Duration;
import java.util.List;

import org.apache.poi.poifs.crypt.temp.AesZipFileZipEntrySource;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 WebDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			
			driver.get("https://www.flipkart.com/");
			
			driver.findElement(By.name("q")).sendKeys("phones",Keys.ENTER);
			
			List<WebElement> lists = driver.findElements(By.xpath("//div[@class='KzDlHZ']"));
			
			int length = lists.size();
			
			System.out.println(length);
			
			if(length!=0)
			{
				for(WebElement list:lists)
				{
					String txt = list.getText();
					
					System.out.println(txt);
					
					boolean status = list.getText().contains("Motorola Edge 50 Fusion (Forest Blue, 256 GB)");
					{
						System.out.println("status " + status);   //Motorola Edge 50 Fusion (Forest Blue, 256 GB)

						
						if(status==true)
						{
							list.click();
						}
						else
						{
							System.out.println("status " + false);
						}
					}
				}
				
			}
			else
			{
				System.out.println("length is 0");
			}
			
			

	}

}
