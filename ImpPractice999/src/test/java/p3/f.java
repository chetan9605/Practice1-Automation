package p3;

import org.testng.Assert;
import org.testng.annotations.Test;

public class f {
	
	@Test (priority=1 , groups= {"sanity"} )
	void a()
	{
		System.out.println("a");
	}
	
	
	@Test  (priority=2  ,  groups= {"sanity"})
	void b()
	{
		System.out.println("b");
	}
	
	@Test  (priority=3,   groups= {"sanity"})
	void c()
	{
		System.out.println("c");
	}

}
