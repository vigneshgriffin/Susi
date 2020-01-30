package pradhap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath {
  public static void main(String[] args) {
	  //to configure the browser
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jay Kumar\\eclipse-workspace\\selenium"
			+ "\\pradhap\\driver\\chromedriver.exe");
	
	WebDriver d = new ChromeDriver();
	//`to lauch the browser
	d.get("https://www.facebook.com/");
	
	//TO find "find element"
	WebElement username = d.findElement(By.xpath("(//input[@class='inputtext login_form_input_box'])[1]"));
	
	username.sendKeys("pradhap");
	System.out.println("sushiratha");
     
}
}
