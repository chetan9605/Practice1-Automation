package Automate;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class E {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.name("q")).sendKeys("t shirts",Keys.ENTER);
		
		List<WebElement> prices = driver.findElements(By.xpath("//div[@class='Nx9bqj']"));
		
		System.out.println(prices.size());
		
		
		
		List<WebElement> logos = driver.findElements(By.xpath("//div[@class='syl9yP']"));
		
		System.out.println(logos.size());
		
		
		List<WebElement> Brands = driver.findElements(By.xpath("//a[@class='WKTcLC BwBZTg']"));
		
		System.out.println(Brands.size());
		
	
		for(int i=0;i<prices.size();i++)
		{
			System.out.println(prices.get(i).getText()+"----- "+logos.get(i).getText()+"------ "+Brands.get(i).getText());
		}
		

	}

}
