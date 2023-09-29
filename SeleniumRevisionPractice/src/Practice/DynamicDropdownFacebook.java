package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class DynamicDropdownFacebook {

	public static WebDriver driver;
	
	public void selectYear(String yearFromuser) throws InterruptedException {
		
		 List <WebElement> years = driver.findElements(By.xpath("//*[@id='year']//option")); 
			
		 Thread.sleep(2500);
		 
		 for(WebElement year : years) {
			 String text = year.getText(); 
			 
			 if(text.equals(yearFromuser)) {
				 year.click();
				 break; 
			 }
		 }
	}
	
	
	public void selectMonth(String monthFromuser) throws InterruptedException {
		
		List <WebElement> months = driver.findElements(By.xpath("//*[@id='month']//option"));
		 
		Thread.sleep(2500);
		
		for(WebElement month : months) {
			String text = month.getText(); 
			
			if(text.equalsIgnoreCase(monthFromuser)) {
				month.click();
				break;
			}
		}
		
	}
	
	
	public void selectDay(String dayFromuser) throws InterruptedException {
		
		Thread.sleep(2500);
		
		List <WebElement> days = driver.findElements(By.xpath("//*[@id='day']//option"));
		
		for(int i = 0; i <= days.size(); i++) {
			String text = days.get(i).getText(); 
			
			if(text.equals("1")) {
				days.get(i).click();
				break;
			}
		}
		
	}
	
	
	
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		 driver = new ChromeDriver(); 
		 
		 driver.manage().window().maximize();
		 
		 driver.get("https://mbasic.facebook.com/reg/?cid=103&refsrc=deprecated&_rdr");
		 
		 Thread.sleep(2500);
		 
		
		 
		
		DynamicDropdownFacebook obj = new DynamicDropdownFacebook(); 
		
		obj.selectYear("2000");
		obj.selectMonth("JaN");
		obj.selectDay("1");
	}

}
