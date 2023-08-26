package dataReadWrite;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;


public class WriteDataProperties {

	public static void main(String[] args) throws IOException {
		// Program to write the data to the properties file
		
		File f = new File(System.getProperty("user.dir")+"//src//dataReadWrite//WriteDemo.properties");
		FileOutputStream fos = new FileOutputStream(f);
		
		Properties p = new Properties();
	
		// use set property /store method for set the property
		p.setProperty("url", "www.facebook.com");
		p.store(fos, "Sample Content of file output stream");

	}

}
