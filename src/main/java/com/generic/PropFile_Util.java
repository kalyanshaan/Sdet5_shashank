package com.generic;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
/**
 * 
 * @author Kalyankar Shashank
 *
 */
public class PropFile_Util {
	public static  String readdatafrompropfile(String key) throws IOException 
	{
		FileInputStream fis = new FileInputStream(IAutoConstant.popfilepath);
		Properties prop = new Properties();
		prop.load(fis);
		String value=prop.getProperty(key);
		return value;
	}
	
	
	
	public String readdatafrompropfile(String path,String key) throws IOException 
	{
		FileInputStream fis = new FileInputStream(path);
		Properties prop = new Properties();
		prop.load(fis);
		String value=prop.getProperty(key);
		return value;
	}

}

