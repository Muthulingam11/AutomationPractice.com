package com.automationpracticeTestNG;

import org.apache.log4j.BasicConfigurator;
import java.util.*;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import com.automationpratice.Pommanage;
//import Maven.test.Base_class;
//import Maven.test.Pommanage;
//import propertyfile.Configuration_Reader;
//import propertyfile.File_Reader_Manager;
import com.automationpratice.Base_class;
import com.automationpraticePropertyfile.File_Reader_Manager;
import com.automationpraticePropertyfile.Configuration_Reader;

public class PomManageRunner extends Base_class {

	public static WebDriver driver = getbrowser("chrome");
	public static Pommanage pom = new Pommanage(driver);
	static Logger log = Logger.getLogger(PomManageRunner.class);

	@Test(priority = 1)
	void automationpagelogin() throws Throwable  {
		BasicConfigurator.configure();
		PropertyConfigurator.configure("log4j.properties");
		String url = File_Reader_Manager.getInstanceFRM().getInstanceCR().geturl();
		geturl(url);
		log.info("Browser Launced");
	}

	@Test(priority = 2)
	void signin() throws Throwable {
		clickelement(pom.getInstancePg().getSignin());
		log.warn("site going to login");
		String email = File_Reader_Manager.getInstanceFRM().getInstanceCR().getemail();
		sendvalues(pom.getInstancelg().getEmail(), email);
		String password = File_Reader_Manager.getInstanceFRM().getInstanceCR().getpassword();
		sendvalues(pom.getInstancelg().getPass(), password);
		clickelement(pom.getInstancelg().getLoginclick());
		log.info("Logined successfully");
	}

	@Test(priority = 3)
	void performingtasks() {

		actionclass("movetoelement", pom.getInstancepg2().getTclickmove());
		actionclass("click", pom.getInstancepg2().getTclickmove());
		jsscroll(pom.getInstancepg3().getScroll());
		actionclass("movetoelement", pom.getInstancepg3().getImgmove());
		actionclass("click", pom.getInstancepg3().getQuickview());
		iframes("frameByelement", pom.getInstancepg4().getSwitchframe());
		clickelement(pom.getInstancepg4().getClickaddto());
		navigationrefresh();
		actionclass("movetoelement", pom.getInstancepg5().getMovemycrt());
		actionclass("click", pom.getInstancepg5().getCartbtn());
		clickelement(pom.getInstancepg6().getPrcdtochckot());
		clickelement(pom.getInstancepg7().getPrcssAddss());
		clickelement(pom.getInstancepg8().getChkbx());
		clickelement(pom.getInstancepg8().getPrcdtockout());
		clickelement(pom.getInstancepg9().getChq());
		clickelement(pom.getInstancepg10().getCnfmordr());
		log.info("order completed successfully");
	}
}
