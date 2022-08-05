package com.automationpracticeMaven;

import org.openqa.selenium.WebDriver;
import com.automationpratice.Base_class;
import com.automationpratice.Page01Login;
import com.automationpratice.Page01;
import com.automationpratice.Page02;
import com.automationpratice.Page03;
import com.automationpratice.Page04;
import com.automationpratice.Page05;
import com.automationpratice.Page06;
import com.automationpratice.Page07;
import com.automationpratice.Page08;
import com.automationpratice.Page09;
import com.automationpratice.Page10;


public class Runnerpom extends Base_class{

	public static WebDriver driver = getbrowser("chrome");
	public static Page01 pg1 = new Page01(driver);
	public static Page01Login lg = new Page01Login(driver);
	public static Page02 pg2 = new Page02(driver);
	public static Page03 pg3 = new Page03(driver);
	public static Page04 pg4 = new Page04(driver);
	public static Page05 pg5 = new Page05(driver);
	public static Page06 pg6 = new Page06(driver);
	public static Page07 pg7 = new Page07(driver);
	public static Page08 pg8 = new Page08(driver);
	public static Page09 pg9 = new Page09(driver);
	public static Page10 pg10 = new Page10(driver);

	public static void main(String[] args) {
		geturl("http://automationpractice.com/index.php");
		wait(10);
		Expwait1(10, pg1.getSignin());
		clickelement(pg1.getSignin());
		sendvalues(lg.getEmail(), "lemonstech@gmail.com");
		sendvalues(lg.getPass(), "lemonstechjanbatch");
		clickelement(lg.getLoginclick());
		actionclass("movetoelement", pg2.getTclickmove());
		actionclass("click", pg2.getTclickmove());
		jsscroll(pg3.getScroll());
		actionclass("movetoelement", pg3.getImgmove());
		actionclass("click", pg3.getQuickview());
		iframes("frameByelement", pg4.getSwitchframe());
		clickelement(pg4.getClickaddto());
		navigationrefresh();
		actionclass("movetoelement", pg5.getMovemycrt());
		actionclass("click", pg5.getCartbtn());
		clickelement(pg6.getPrcdtochckot());
		clickelement(pg7.getPrcssAddss());
		clickelement(pg8.getChkbx());
		clickelement(pg8.getPrcdtockout());
		clickelement(pg9.getChq());
		clickelement(pg10.getCnfmordr());
	}
}
