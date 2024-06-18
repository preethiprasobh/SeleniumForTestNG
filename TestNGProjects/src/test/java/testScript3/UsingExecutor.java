package testScript3;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class UsingExecutor extends Base {
@Test
	public void showMessage()
	{
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement singleinputfield=driver.findElement(By.xpath("//input[@id='single-input-field']"));
		singleinputfield.sendKeys("Hello All");
		WebElement button1=driver.findElement(By.xpath("//button[@id='button-one']"));
		js.executeScript("arguments[0].click();",button1);	
		
	}
@Test
public void getTotal()
{
	driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
	JavascriptExecutor js = (JavascriptExecutor) driver;
	WebElement valueA=driver.findElement(By.xpath("//input[@id='value-a']"));
	WebElement valueB=driver.findElement(By.xpath("//input[@id='value-b']"));
	valueA.sendKeys("67");
	valueB.sendKeys("98");
	WebElement button2=driver.findElement(By.xpath("//button[@id='button-two']"));
	js.executeScript("arguments[0].click();",button2);
	
}
@Test
public void javaScriptSample1()
{
	driver.navigate().to("https://www.amazon.in/");
	JavascriptExecutor js = (JavascriptExecutor) driver;
	//js.executeScript("window.scrollBy(0,150)","");// to scroll vertically by 150 pixels and no horizontal scrolling
	//js.executeScript("window.scrollBy(0,-100)","");//second parameter stands for some additional arguments to pass
/*-100 indicates vertical scrolling in the negative direction, which means scrolling upwards by 100 pixels.*/
	js.executeScript("window.scrollBy(0,document.body.scrollHeight)","");
	/*directs the WebDriver to execute JavaScript that scrolls the current browser window down
	by an amount equal to the total height of the document's body*/

}
		

	}


