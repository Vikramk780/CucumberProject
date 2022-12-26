package qa.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class configPropClone {
	Properties prop;
	public Properties init_prop() throws FileNotFoundException {
		
		prop = new Properties();
		 FileInputStream ip = new FileInputStream("C:\\\\Users\\\\kvikram\\\\newEclipse\\\\CucumberProjectWithPom\\\\src\\\\test\\\\resources\\\\Config\\\\properties\\\\config.properties");
	       
		 try {
			prop.load(ip);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 return prop;
	}
}
