package azevedorafaela.cucumbermaven.support;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Support {

	public String baseUrl;
	public String user;
	public String pass;

	// Get the properties file with the baseUrl, user and pass,
	// will be available for any class
//	public Support() {
//		getProperties();
//	}

	public void getProperties() {
		try {


			Properties prop = new Properties();
			InputStream inputStream = getClass().getClassLoader().getResourceAsStream("config.properties");
			prop.load(inputStream);
//		this.baseUrl = prop.getProperty("baseUrl");
//		this.user = prop.getProperty("user");
//		this.pass = prop.getProperty("password");

			this.baseUrl = "https://wordpress.com/";
			this.user = "user";
			this.pass = "123456";
		} catch (Exception e) {
		}

	}
}
