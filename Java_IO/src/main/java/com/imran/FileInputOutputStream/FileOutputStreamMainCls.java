package com.imran.FileInputOutputStream;

import java.io.FileOutputStream;

public class FileOutputStreamMainCls {

	public static void main(String[] args) {


		 try{  
			 
             FileOutputStream fout=new FileOutputStream("G:\\IMRAN_PROJECT\\JAVA_SE\\Java_IO\\src\\main\\resources\\file\\testout.txt");    
             
             String s="Welcome to javaTpoint.";  
             
             byte b[]=s.getBytes();//converting string into byte array ; 
             fout.write(b);
             fout.close();    
             System.out.println("success...");   
             
            }catch(Exception e){
            	
            	System.out.println(e);
            	
            }    
    }  
		
		
	

}
