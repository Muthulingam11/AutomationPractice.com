package com.automationpratice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page02 {

	public WebDriver driver;

	public WebDriver getDriver() {
		return driver;
	}

	public Page02(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//a[@title='T-shirts'])[2]")
	private WebElement tclickmove;

	public WebElement getTclickmove() {
		return tclickmove;
	}
}
