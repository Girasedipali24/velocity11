package Ecommerce.configuration;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfiguration {
	Properties pro;
	public  ReadConfiguration() {
		File src = new File("C:\\28march evening batch\\11MarchMaven_project\\src\\test\\resources\\Configuration\\Confiig.properties");
		pro = new Properties();
		try {
			FileInputStream fis = new FileInputStream(src);
			try {
				pro.load(fis);
			}catch (IOException e) {
				e.printStackTrace();
			}
		}catch(FileNotFoundException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
	public String getApplicationURL() {
		String URL  = pro.getProperty("BaseURL");
		return URL;
	}
	public String Username() {
		String Username =pro.getProperty("Username");
		return Username;
	}
	public String Password() {
		String Password = pro.getProperty("Password");
		return Password;
	}
	public String GetChromepath() {
		String Chromepath = pro.getProperty("Chromedriver");
		return Chromepath;
	}
	public String GetFirefox() {
		String FireFoxpath =pro.getProperty("FireFox");
		return FireFoxpath;
	}
	


}
