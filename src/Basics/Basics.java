package Basics;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;


public class Basics  {

	public static void main(String[] args) {

		//Invoking Browser
		// Chrome -- ChromeDriver(Class)---Methods
		// Firefox -- FirefoxDriver(Class)---Methods
		
		// chromedriver.exe file you should download frome chrome browser 
		// step to invoke chrome driver 
		//selenium manager is new library for the new selenium 4 
		
		//firefox driver
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumStudy\\Drivers_for _selenumIntroduction\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		
		//geko driver firefox driver
		System.setProperty("webdriver.geko.driver", "D:\\SeleniumStudy\\Drivers_for _selenumIntroduction\\geckodriver.exe");
		WebDriver driver1= new FirefoxDriver();
		
		//edge driver
		System.setProperty("webdriver.edge.driver", "D:\\SeleniumStudy\\Drivers_for _selenumIntroduction\\msedgedriver.exe");
		WebDriver driver2= new EdgeDriver();
		
		driver.get("https://rahulshettyacademy.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());//gives current url
		driver.close();// closes the current window
		driver.quit();// all instances of browsers are closed 

	}

}
