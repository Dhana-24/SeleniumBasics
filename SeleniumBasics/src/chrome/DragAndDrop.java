package chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/dropable");
		driver.manage().window().maximize();
		
		WebElement from = driver.findElement(By.id("draggable"));
		WebElement to = driver.findElement(By.id("droppable"));
		
		Actions action = new Actions(driver);
		//action.click(from).clickAndHold().release(to).build().perform();
		action.dragAndDrop(from, to).build().perform();
		driver.quit();
	}

}
