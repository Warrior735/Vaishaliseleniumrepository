package genericUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileUtility {
	public String fetchDataFromPropertyFile(String key) throws IOException {
	//fetching data from property file
	FileInputStream fis= new FileInputStream("./testData/propertyData2.properties");
	Properties property= new Properties();
	property.load(fis);
	return property.getProperty(key);
	}

}
