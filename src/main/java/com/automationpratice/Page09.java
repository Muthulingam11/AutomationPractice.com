package com.automationpratice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page09 {

	public WebDriver driver;

	public WebDriver getDriver() {
		return driver;
	}

	public Page09(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@class='cheque']")
	private WebElement chq;

	public WebElement getChq() {
		return chq;
	}
}
