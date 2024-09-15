package P1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class z {
	
	@Test (priority=1)
	void openapp()
	{
		Assert.assertTrue(false);
		
		System.out.println("app");
	}
	
	@Test (priority=2, dependsOnMethods= {"openapp"})
	void login()
	{
		System.out.println("login");
	}
	
	@Test (priority=3)
	void logout()
	{
		System.out.println("logout");
	}

}
