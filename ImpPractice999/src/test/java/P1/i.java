package P1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class i {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
       WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
	//	int rows = driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
		
	//	int rows = driver.findElements(By.tagName("tr")).size();
		
	//	System.out.println(rows);
		
		int colums = driver.findElements(By.xpath("//table[@name='BookTable']//tr//th")).size();
		
		System.out.println(colums);
		
		WebElement name = driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]//td[1]"));
		
		System.out.println(name.getText());
		
		

	}

}
