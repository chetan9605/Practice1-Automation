package p3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class p1 {
	
	WebDriver driver;
	
	public p1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	@FindBy(name="username")
	WebElement user;
	
	public void name(String us)
	{
		user.sendKeys(us);
	}
	
	@FindBy(name="password")
	WebElement pass;
	
	public void pwd(String pas)
	{
		pass.sendKeys(pas);
	}
	
	@FindBy(xpath="//button[text()=' Login ']")
	WebElement button;
	
	
	public void logn()
	{
		button.click();
	}

}
