package P1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		   WebDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			
			
			
			driver.get("https://the-internet.herokuapp.com/javascript_alerts");
			
			driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
			
			Alert alrt = driver.switchTo().alert();
			
			
			alrt.accept();
			
			

	}

}
