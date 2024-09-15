package P1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class h {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		
		
		driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
		
		driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys("C:\\Users\\CHETAN\\Downloads\\BaseClass.java");
		
	
		
		if(driver.findElement(By.xpath("//ul[@id='fileList']//li")).getText().equals("BaseClass.java"))
		{
			System.out.println("file upload");
		}
		else
		{
			System.out.println("not upload");
		}
		
		
		
	}

}
