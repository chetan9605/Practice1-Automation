package p3;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class a {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
         WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		 int rows = driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
		
		System.out.println(rows);
		
		 int colums = driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
		
		System.out.println(colums);
		
		for(int i=0;i<=rows;i++)
		{
			for(int j=0;j<=colums;j++)
			{
				
			}
		}
		 
		
		
		
		
		
		
	  

	}

}
