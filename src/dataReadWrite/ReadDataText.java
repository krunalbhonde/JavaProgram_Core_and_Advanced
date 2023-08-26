package dataReadWrite;
import java.io.File;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
public class ReadDataText {

	public static void main(String[] args) throws IOException {
		//Program to read the data from text file
		File f = new File(System.getProperty("user.dir")+"//src//dataReadWrite//ReadData.txt");
		
		FileReader fr = new FileReader(f);
		
		//step 2 : create the object of bufferedReader
		
		BufferedReader br = new BufferedReader(fr);
		
		// step 3 : read data
		System.out.println(br.readLine());
		System.out.println(br.readLine());
		
		System.out.println("Read Sucessfully");
		br.close();
		

	}

}
