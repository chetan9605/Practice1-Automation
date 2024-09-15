package A;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class F2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.flipkart.com/search?q=tshirt+for+men&as=on&as-show=on&otracker=AS_Query_OrganicAutoSuggest_4_1_na_na_na&otracker1=AS_Query_OrganicAutoSuggest_4_1_na_na_na&as-pos=4&as-type=RECENT&suggestionId=tshirt+for+men&requestId=a207208f-8ca1-4642-a730-be183a7b8a3b&as-searchtext=tshirt%20for%20men");
		
		List<WebElement> Tshirts = driver.findElements(By.xpath("//div[@class='syl9yP']"));
		
		System.out.println(Tshirts.size());
		
		
		
		List<WebElement> Tname = driver.findElements(By.xpath("//a[@class='WKTcLC']"));
		
		System.out.println(Tname.size());
		
	
		
		List<WebElement> Prices = driver.findElements(By.xpath("//div[@class='Nx9bqj']"));
		
		System.out.println(Prices.size());
		
		
		for(int i=0;i<Tshirts.size();i++)
		{
			System.out.println(Tshirts.get(i).getText() +"-------"+Tname.get(i).getText()+"---------"+Prices.get(i).getText());
		}
		
		

	}

}
