package chrome;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/alert");
		driver.manage().window().maximize();

		WebElement simpleAlert = driver.findElement(By.id("accept"));
		simpleAlert.click();
		Thread.sleep(3000);
		Alert alert = driver.switchTo().alert();
		alert.accept();
		Thread.sleep(3000);
		
		WebElement dismissAlert = driver.findElement(By.id("confirm"));
		dismissAlert.click();
		Thread.sleep(3000);  
		Alert alert2 = driver.switchTo().alert(); 
		alert2.dismiss();
		
		Thread.sleep(3000);
		
		WebElement promptAlert = driver.findElement(By.id("prompt"));
		promptAlert.click();
		
		Alert alert3 = driver.switchTo().alert();
		//Thread.sleep(3000);
		alert3.sendKeys("Dhanalakshmi J");
		Thread.sleep(3000);
		alert3.accept();
		
		 
	}

}
