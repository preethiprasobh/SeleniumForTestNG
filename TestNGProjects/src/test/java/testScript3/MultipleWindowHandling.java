package testScript3;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class MultipleWindowHandling extends Base {
	@Test
	public void multipleWindowHandle()
	{
		driver.navigate().to("https://webdriveruniversity.com/");
		WebElement contactus=driver.findElement(By.xpath("//h1[text()='CONTACT US']"));
		contactus.click();
		
		WebElement loginportal=driver.findElement(By.xpath("//h1[text()='LOGIN PORTAL']"));
		loginportal.click();
		String parent=driver.getWindowHandle();
		System.out.println("Parent"+parent);
		
		Set<String> allwindows=driver.getWindowHandles();
		for(String temp:allwindows)
		{
			if(!temp.equals(parent))
			{
			System.out.println("windows:"+temp);
			driver.switchTo().window(temp);
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());
			System.out.println("******************************************************");
		}
		}
		
		
	}
	@Test
	public void multipleWindowHandleTest2()
	{
		driver.navigate().to("https://webdriveruniversity.com/");
		WebElement contactus=driver.findElement(By.xpath("//h1[text()='CONTACT US']"));
		contactus.click();
		
		WebElement loginportal=driver.findElement(By.xpath("//h1[text()='LOGIN PORTAL']"));
		loginportal.click();
		String parent=driver.getWindowHandle();
		System.out.println("Parent"+parent);
		

		Set<String> allwindows=driver.getWindowHandles();
		String title="";
		for(String temp:allwindows)
		{
			if(!temp.equals(parent))
			{
			System.out.println("windows:"+temp);
			driver.switchTo().window(temp);
			title=driver.getTitle();
			System.out.println(driver.getCurrentUrl());
			System.out.println("******************************************************");
			}
			if(title.equals("WebDriver | Login Portal"))
			{
				WebElement username=driver.findElement(By.xpath("//input[@id='text']"));
				username.sendKeys("Preethi");
			}
			if(title.equals("WebDriver | Contact Us"))
			{
				WebElement firstname=driver.findElement(By.xpath("//input[@name='first_name']"));
				firstname.sendKeys("Preethi");
				String fname=firstname.getAttribute("value");
				System.out.println(fname);
			}		
		}
		
		
	driver.switchTo().window(parent);
	System.out.println("Parent:"+driver.getCurrentUrl());
	}
}



