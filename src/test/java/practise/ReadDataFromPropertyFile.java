package practise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ReadDataFromPropertyFile {

	public static void main(String[] args) throws Throwable {
		
		// file in read mode
		FileInputStream fis =new FileInputStream("C:\\Users\\Suresh\\eclipse-workspace\\myProject\\src\\test\\resources\\Config\\Config.properties");
		
		// create object of properties class
		
		Properties prop=new Properties();
		
		// keep the file read for reading purpose
		prop.load(fis);
		
		String value=prop.getProperty("url", "incorrect name");
		
		System.out.println(value);
	}

}
