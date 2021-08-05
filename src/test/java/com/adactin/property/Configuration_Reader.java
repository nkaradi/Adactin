package com.adactin.property;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Configuration_Reader {
	public static Properties p;

	public Configuration_Reader() throws Throwable {
		File f = new File(
				"C:\\Users\\Administrator\\eclipse-workspace\\Adactin\\src\\test\\java\\com\\adactin\\property\\Adactin.properties");
		FileInputStream fis = new FileInputStream(f);
		p = new Properties();
		p.load(fis);
	}

	public String getBrowser() {
		String browser = p.getProperty("browser");
		return browser;
		}
	public String getUrl() {
		String url = p.getProperty("url");
		return url;
	}

}
