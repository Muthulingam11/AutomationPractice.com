package com.automationpratice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page07 {

	public WebDriver driver;

	public WebDriver getDriver() {
		return driver;
	}

	public Page07(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button[@name='processAddress']")
	private WebElement prcssAddss;

	public WebElement getPrcssAddss() {
		return prcssAddss;
	}
}
