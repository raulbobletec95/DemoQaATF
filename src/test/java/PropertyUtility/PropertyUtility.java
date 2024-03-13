package PropertyUtility;

import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Properties;

public class PropertyUtility {

	private Properties properties;

	public PropertyUtility(String fileName){
		loadFile(fileName);
	}

	//facem o metoda care sa incarce un fisier
	private void loadFile(String fileName){
		properties = new Properties();
		try {
			FileInputStream fileInputStream = new FileInputStream("src/test/resources/"+fileName+".properties");
			properties.load(fileInputStream);
		} catch (Exception ignored) {

		}
	}

	//facem o metoda care returneaza toate datele dintr-un fisier
	public HashMap<String, String> getAllData(){
		HashMap<String, String> testData = new HashMap<>();
		for (String key : properties.stringPropertyNames()){
			testData.put(key, properties.getProperty(key));
		}
		return testData;
	}
}
