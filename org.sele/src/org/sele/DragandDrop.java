package org.sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\karth\\Downloads\\chromedriver_win32 (1)");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();

		Actions a = new Actions(driver);

		WebElement rupee = driver.findElement(By.xpath("(//a[@class='button button-orange'])[4]"));

		WebElement amount = driver.findElement(By.xpath("(//li[@class='placeholder'])[4]"));

		a.dragAndDrop(rupee, amount).perform();
		Thread.sleep(4000);

		WebElement source = driver.findElement(By.xpath("(//a[@class='button button-orange'])[6]"));

		WebElement destini = driver.findElement(By.xpath("(//li[@class='placeholder'])[3]"));
		
		a.dragAndDrop(source, destini).perform();
	}

}
