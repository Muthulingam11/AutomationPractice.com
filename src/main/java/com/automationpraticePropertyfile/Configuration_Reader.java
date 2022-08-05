package com.automationpraticePropertyfile;

import java.io.*;
import java.util.*;
import java.util.Properties;

public class Configuration_Reader {

	public static Properties prof;

	public Configuration_Reader() throws Throwable {
		File f = new File("C:\\Users\\Muthu\\eclipse-workspace\\test\\Configuration.properties");
		FileInputStream fis = new FileInputStream(f);
		prof=new Properties();
		prof.load(fis);
	}

	public String geturl() throws Throwable{
		String url = prof.getProperty("url");
		return url;
	}
	public String getemail() {
		String email = prof.getProperty("email");
		return email;
	}
	public String getpassword() {
		String password = prof.getProperty("password");
		return password;
	}
}
