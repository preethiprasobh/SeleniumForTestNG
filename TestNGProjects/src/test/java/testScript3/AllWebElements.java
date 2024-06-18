package testScript3;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class AllWebElements extends Base {

	@Test
	public void link()
	{
		driver.navigate().to("https://artoftesting.com/samplesiteforselenium");
		WebElement link=driver.findElement(By.xpath("//a[@href='http://www.artoftesting.com/sampleSiteForSelenium.html']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();",link);
		
	}
	@Test
	public void buttonDoubleClick()
	{
	driver.navigate().to("https://artoftesting.com/samplesiteforselenium");
	WebElement button=driver.findElement(By.xpath("//button[@id='dblClkBtn']"));
	Actions action=new Actions(driver);
	//action.click(button);
	action.doubleClick(button).build().perform();
	driver.switchTo().alert().accept();
}
	@Test
	public void radioButton()
	{
		driver.navigate().to("https://artoftesting.com/samplesiteforselenium");
		WebElement male=driver.findElement(By.xpath("//input[@id='male']"));
		WebElement female=driver.findElement(By.xpath("//input[@id='female']"));
		if(!male.isSelected())
		{
			male.click();
		}
		if(male.isSelected())
		{
			female.click();
		}
	}
	@Test
	public void checkBox()
	{
		driver.navigate().to("https://artoftesting.com/samplesiteforselenium");
		WebElement automation=driver.findElement(By.xpath("//input[@value='Automation']"));
		WebElement performance=driver.findElement(By.xpath("//input[@value='Performance']"));
		if(automation.isEnabled())
		{
			if(!automation.isSelected())
			{
				automation.click();
			}
			if(automation.isSelected())
			{
				performance.click();
				automation.click();
			}
			
			
		}
	}
	@Test
	public void dropDown()
	{
		driver.navigate().to("https://artoftesting.com/samplesiteforselenium");
		WebElement dropdown=driver.findElement(By.xpath("//select[@id='testingDropdown']"));
		Select select=new Select(dropdown);
		select.selectByVisibleText("Database Testing");
	}
	@Test
	public void confirmButton()
	{
		driver.navigate().to("https://artoftesting.com/samplesiteforselenium");
		WebElement confirmation=driver.findElement(By.xpath("//button[@onclick='generateConfirmBox()']"));
		confirmation.click();
		driver.switchTo().alert().dismiss();
		System.out.println("clicked 'cancel' button");
	}
	@Test
	public void dragAndDrop()
	{
		driver.navigate().to("https://artoftesting.com/samplesiteforselenium");
		WebElement draggingimage=driver.findElement(By.xpath("//img[@src='https://artoftesting.com/wp-content/uploads/2019/12/drag-and-drop-demo.jpg']"));
		WebElement droppingplace=driver.findElement(By.xpath("//div[@id='targetDiv']"));
		Actions action=new Actions(driver);
		action.moveToElement(draggingimage).build().perform();
		action.doubleClick(draggingimage).build().perform();
		//action.contextClick(draggingimage).build().perform();//right click
		action.dragAndDrop(draggingimage, droppingplace).build().perform();
	}
	
}
