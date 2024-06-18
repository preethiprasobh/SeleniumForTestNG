package testScript3;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Assignment1 extends Base {
	@Test 
	
	public void fileOpen() {

	driver.navigate().to("https://demo.automationtesting.in/FileUpload.html");
	JavascriptExecutor js = (JavascriptExecutor) driver;
	WebElement choosefilebutton=driver.findElement(By.xpath("//input[@id='input-4']"));
	choosefilebutton.sendKeys("C:\\Users\\karthi\\Downloads\\6b199c13-3f1f-4261-ae46-b5a5411fc53b.pdf");
			js.executeScript("arguments[0].click();",choosefilebutton);	
			//WebElement uploadbutton=driver.findElement(By.xpath("//button[@title='Upload selected files']"));	
			//js.executeScript("arguments[0].click();",uploadbutton);	
			WebElement viewdetails=driver.findElement(By.xpath("//button[@title='View Details']"));
			js.executeScript("arguments[0].click();",viewdetails);	
			WebElement closebutton=driver.findElement(By.xpath("//button[@data-dismiss='modal']"));
			js.executeScript("arguments[0].click();",closebutton);
			WebElement deletebutton=driver.findElement(By.xpath("//button[@title='Clear selected files']"));
			js.executeScript("arguments[0].click();",deletebutton);
			
			
			
}
	@Test
	public void fileUploadUsingRobot() throws AWTException
	{
		driver.navigate().to("https://demo.automationtesting.in/FileUpload.html");
		
		WebElement choosefilebutton=driver.findElement(By.xpath("//input[@id='input-4']"));
		choosefilebutton.click();
		StringSelection s = new StringSelection("C:\\Users\\karthi\\Downloads\\6b199c13-3f1f-4261-ae46-b5a5411fc53b.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s,null);//toolkit is a class and getdefaulttoolkit is a method
		Robot r = new Robot();
		r.delay(250);

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		r.keyPress(KeyEvent.VK_CONTROL);
	      r.keyPress(KeyEvent.VK_V);
	      r.keyRelease(KeyEvent.VK_CONTROL);
	      r.keyRelease(KeyEvent.VK_V);
	      r.keyPress(KeyEvent.VK_ENTER);
	      r.keyRelease(KeyEvent.VK_ENTER);
	}
}
