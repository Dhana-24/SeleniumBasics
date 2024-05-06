package chrome;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/windows");
		driver.manage().window().maximize();
		
		String oldWindow = driver.getWindowHandle();
		
		WebElement firstClick = driver.findElement(By.id("home"));
		firstClick.click();
		
		Set<String> windows = driver.getWindowHandles();
		
		for (String newWindow : windows) {
			driver.switchTo().window(newWindow);
		}
		
		WebElement insideWindow = driver.findElement(By.xpath("/html/body/app-root/app-test-site/section[2]/div/div/div/div[1]/app-menu/div/footer"));
		insideWindow.click();
		Thread.sleep(5000);
		driver.close();
		driver.switchTo().window(oldWindow);
		
		
		
		
		
		
		
		
		
	}

}
