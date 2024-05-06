package chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/edit");
		driver.manage().window().maximize();
		
		WebElement textBox1 = driver.findElement(By.id("fullName"));
		textBox1.sendKeys("Dhanalakshmi J");
		
		WebElement textBox2 = driver.findElement(By.id("join"));
		textBox2.sendKeys("Dhanalakshmi J");
		
		WebElement textBox3 = driver.findElement(By.id("getMe"));
		String ab = textBox3.getAttribute("value");
		System.out.println(ab);
		
		WebElement textBox4 = driver.findElement(By.id("clearMe"));
		textBox4.clear();
		
		WebElement textBox5 = driver.findElement(By.id("noEdit"));
		boolean bc = textBox5.isEnabled();
		System.out.println(bc);
		
		WebElement textBox6 = driver.findElement(By.id("dontwrite"));
		String cd = textBox6.getAttribute("readonly");
		System.out.println(cd); 
	
	
	
	}

}
