package chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/frame");
		driver.manage().window().maximize();
		
		driver.switchTo().frame("firstFr");
		WebElement firstName = driver.findElement(By.name("fname"));
		firstName.sendKeys("Dhanalakshmi J");
		
		WebElement lastName = driver.findElement(By.name("lname"));
		lastName.sendKeys("J");
		
		
		driver.switchTo().frame(1);
		driver.findElement(By.name("email")).sendKeys("dhana123@gmail.com");
		
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/app-root/app-frames/section[1]/div/div/div[2]/app-learning-point/div/footer/a")).click();
		driver.quit();
		
	}

}
