package chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/radio");
		driver.manage().window().maximize();
		
		WebElement radio1 = driver.findElement(By.id("yes"));
		radio1.click();
		
		WebElement radio2 = driver.findElement(By.id("notfoo"));
		Boolean b = radio2.isSelected();
		
		System.out.println(b);

		WebElement radio3 = driver.findElement(By.id("maybe"));
		Boolean a = radio3.isEnabled();
		
		System.out.println(a);
		
		
		
	}

}
