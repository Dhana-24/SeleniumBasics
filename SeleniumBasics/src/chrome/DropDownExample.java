package chrome;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/dropdowns");
		driver.manage().window().maximize();
		
		WebElement dropDown = driver.findElement(By.id("fruits"));
		Select select = new Select(dropDown);
		select.selectByIndex(2);
		select.selectByValue("4");
		select.selectByVisibleText("Pine Apple");
		
		List<WebElement> listElement = select.getOptions();
		int size = listElement.size();
		for(int i =0 ; i<size; i++) {
			System.out.println(listElement.get(i).getText());
		}
		
		WebElement multiselect = driver.findElement(By.id("superheros"));
		
		Select mulselect = new Select(multiselect);
		
		mulselect.selectByValue("am");
		mulselect.selectByValue("aq");
		mulselect.selectByValue("ta");
		mulselect.selectByValue("bt");
	}

}
