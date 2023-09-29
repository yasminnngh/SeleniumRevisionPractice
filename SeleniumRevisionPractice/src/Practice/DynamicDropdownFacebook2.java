package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropdownFacebook2 {

	public static WebDriver driver; 
	
	public void selectYear(String yearFromuser) throws InterruptedException {
		
		List <WebElement> years = driver.findElements(By.xpath("//*[@id='year']//option"));
		 
		 for(WebElement year : years) {
			 String text = year.getText(); 
			 
			 
			 if(text.equals(yearFromuser)) {
				 year.click(); 
				 break;
			 }
		 }
		 
		 Thread.sleep(2500);
		
	}
	
	public void selectMonth(String monthFromuser) throws InterruptedException {
		
		List <WebElement> months = driver.findElements(By.xpath("//*[@id='month']//option"));
		 
		 for(WebElement month : months) {
			String text = month.getText();
			
			if(text.equalsIgnoreCase(monthFromuser)) {
				month.click();
				break;
			}
		 }
		 
		 Thread.sleep(2500);
	}
	
	
	public void selectDay(String DayfromUser) {
		
	 List <WebElement> days = driver.findElements(By.xpath("//*[@id='day']//option"));
		 
		 for(int i = 0; i <= days.size(); i++) {
			String text = days.get(i).getText();
			
			if(text.equals(DayfromUser)) {
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
		 
	
		 
		 DynamicDropdownFacebook2 obj = new DynamicDropdownFacebook2();
		 
		 obj.selectYear("1980");
		 obj.selectMonth("Dec");
		 obj.selectDay("31");
	}

}
