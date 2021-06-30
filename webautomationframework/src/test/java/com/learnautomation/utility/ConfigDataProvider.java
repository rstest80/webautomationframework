package com.learnautomation.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ConfigDataProvider {
	Properties pro;

	public ConfigDataProvider() {
		//To specify file path
		File src = new File("./Config/config.properties");
		try {
			//To specify File object(src) as input
			FileInputStream fis = new FileInputStream(src);
			//Create Properties class object
			pro = new Properties();
			pro.load(fis);			
		} catch (Exception e) {
			System.out.println("Not able to load config file >>" + e.getMessage());
		}
	}
	
	public String getDataFromConfig(String keyToSearch) {
		return pro.getProperty(keyToSearch);
	}
	
	public String getBrowser() {
		return pro.getProperty("browser");
	}
	
	public String getQAUrl() {
		return pro.getProperty("qaUrl");
	}
}
