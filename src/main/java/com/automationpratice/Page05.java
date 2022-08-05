package com.automationpratice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page05 {

	public WebDriver driver;

	public WebDriver getDriver() {
		return driver;
	}

	public Page05(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@title='View my shopping cart']")
	private WebElement movemycrt;

	public WebElement getMovemycrt() {
		return movemycrt;
	}
	@FindBy (xpath = "//a[@title='Check out']")
	private WebElement cartbtn;

	public WebElement getCartbtn() {
		return cartbtn;
	}
}
