package testScript3;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class CheckboxTestCases extends Base {
	@Test
	public void selectCheckbox()
	{
		driver.navigate().to("https://total-qa.com/checkbox-example/");
		WebElement checkbox1=driver.findElement(By.xpath("//*[@id=\"post-3261\"]/div/p/input[1]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		if(!checkbox1.isSelected())
		{
			js.executeScript("arguments[0].click();",checkbox1);
			System.out.println("Now checked");
		}
		
		
	}
	@Test
	public void deSelectetCheckbox()
	{
		driver.navigate().to("https://total-qa.com/checkbox-example/");
		WebElement checkbox1=driver.findElement(By.xpath("//*[@id=\"post-3261\"]/div/p/input[1]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();",checkbox1);
		if(checkbox1.isSelected())
		{
			js.executeScript("arguments[0].click();",checkbox1);
			System.out.println("Deselected");
		}
	}

}
