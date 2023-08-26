package dataReadWrite;

import java.io.*;
public class CountNumWordTxtFile {

	public static void main(String[] args) throws IOException {
		// Program to find number of words character and number from given text file
		
		File f = new File(System.getProperty("user.dir")+"//src//dataReadWrite//CountNumWordTxtFile.txt");
		FileReader fr = new FileReader(f);
		
		BufferedReader br =new BufferedReader(fr);
		String  s ;
		String[]words = null;
		int count=0;
		
		while((s=br.readLine())!=null) {
			words = s.split(" ");
			count = count + words.length;
			
		}
		br.close();
		System.out.println("the number of words count is " + count);
		
		
		
		br.close();
		System.out.println("Read Sucessfully");
		

	}

}
