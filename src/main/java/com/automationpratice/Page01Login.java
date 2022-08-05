package com.automationpratice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page01Login {

	public WebDriver driver;

	public Page01Login(WebDriver dri2) {
		this.driver = dri2;
		PageFactory.initElements(driver, this);
	}

	public WebDriver getDriver() {
		return driver;
	}

	@FindBy(xpath = "//input[@id='email']")
	private WebElement email;

	public WebElement getEmail() {
		return email;
	}

	@FindBy(xpath = "//input[@type='password']")
	private WebElement pass;

	public WebElement getPass() {
		return pass;
	}

	@FindBy(xpath = "(//span)[31]")
	private WebElement loginclick;

	public WebElement getLoginclick() {
		return loginclick;
	}

}
