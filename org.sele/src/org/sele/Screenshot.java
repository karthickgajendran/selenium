package org.sele;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\karth\\eclipse-workspace\\org.sele\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");

		driver.manage().window().maximize();

		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();

		TakesScreenshot ts = (TakesScreenshot) driver;
		
		File temp = ts.getScreenshotAs(OutputType.FILE);
		
		File perm=new File("C:\\Users\\karth\\eclipse-workspace\\org.sele\\snaps\\flipkart.png");
		
		FileUtils.copyFile(temp, perm);
		

	}

}
