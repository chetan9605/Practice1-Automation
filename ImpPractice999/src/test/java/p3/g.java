package p3;

import org.testng.annotations.Test;

public class g {
	
	@Test (priority=1 , groups= {"regression"} )
	void a()
	{
		System.out.println("a");
	}
	
	
	@Test  (priority=2  ,  groups= {"regression"})
	void b()
	{
		System.out.println("b");
	}
	
	@Test  (priority=3,   groups= {"regression"})
	void c()
	{
		System.out.println("c");
	}

}
