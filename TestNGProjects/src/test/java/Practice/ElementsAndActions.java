package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class ElementsAndActions extends Base {
	@Test
	public void dropDown()
	{
		driver.navigate().to("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement drop1=driver.findElement(By.xpath("//select[@id='dropdowm-menu-1']"));
		Select drop1obj=new Select(drop1);
		drop1obj.selectByVisibleText("Python");
		WebElement drop2=driver.findElement(By.xpath("//select[@id='dropdowm-menu-2']"));
		Select drop2obj=new Select(drop2);
		drop2obj.selectByValue("testng");
		WebElement drop3=driver.findElement(By.xpath("//select[@id='dropdowm-menu-3']"));
		Select drop3obj=new Select(drop3);
		drop3obj.selectByIndex(1);
		
	}@Test
	public void checkBox()
	{
		driver.navigate().to("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement drop1=driver.findElement(By.xpath("//input[@value='option-1']"));
		WebElement drop2=driver.findElement(By.xpath("//input[@value='option-2']"));
		WebElement drop3=driver.findElement(By.xpath("//input[@value='option-3']"));
		WebElement drop4=driver.findElement(By.xpath("//input[@value='option-4']"));
		if(drop1.isSelected())
		{
			drop1.click();
			System.out.println("option 1 is deselected");
		}
			else if(drop2.isSelected())
			{
				drop2.click();
				System.out.println("option 2 is deselected");
			}
				else if(drop3.isSelected())
				{
					drop3.click();
					System.out.println("option 3 is deselected");
				}
					else 
					{
						drop4.click();
						System.out.println("option 4 is deselected");
					}
		drop1.click();
		System.out.println("Option is selected");
					
	}
	@Test
	public void radioButton()
	{
		driver.navigate().to("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement radio1=driver.findElement(By.xpath("//input[@value='green']"));
		WebElement radio2=driver.findElement(By.xpath("//input[@value='blue']"));
		WebElement radio3=driver.findElement(By.xpath("//input[@value='yellow']"));
		WebElement radio4=driver.findElement(By.xpath("//input[@value='orange']"));
		WebElement radio5=driver.findElement(By.xpath("//input[@value='purple']"));
		boolean anyRadioSelected = false;

		if (radio1.isSelected() || radio2.isSelected() || radio3.isSelected() || radio4.isSelected() || radio5.isSelected()) 
		{
		    anyRadioSelected = true;
		    radio1.click();
		}

		else
		{
		    radio2.click();
		    System.out.println("Selected radio2 because no other radio button was selected.");
		}
	}
	@Test
	public void radioDropdownDisabled()
	{
		driver.navigate().to("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement radio1=driver.findElement(By.xpath("//input[@value='lettuce']"));
		WebElement radio2=driver.findElement(By.xpath("//input[@value='cabbage']"));
		WebElement radio3=driver.findElement(By.xpath("//input[@value='pumpkin']"));
		
		
		boolean anyRadioDisabled;
		if (!radio1.isEnabled()) {
		    anyRadioDisabled = true;
		    System.out.println("radio1 is disabled");
		}
		if (!radio2.isEnabled()) {
		    anyRadioDisabled = true;
		    System.out.println("radio2 is disabled");
		}
		if (!radio3.isEnabled()) {
		    anyRadioDisabled = true;
		    System.out.println("radio3 is disabled");
		}
		radio1.click();
		System.out.println("radio1 is selected");
		
		WebElement dropdown=driver.findElement(By.xpath("//select[@id='fruit-selects']"));
		
		Select dropdownList = new Select(dropdown);
		List<WebElement> options = dropdownList.getOptions();

		boolean anyOptionDisabled = false;

		for (WebElement option : options) {
		    if (!option.isEnabled()) {
		        anyOptionDisabled = true;
		        System.out.println("Disabled option: " + option.getText());
		    }
		}
		    
		    dropdownList.selectByIndex(2);
		}
	}

		
	
		
	



