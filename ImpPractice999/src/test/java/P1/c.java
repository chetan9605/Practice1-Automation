package P1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class c {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		   WebDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			
			
			
			driver.get("https://testautomationpractice.blogspot.com/");
			
	/*		List<WebElement> CheckBox = driver.findElements(By.xpath("//div[@class='form-group']/child::label[@for='days']/following::input[@class='form-check-input']"));

			for(int i=0;i<CheckBox.size();i++)
			{
				CheckBox.get(i).click();
			}   */
			
			
			List<WebElement> boxes = driver.findElements(By.xpath("//div[@class='form-group']//following::input[@class='form-check-input']"));
 
			for(int i=4;i<=7;i++)
			{
				 boxes.get(i).click();
		    }
			
			Thread.sleep(3000);
			
			for(int i=4;i<=7;i++)
			{
				 if(boxes.get(i).isSelected())
				 {
					 boxes.get(i).click();
				 }
		    }
			
			
	}

}
