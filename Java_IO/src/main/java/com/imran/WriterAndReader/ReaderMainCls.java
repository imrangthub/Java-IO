package com.imran.WriterAndReader;

import java.io.FileReader;
import java.io.Reader;

public class ReaderMainCls {

	  public static void main(String[] args) {  
	        try {  
	            Reader reader = new FileReader("G:\\IMRAN_PROJECT\\JAVA_SE\\Java_IO\\src\\main\\resources\\file\\writer.txt");  
	            int data = reader.read();  
	            while (data != -1) {  
	                System.out.print((char) data);  
	                data = reader.read();  
	            }  
	            reader.close();  
	        } catch (Exception ex) {  
	            System.out.println(ex.getMessage());  
	        }  
	    } 

}
