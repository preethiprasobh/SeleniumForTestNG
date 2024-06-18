package testScript3;

import org.testng.annotations.Test;

public class Annotations extends Base {
	@Test(priority=1)
	public void test1()
	{
		System.out.println("Hello TestNg programs");
	}
	@Test(priority=2)
public void atFirst()
{
	System.out.println("At first");
}
}
