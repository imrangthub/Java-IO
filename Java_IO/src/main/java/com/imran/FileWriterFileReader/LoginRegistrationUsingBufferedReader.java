package com.imran.FileWriterFileReader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class LoginRegistrationUsingBufferedReader {

          
	public static void main(String[] args) {
		try {
			
			File file = new File("G:\\IMRAN_PROJECT\\JAVA_SE\\Java_IO\\src\\main\\resources\\file\\testFile.txt");
			FileReader fileReader = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			
			StringBuffer stringBuffer = new StringBuffer();
			String line;
			
			 FileWriter fw=new FileWriter("G:\\IMRAN_PROJECT\\JAVA_SE\\Java_IO\\src\\main\\resources\\file\\outputFile.txt"); 
	           
	         
			
			while ((line = bufferedReader.readLine()) != null) {
				stringBuffer.append(line);
				stringBuffer.append('\n');
			}
			
			   fw.write(stringBuffer.toString());  
	 	           
	           fw.close();
			
			fileReader.close();
			System.out.println("Success");
			System.out.println(stringBuffer.toString());
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}


}
