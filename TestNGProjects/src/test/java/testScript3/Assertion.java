package testScript3;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion extends Base {
	@Test
	public void assertEqualsTest()
	{
		driver.navigate().to("https://www.browserstack.com/");
		String actualstring=driver.getTitle();
		System.out.println(actualstring);
		String expectedString="Most Reliable App & Cross Browser Testing Platform | BrowserStack";
		Assert.assertEquals(actualstring,expectedString,"Not as expected");
		
	}
	@Test
	public void assertNotEqualTest()
	{
		driver.navigate().to("https://www.browserstack.com/");
		String actualstring=driver.getTitle();
		System.out.println(actualstring);
		String expectedString="Most Reliable App & Cross Browser Testing Platform | BrowserStack.";
		Assert.assertNotEquals(actualstring,expectedString,"Should not be same");
	}
	@Test
public void assertTrueTest()
{
	driver.navigate().to("https://www.browserstack.com/");
	boolean verifytitle=driver.getTitle().equalsIgnoreCase("Most Reliable App & Cross Browser Testing Platform | BrowserStack");
	Assert.assertTrue(verifytitle);//verify that a condition is true


}
	@Test
	public void assertFalseTest()
	{
		driver.navigate().to("https://www.browserstack.com/");
		boolean verifytitle=driver.getTitle().equalsIgnoreCase("Most Reliable App & Cross Browser Testing Platform | BrowserStack.");
		Assert.assertFalse(verifytitle);
		
	}
	@Test
	public void assertNullTest()
	{
		driver.navigate().to("https://www.browserstack.com/");
		String verifyassertnull=null;
		Assert.assertNull(verifyassertnull);
	}
	@Test
	public void assertNotNull()
	{
		driver.navigate().to("https://www.browserstack.com/");
		boolean verifyassertnotnull=driver.getTitle().equalsIgnoreCase("Most Reliable App & Cross Browser Testing Platform | BrowserStack");
		Assert.assertNotNull(verifyassertnotnull,"Its null");
	}
}
