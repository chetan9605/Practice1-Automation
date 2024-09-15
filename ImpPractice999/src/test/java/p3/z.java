package p3;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class z {
	
	WebDriver driver; 
	
	
	@Parameters({"browser"})
	@Test
	void open(String br)
	{
		
		switch (br.toLowerCase()) {
		case "chrome":
			driver=new ChromeDriver();
			break;
			
			case "edge":
				driver=new EdgeDriver();
				break;

		default:
			System.out.println("not valid");
			break;
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

}
