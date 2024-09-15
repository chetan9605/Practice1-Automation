package P1;

import org.testng.annotations.Test;

public class g1 {
	
	
	@Test  (priority =1 ,groups= {"orange"})
	void openappOrange()
	{
		System.out.println("open orange");
	}
	
	@Test  (priority =2 ,groups= {"orange"})
	void loginOrange()
	{
		System.out.println("login orange");
	}
	
	@Test  (priority =3 ,groups= {"orange"})
	void quitOrange()
	{
		System.out.println("quit orange");
	}

}
