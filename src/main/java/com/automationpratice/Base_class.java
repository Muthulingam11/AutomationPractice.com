package com.automationpratice;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base_class {

	public static RemoteWebDriver dri; 

	public static RemoteWebDriver getbrowser(String type) {
		if (type.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//chromedriver.exe");
			dri = new ChromeDriver();	
		} else if(type.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Driver//chromedriver.exe");
			dri = new FirefoxDriver();
		}

		dri.manage().window().maximize();
		return dri;	
	}

	public static void geturl(String url) {
		dri.get(url);
	}

	public static void clickelement(WebElement element) {
		element.click();
		
	}

	public static void sendvalues(WebElement element, String values) {
		element.sendKeys(values);
	}

	public static void actionclass(String actions,WebElement element) {
		Actions ac=new Actions(dri);
		if (actions.equalsIgnoreCase("click")) {
			ac.click().perform();
		} else if(actions.equalsIgnoreCase("movetoelement")){
			ac.moveToElement(element).perform();
		} else if(actions.equalsIgnoreCase("rightclick")) {
			ac.contextClick().perform();
		} else if(actions.equalsIgnoreCase("doubleclick")) {
			ac.doubleClick().perform();
		} 
	}

	/*public static void frame(String frametype, String value, WebElement element) {
    	if (frametype.equalsIgnoreCase("id")) {
			dri.switchTo().frame(value);
		} else if (frametype.equalsIgnoreCase("framebyindex")){
			int index = Integer.parseInt(value);
			dri.switchTo().frame(index);
		}else if(frametype.equalsIgnoreCase("frameelement")) {
			dri.switchTo().frame(element);
		}else if (frametype.equalsIgnoreCase("parentframe")) {
			dri.switchTo().parentFrame();
		}else if(frametype.equalsIgnoreCase("defaultcontent")) {
			dri.switchTo().defaultContent();
		}
    }*/

	public static void iframes(String frametype, WebElement element) {
		if (frametype.equalsIgnoreCase("frameByelement")) {
			dri.switchTo().frame(element);
		}

	}

	public static void jsscroll(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) dri;
		js.executeScript("arguments[0].scrollIntoView();", element);

	}


	/*
	 * public static void wait(int longtime) {
	 * dri.manage().timeouts().implicitlyWait(longtime, TimeUnit.SECONDS); }
	 */

	public static void wait(int longtime) {
		dri.manage().timeouts().implicitlyWait(Duration.ofSeconds(longtime)); 
	}

	/*
	 * public static void Expwait(String waittype,int expwait,WebElement element) {
	 * WebDriverWait wait = new WebDriverWait(dri,expwait);
	 * wait.until(ExpectedConditions.invisibilityOfAllElements(element)); }
	 */

	public static void Expwait(String waittype,int expwait,WebElement element) {
		WebDriverWait wait = new WebDriverWait(dri,Duration.ofSeconds(expwait));
		wait.until(ExpectedConditions.invisibilityOfAllElements(element));
	}
	
	public static void Expwait1(int expwait,WebElement element) {
		WebDriverWait wait = new WebDriverWait(dri,Duration.ofSeconds(expwait));
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	

	public static void alert(String alert,String value) {
		if (alert.equalsIgnoreCase("confirm")) {
			dri.switchTo().alert().accept();
		} else if(alert.equalsIgnoreCase("dismiss")) {
			dri.switchTo().alert().dismiss();
		} else if(alert.equalsIgnoreCase("textpass")) {
			dri.switchTo().alert().sendKeys(value);
		} 
	}

	public static void selection(WebElement element,String dropdown,String value,String index,String text) {
		Select s = new Select(element);
		if (dropdown.equalsIgnoreCase("value")) {
			s.selectByValue(value);
		} else if(dropdown.equalsIgnoreCase("index")){
			int inti = Integer.parseInt(index);
			s.selectByIndex(inti);
		} else if(dropdown.equalsIgnoreCase("visibletest")) {
			s.selectByVisibleText(text);
		} else if(dropdown.equalsIgnoreCase("deselectvalue")) {
			s.deselectByValue(value);
		} else if(dropdown.equalsIgnoreCase("deselectindex")) {
			int int1 = Integer.parseInt(index);
			s.deselectByIndex(int1);
		}
	}

	public static void threadsleep(int millisec) throws Throwable {
		Thread.sleep(millisec);
	}

	public static void navigationrefresh() {
		dri.navigate().refresh();
	}
}
