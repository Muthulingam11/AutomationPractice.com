package com.automationpracticeTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.TestRunner.PriorityWeight;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class Login {

	public static WebDriver driver;

	@Parameters({"emailid","password","browser"})
	@Test(priority = 1)

	void loginto(String email,String password,String browser) {
		switch (browser) {
		case "Chrome":
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Muthu\\eclipse-workspace\\test\\chromedriver.exe");
			driver = new ChromeDriver();
			break;

		case"Firefox":
			System.setProperty("Webdriver.gecko.driver", "C:\\Users\\Muthu\\eclipse-workspace\\test\\geckodriver.exe");
			driver = new FirefoxDriver();
			break;
		default:
			break;
		}
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Muthu\\eclipse-workspace\\test\\chromedriver.exe");
		//System.setProperty("Webdriver.gecko.driver", "C:\\Users\\Muthu\\eclipse-workspace\\test\\geckodriver.exe");
		//WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[contains(text(),'Sign in')]")).click();
		WebElement id = driver.findElement(By.xpath("//input[@id='email']"));

		id.sendKeys(email);
		WebElement pass = driver.findElement(By.xpath("//input[@id='passwd']"));

		pass.sendKeys(password);
		driver.findElement(By.xpath("(//span[normalize-space()='Sign in'])[1]")).click();

	}

	@Test(priority = 2)
	private void quit() {
		driver.quit();
	}
}
