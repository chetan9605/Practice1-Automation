package DDT;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class E {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("http://www.automationpractice.pl/index.php?controller=authentication&back=my-account");
		
		String filePath="C:\\Auto2\\MyWorkplace\\ChetanAutomation\\ImpPractice999\\TestData\\ValidData.xlsx";
		
		int rows = D.getRowCount(filePath, "Sheet1");

		for(int i=1;i<=rows;i++)
		{
			String username = D.getCellData(filePath, "Sheet1", i, 0);
			
			String password=  D.getCellData(filePath, "Sheet1", i, 1);
			
			driver.findElement(By.id("email")).sendKeys(username);
			
			driver.findElement(By.id("passwd")).sendKeys(password);
			
			driver.findElement(By.xpath("//span/child::i[@class='icon-lock left']")).click();
			
		//	boolean status = driver.findElement(By.xpath("//a[@class='account']/child::span")).isDisplayed();
			
		//	System.out.println("status " + status);
				
		//	if(status==true)
			String txt = driver.findElement(By.xpath("//a[@class='account']/child::span")).getText();
			
			
			
			if(txt=="Ankit Mishra")
			{
				System.out.println(" passed ");
				D.setCellData(filePath, "Sheet1", i, 2, "Passed");
			}
			else
			{
				System.out.println("faild");
				D.setCellData(filePath, "Sheet1", i, 2, "Failed");
			}
			
			driver.findElement(By.xpath("//a[@class='logout']")).click();
		}
		
		driver.quit();
	}

}
