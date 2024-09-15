package A;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.name("q")).sendKeys("Mobiles",Keys.ENTER);
		
		List<WebElement> lists = driver.findElements(By.xpath("//div[@class='KzDlHZ']"));
		
		System.out.println(lists.size());
		
		for(WebElement diffTxt:lists)
		{
			String txt = diffTxt.getText();
			
			if(txt.equals("Motorola g64 5G (Pearl Blue, 128 GB)"))
			{
				diffTxt.click();
			}
			else
			{
				System.out.println("invalid value");
			}
		}
	}

}
