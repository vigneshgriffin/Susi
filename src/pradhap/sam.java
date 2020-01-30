package pradhap;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sam {
	public static void main(String[] args) throws InterruptedException {
		//to configure the browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jay Kumar"
	    + "\\eclipse-workspace\\selenium\\pradhap\\driver\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		//to launch webpage
		d.get("https://www.irctc.co.in/nget/train-search");
		//findelement
		WebElement from = d.findElement(By.xpath("//input[@type='text'][1]"));
		from.sendKeys("chennai");
		System.out.println("hi");
		System.out.println("hi");
		System.out.println("hi");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
