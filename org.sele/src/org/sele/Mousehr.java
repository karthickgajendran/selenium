package org.sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mousehr {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\karth\\\\eclipse-workspace\\\\org.sele\\\\drivers\\\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/");
		driver.manage().window().maximize();

		Actions a = new Actions(driver);
		WebElement course = driver.findElement(By.xpath("//a[text()='COURSES']"));
		a.moveToElement(course).perform();

		WebElement oracle = driver.findElement(By.xpath("//span[text()='Oracle Training']"));
		a.moveToElement(oracle).perform();

		driver.findElement(By.xpath("//span[text()='Oracle DBA Training']")).click();
		
		
		
	

		
		

		
	}
}
