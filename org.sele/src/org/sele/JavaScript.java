package org.sele;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\karth\\eclipse-workspace\\org.sele\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		driver.manage().window().maximize();

		WebElement textmail = driver.findElement(By.id("email"));

		// for sendkeys us javascript

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].setAttribute('value','green')", textmail);

		// to retrive the enterd text

		Object rtn = js.executeScript("return arguments[0].getAttribute('value')", textmail);
		System.out.println(
				rtn);

		WebElement btnlogin = driver.findElement(By.name("login"));
		js.executeScript("arguments[0].click()", btnlogin);

	}

}
