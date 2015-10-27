package pageObjects;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesReader{
	public static String filepath = new String("automation.properties");
	
	
	public static String propertyread(String propertykey, String path){
		Properties properties = new Properties();
		InputStream input = null;
		String propertyvalue = new String();
		
		try{
			input = new FileInputStream(path);
			properties.load(input);
			propertyvalue = properties.getProperty(propertykey);
			
			}
		catch(IOException ie){
			ie.printStackTrace();
		}	
	
		return propertyvalue;
	}
	
	public static String getUsername(String usernamekey){
		
		return new String(propertyread(usernamekey, filepath));
	}

	public static String getPassword(String passwordkey){
		
		return new String(propertyread(passwordkey, filepath));
	}

	}