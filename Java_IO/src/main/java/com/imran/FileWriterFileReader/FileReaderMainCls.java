package com.imran.FileWriterFileReader;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileReaderMainCls {
	

	   public static void main(String args[])throws Exception{   
		   
	          FileReader fr=new FileReader("G:\\IMRAN_PROJECT\\JAVA_SE\\Java_IO\\src\\main\\resources\\file\\testFile.txt");    
	          
	          int i;   
	          
	          
	          
	          while((i=fr.read())!=-1) {
	        	  
	              System.out.print((char)i);  
	          
	          }
	          
	          fr.close();   
	          
	    } 
      
		


}
