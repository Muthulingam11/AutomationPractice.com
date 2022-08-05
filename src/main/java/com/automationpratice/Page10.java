package com.automationpratice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page10 {

	public WebDriver driver;

	public WebDriver getDriver() {
		return driver;
	}

	public Page10(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}
	public WebElement getCnfmordr() {
		return cnfmordr;
	}
	@FindBy(xpath = "(//button[@type='submit'])[2]")
	private WebElement cnfmordr;
}
