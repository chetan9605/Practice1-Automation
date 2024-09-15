package P1;

import org.testng.annotations.Test;

public class g3 {
	
	
	@Test  (priority =1 ,groups= {"lemon","orange","Mango"})
	void openapplemon()
	{
		System.out.println("open lemon");
	}
	
	@Test  (priority =2 ,groups= {"lemon","orange","Mango"})
	void loginlemon()
	{
		System.out.println("login lemon");
	}
	
	@Test  (priority =3 ,groups= {"lemon","orange","Mango"})
	void quitlemon()
	{
		System.out.println("quit lemon");
	}


}
