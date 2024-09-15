package p3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class x {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		  WebDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			
			driver.get("https://www.globalsqa.com/demoSite/practice/slider/range.html");
			
			Actions a=new Actions(driver);
			
			WebElement MinSlider = driver.findElement(By.xpath("(//span[contains(@class,'ui-slider')])[1]"));
			
			System.out.println("Location of slider " + MinSlider.getLocation());
			
			a.dragAndDropBy(MinSlider, 100, 46).perform();
			
			System.out.println("Location of slider  after moving" + MinSlider.getLocation());
			
			WebElement MaxSlider = driver.findElement(By.xpath("(//span[contains(@class,'ui-slider')])[2]"));
			
			System.out.println("Max Slider Location " + MaxSlider.getLocation() );
			
			a.dragAndDropBy(MaxSlider, -150, 46).perform();
			
			System.out.println("Max Slider Location  after moving " + MaxSlider.getLocation() );
			
			
			
			
			


			

	}

}
