package P1;

import org.testng.annotations.Test;

public class g2 {
	
	
	@Test  (priority =1 ,groups= {"Mango"})
	void openappMango()
	{
		System.out.println("open Mango ");
	}
	
	@Test  (priority =2 ,groups= {"Mango"})
	void loginMango()
	{
		System.out.println("login Mango");
	}
	
	@Test  (priority =3 ,groups= {"Mango"})
	void quitMango()
	{
		System.out.println("quit");
	}


}
