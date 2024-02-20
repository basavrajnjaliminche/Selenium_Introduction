package Basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	

	public static void main(String[] args) {
		// Chromedriver
		System.setProperty("webdriver.chrome.driver",
				"D:\\SeleniumStudy\\Drivers_for _selenumIntroduction\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//locators
		driver.findElement(By.id("inputUsername")).sendKeys("basu");
		driver.findElement(By.name("inputPassword")).sendKeys("basu111");
		driver.findElement(By.className("signInBtn")).click();
		// Implicit wait 
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		/*
		 * driver.close();// closes the current window driver.quit();// all instances of
		 * browsers are closed
		 */		
	}

}
