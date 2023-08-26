package dataReadWrite;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
public class ReadDataProperties {

	public static void main(String[] args) throws IOException {
		// Write a program read data for properties file
		
		// Step 1 : Creat object of class and path of the file
		File f = new File(System.getProperty("user.dir")+"//src//dataReadWrite//ReadDemo.properties");
		FileInputStream fis = new FileInputStream(f);
		
		//step 2: Create object oof properties class
		Properties p = new Properties();
		
		// step 3 :  load the file
		p.load(fis);
		
		// step 4: use get property method to get property
		System.out.println(p.getProperty("name"));
		System.out.println(p.getProperty("website"));

	}

}
