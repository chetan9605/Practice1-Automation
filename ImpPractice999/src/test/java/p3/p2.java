package p3;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class p2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		 WebDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			
			p1 p=new p1(driver);
			
			p.name("Admin");
			
			p.pwd("admin123");
			
			p.logn();
			
			
			

	}

}
