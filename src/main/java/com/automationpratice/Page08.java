package com.automationpratice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page08 {

	public WebDriver driver;

	public WebDriver getDriver() {
		return driver;
	}

	public Page08(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@type='checkbox']")
	private WebElement chkbx;

	public WebElement getChkbx() {
		return chkbx;
	}
	@FindBy(xpath = "//button[@name='processCarrier']")
	private WebElement prcdtockout;

	public WebElement getPrcdtockout() {
		return prcdtockout;
	}
}
