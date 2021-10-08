package org.seleni;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practise {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\bhara\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement textusername = driver.findElement(By.id("mail"));
		JavascriptExecutor executor=(JavascriptExecutor) driver;
		executor.executeScript("arguments[0].setattribute('value','welcome')",textusername);
		Object name = executor.executeScript("return arguments[0].getattripute('value')", textusername);
		System.out.println(name);
		WebElement textpassword = driver.findElement(By.id("pass"));
		executor.executeScript("arguments[0].setattribute('value','bhara@05')",textpassword);
		System.out.println();
		WebElement btnlogin = driver.findElement(By.id("login"));
		executor.executeScript("arguments[0].setattribute('value','click')",btnlogin);
		
		
		
		
		
		
		
		
	}
	

}
