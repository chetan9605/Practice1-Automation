package P1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(15));
		
		driver.get("https://omayo.blogspot.com/");
		
		driver.findElement(By.xpath("//button[text()='Dropdown']")).click();
		
		WebElement w = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Facebook']")));
		
	                w.click();

	

	}

}
