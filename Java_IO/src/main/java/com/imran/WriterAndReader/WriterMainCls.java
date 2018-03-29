package com.imran.WriterAndReader;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterMainCls {

	  public static void main(String[] args) {  
	        try {  
	            Writer w = new FileWriter("G:\\IMRAN_PROJECT\\JAVA_SE\\Java_IO\\src\\main\\resources\\file\\writer.txt");  
	            String content = "I love my country";  
	            w.write(content);  
	            w.close();  
	            System.out.println("Done");  
	        } catch (IOException e) {  
	            e.printStackTrace();  
	        }  
	    } 

}
