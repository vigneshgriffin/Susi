package pradhap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample1 {
	public static void main(String[] args) {
		// to configure the browser
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jay Kumar\\eclipse-workspace\\selenium\\"
				+ "pradhap\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// to launch the browser
		
		driver.get("https://www.cleartrip.com/trains");
		
		WebElement user = driver.findElement(By.xpath("//input[@id='from_station']"));
		
		user.sendKeys("pattukkotai");
		
		WebElement user1 = driver.findElement(By.id("to_station"));
		
		user1.sendKeys("chennai");
		
	}
 
}
