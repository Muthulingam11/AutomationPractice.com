package com.automationpratice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page01 {

	public WebDriver driver;

	public WebDriver getDriver() {
		return driver;
	}

	public Page01(WebDriver dri2) {
		this.driver = dri2;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@class='login']")
	private WebElement Signin;

	public WebElement getSignin() {
		return Signin;
	}
}
