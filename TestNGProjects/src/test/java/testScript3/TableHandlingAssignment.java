package testScript3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TableHandlingAssignment extends Base {
	@Test
	public void tableTestNG()
	{
		driver.navigate().to("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
		WebElement table=driver.findElement(By.xpath("//table[@id='customers']"));
		System.out.println(table.getText());
		System.out.println();
		
		System.out.println("Row Printing");
		WebElement table1=driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[1]"));
		System.out.println(table1.getText());
		System.out.println();
		
		System.out.println("particular value in a cell");
		WebElement table2=driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[2]/td[3]"));
		System.out.println(table2.getText());
		System.out.println();
		
		System.out.println("coloumn Printing");
		List<WebElement> table3=driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td[3]"));
		for(WebElement lists:table3)
		{
			System.out.println(lists.getText());
		}
		System.out.println();
		
		
		
		
	}

}
