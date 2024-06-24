package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;


public class DragandDrop extends Base {
	@Test
	public void dragAndDrop()
	{
		driver.navigate().to("https://webdriveruniversity.com/Actions/index.html");
		WebElement dragelement=driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement dropzone=driver.findElement(By.xpath("//div[@id='droppable']"));
		Actions dragging=new Actions(driver);
		dragging.moveToElement(dragelement).build().perform();
		dragging.doubleClick();
		dragging.dragAndDrop(dragelement, dropzone).build().perform();
		
		WebElement clickbox=driver.findElement(By.xpath("//div[@id='click-box']"));
		dragging.clickAndHold(clickbox).build().perform();
		
		WebElement doubleclickbox=driver.findElement(By.xpath("//div[@id='double-click']"));
		dragging.doubleClick(doubleclickbox).build().perform();
		
	}

}
