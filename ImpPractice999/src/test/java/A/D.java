package A;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.name("q")).sendKeys("Laptop",Keys.ENTER);
		
		List<WebElement> lists = driver.findElements(By.xpath("//div[@class='col col-7-12']"));
		
		System.out.println(lists.size());
		
		for(int i=0;i<lists.size();i++)
		{
			System.out.print(lists.get(i).getText()  );
			
			System.out.println("----------------");
		}
		
	}

}
