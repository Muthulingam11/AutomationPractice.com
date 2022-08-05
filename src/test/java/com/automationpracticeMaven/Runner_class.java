package com.automationpracticeMaven;

import static org.junit.Assert.assertTrue;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.automationpratice.Base_class;


public class Runner_class extends Base_class{

	public static void main(String[] args) throws Throwable {
		getbrowser("chrome");
		wait(10);
		geturl("http://automationpractice.com/index.php");
		WebElement login = dri.findElement(By.className("login"));
//		Actions ac=new Actions(dri);
//		ac.moveToElement(login).perform();
//		ac.click(login).perform();
		Expwait1(10, login);
		clickelement(login);
		WebElement email = dri.findElement(By.xpath("//input[@id='email']"));
		sendvalues(email, "lemonstech@gmail.com");
		WebElement pass = dri.findElement(By.xpath("//input[@type='password']"));
		sendvalues(pass, "lemonstechjanbatch");
		WebElement loginclick = dri.findElement(By.xpath("(//span)[31]"));
		clickelement(loginclick);
		WebElement Tshirt = dri.findElement(By.xpath("(//a[@title='T-shirts'])[2]"));
		actionclass("movetoelement", Tshirt);
		actionclass("click", Tshirt);
		WebElement scroll = dri.findElement(By.xpath("//label[@for='layered_id_feature_17']"));
		jsscroll(scroll);
		WebElement view = dri.findElement(By.xpath("(//img[@class='replace-2x img-responsive'])[2]"));
		actionclass("movetoelement", view);
		WebElement quickview = dri.findElement(By.className("quick-view"));
		actionclass("click", quickview);
		WebElement frame = dri.findElement(By.xpath("//iframe"));
		iframes("frameByelement", frame);
		dri.findElement(By.cssSelector("button[name='Submit'] span")).click();
		threadsleep(1000);
		navigationrefresh();
		WebElement mycart = dri.findElement(By.xpath("//a[@title='View my shopping cart']"));
		actionclass("movetoelement", mycart);
		WebElement viewcart = dri.findElement(By.xpath("//a[@id='button_order_cart']"));
		actionclass("click", viewcart);
		WebElement proceed = dri.findElement(By.xpath("(//a)[36]"));
		jsscroll(proceed);
		//actionclass("click", proceed);
		dri.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]")).click();

		dri.findElement(By.xpath("//button[@name='processAddress']")).click();

		dri.findElement(By.xpath("//input[@type='checkbox']")).click();

		dri.findElement(By.xpath("//button[@name='processCarrier']")).click();

		dri.findElement(By.xpath("//a[@class='cheque']")).click();

		dri.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
	}
}
