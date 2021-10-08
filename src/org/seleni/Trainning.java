package org.seleni;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Trainning {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bhara\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		TakesScreenshot c = (TakesScreenshot) driver;
		File s=c.getScreenshotAs(OutputType.FILE);
		File d=new File("C:\\Users\\bhara\\OneDrive\\Pictures\\Saved Pictures\\out.png/");
		FileUtils.copyFile(s, d);
	
				
	

}
}