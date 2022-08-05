package com.automationpratice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page04 {

	public WebDriver driver;

	public WebDriver getDriver() {
		return driver;
	}

	public Page04(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//iframe")
	private WebElement switchframe;

	public WebElement getSwitchframe() {
		return switchframe;
	}

	@FindBy(xpath = "//button[@name=\'Submit\']")
	private WebElement clickaddto;

	public WebElement getClickaddto() {
		return clickaddto;
	}

	@FindBy (xpath = "//a[@title='Proceed to checkout']")
	private WebElement proceed;

	public WebElement getProceed() {
		return proceed;
	}
}
