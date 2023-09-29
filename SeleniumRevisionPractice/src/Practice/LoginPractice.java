package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPractice {

	public static WebDriver driver; 
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		 driver = new ChromeDriver(); 
		
		driver.manage().window().maximize();
		
		driver.get("https://www.saucedemo.com/inventory.html");
		
		Thread.sleep(2500);
		
		
		WebElement username = driver.findElement(By.xpath("//input[@id='user-name']"));
		username.sendKeys("standard_user");
		
		Thread.sleep(2500);
		
		
		WebElement password = driver.findElement(By.xpath("//Input[@id='password']"));
		password.sendKeys("secret_sauce");
		
		Thread.sleep(2500);
		
		
		WebElement loginButton = driver.findElement(By.xpath("//input[@id='login-button']"));
		loginButton.click();
		
		
	}

}
