package com.automationpratice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page03 {

	public WebDriver driver;

	public WebDriver getDriver() {
		return driver;
	}

	public Page03(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//label[@for='layered_id_feature_17']")
	private WebElement scroll;

	public WebElement getScroll() {
		return scroll;
	}

	@FindBy(xpath = "(//img[@class='replace-2x img-responsive'])[2]")
	private WebElement imgmove;

	public WebElement getImgmove() {
		return imgmove;
	}

	@FindBy(xpath = "//a[@class='quick-view']")
	private WebElement quickview;

	public WebElement getQuickview() {
		return quickview;
	}
}
