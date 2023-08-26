package dataReadWrite;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;
public class WriteDataText {

	public static void main(String[] args) throws IOException {
		// Program to write the data to text file
		
		File f = new File(System.getProperty("user.dir")+"//src//dataReadWrite//WriteDataNew.txt");
		FileWriter fw =new FileWriter(f);
		
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write("Kalyani Bhonde");
		bw.write("i love you");
		bw.close();
		System.out.println("Write Sucessfully");

	}

}
