package com.imran.SequenceInputStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.SequenceInputStream;

public class SequenceInputStreamMainCls {

	 public static void main(String args[])throws Exception{    
		   FileInputStream fin1=new FileInputStream("G:\\IMRAN_PROJECT\\JAVA_SE\\Java_IO\\src\\main\\resources\\file\\input1.txt");    
		   FileInputStream fin2=new FileInputStream("G:\\IMRAN_PROJECT\\JAVA_SE\\Java_IO\\src\\main\\resources\\file\\input2.txt");    
		   FileOutputStream fout=new FileOutputStream("G:\\IMRAN_PROJECT\\JAVA_SE\\Java_IO\\src\\main\\resources\\file\\testout.txt");  
		   
		   SequenceInputStream sis=new SequenceInputStream(fin1,fin2);    
		   int i;    
		   
		   while((i=sis.read())!=-1) 
			   
		   {    
		     fout.write(i);        
		   }    
		   
		   
		   sis.close();    
		   fout.close();      
		   fin1.close();      
		   fin2.close();       
		   System.out.println("Success..");  
		  } 

}
