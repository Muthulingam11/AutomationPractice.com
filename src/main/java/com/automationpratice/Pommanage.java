package com.automationpratice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Pommanage {

	public WebDriver driver;

	public WebDriver getDriver() {
		return driver;
	}

	public Pommanage(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}


	private Page01 pg;
	private Page01Login lg;
	private Page02 pg2;
	private Page03 pg3;
	private Page04 pg4;
	private Page05 pg5;
	private Page06 pg6;
	private Page07 pg7;
	private Page08 pg8;
	private Page09 pg9;
	private Page10 pg10;

	public Page01 getInstancePg() {
		if(pg==null) {
			pg = new Page01(driver); 
		}
		return pg;
	}
	public Page01Login getInstancelg() {
		if(lg==null) {
			lg = new Page01Login(driver); 
		}
		return lg;
	}
	public Page02 getInstancepg2() {
		if(pg2==null) {
			pg2 = new Page02(driver);
		}
		return pg2;
	}
	public Page03 getInstancepg3() {
		if(pg3==null) {
			pg3 = new Page03(driver);
		}
		return pg3;
	}
	public Page04 getInstancepg4() {
		if(pg4==null) {
			pg4 = new Page04(driver);
		}
		return pg4;
	}
	public Page05 getInstancepg5() {
		if(pg5==null) {
			pg5 = new Page05(driver);
		}
		return pg5;
	}
	public Page06 getInstancepg6() {
		if(pg6==null) {
			pg6 = new Page06(driver);
		}
		return pg6;
	}
	public Page07 getInstancepg7() {
		if(pg7==null) {
			pg7 = new Page07(driver);
		}
		return pg7;
	}
	public Page08 getInstancepg8() {
		if(pg8==null) {
			pg8 = new Page08(driver);
		}
		return pg8;
	}
	public Page09 getInstancepg9() {
		if(pg9==null) {
			pg9 = new Page09(driver);
		}
		return pg9;
	}
	public Page10 getInstancepg10() {
		if(pg10==null) {
			pg10 = new Page10(driver);
		}
		return pg10;
	}
}
