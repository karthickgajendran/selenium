package org.sele;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RobotClass {
	public static void main(String[] args) throws AWTException, IOException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\karth\\eclipse-workspace\\org.sele\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

		driver.manage().window().maximize();

		WebElement textbox = driver.findElement(By.id("email"));

		// class for Action
		Actions a = new Actions(driver);
		a.sendKeys(textbox, "karthick").perform();

		a.doubleClick(textbox).perform();

		a.contextClick(textbox).perform();

		// class for Robot

		Robot r = new Robot();

		for (int i = 0; i < 3; i++) {

			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
		}
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		
		
		File temp = ts.getScreenshotAs(OutputType.FILE);
		
		File f=new File("C:\\Users\\karth\\eclipse-workspace\\org.sele\\snaps\\robot.png");
		
		FileUtils.copyFile(temp, f);
		

	}
}
