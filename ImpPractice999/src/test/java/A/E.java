package A;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class E {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.bbc.com/");
		
		//List<WebElement> lists = driver.findElements(By.tagName("a"));
		
		List<WebElement> lists2 = driver.findElements(By.xpath("//a"));
		
		
		System.out.println(lists2.size());
		
		WebElement link = lists2.get(7);
		
		System.out.println(link.getText());
		
		System.out.println(link.getAttribute("href"));
		
	//	link.click();
		
		for(int i=0;i<lists2.size();i++)
		{
			System.out.println(lists2.get(i).getText() +" -----"+ lists2.get(i).isDisplayed());
			
		//	System.out.println(lists2.get(i).isDisplayed());
		}
		
		
		

	}

}
