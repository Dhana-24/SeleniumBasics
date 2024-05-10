package chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ButtonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/test");
		driver.manage().window().maximize();
		
		WebElement firstClick = driver.findElement(By.xpath("/html/body/app-root/app-test-site/section[2]/div/div/div/div[2]/app-menu/div/footer/a"));
		firstClick.click();
		
		WebElement secondClick = driver.findElement(By.id("home"));
		secondClick.click();
		driver.navigate().back(); //navigating back 
		
		//
		
		WebElement thirdClick = driver.findElement(By.id("position"));
		Point xy = thirdClick.getLocation();
		int x = xy.getX();
		int y = xy.getY();
		System.out.println("X value is: "+x + " and Y value is "+y );
		
		WebElement fourthClick = driver.findElement(By.id("color"));
		String color = fourthClick.getCssValue("background-color");
		System.out.println(color);
		
		WebElement fifthClick = driver.findElement(By.id("property"));
		int height = fifthClick.getSize().getHeight();
		int width = fifthClick.getSize().getWidth();
		System.out.println(height);
		System.out.println(width);
		
		WebElement sixthClick = driver.findElement(By.id("isDisabled"));
		boolean b = sixthClick.isEnabled();
		System.out.println(b);
		
		
		WebElement a = driver.findElement(By.xpath("//*[@id=\"isDisabled\"]"));
		Actions action = new Actions(driver);
		
		action.clickAndHold(a).perform();
		
		
	}

}
