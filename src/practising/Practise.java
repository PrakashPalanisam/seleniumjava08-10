package practising;

import java.awt.Frame;
import java.util.List;
import java.util.Set;

import javax.xml.transform.Templates;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.ClearElement;
import org.openqa.selenium.remote.server.handler.SwitchToFrame;

public class Practise {
	public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\bhara\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement txtsearch = driver.findElement(By.id("twotabsearchtextbox"));
		txtsearch.sendKeys("iphone",Keys.ENTER);
		WebElement lnkiphone = driver.findElement(By.xpath("//span[text()='New Apple iPhone 11 (64GB) - Purple']"));
		lnkiphone.click();
		
		String ParentwindowId = driver.getWindowHandle();
		System.out.println(ParentwindowId);
		
		Set<String> allwindowsId = driver.getWindowHandles();
		System.out.println(allwindowsId );
		
	for (String k :allwindowsId ) {
		if (!ParentwindowId.equals(allwindowsId)) {
			driver.switchTo().window(k);
			
		}
		
	}
	WebElement cart = driver.findElement(By.id("add-to-cart-button"));
cart.click();


driver.switchTo().window(ParentwindowId);


WebElement txtsearch1 = driver.findElement(By.id("twotabsearchtextbox"));
txtsearch1.clear();
txtsearch1.sendKeys("Mi phone",Keys.ENTER);

Thread.sleep(3000);


driver.switchTo().window(ParentwindowId);


WebElement txtsearch2 = driver.findElement(By.id("twotabsearchtextbox"));
txtsearch2.clear();
txtsearch2.sendKeys("Samsung phone",Keys.ENTER);

driver.quit();








	}
}
 
	 
	 
	 
	


