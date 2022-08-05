package com.automationpratice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page06 {

	public WebDriver driver;

	public WebDriver getDriver() {
		return driver;
	}

	public Page06(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	@FindBy (xpath = "(//a[@title='Proceed to checkout'])[2]")
	private WebElement prcdtochckot;

	public WebElement getPrcdtochckot() {
		return prcdtochckot;
	}
}
