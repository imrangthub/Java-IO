package com.imran.FileWriterFileReader;

import java.io.FileWriter;

public class FileWriterMainCls {

	public static void main(String[] args) {


	    try{    
	           FileWriter fw=new FileWriter("G:\\IMRAN_PROJECT\\JAVA_SE\\Java_IO\\src\\main\\resources\\file\\testFile2.txt"); 
	           
	           fw.write("Welcome to Java IO.");    
	           
	           fw.close();   
	           
	          }catch(Exception e){
	        	  
	        	  System.out.println(e);
	          
	          } 
	    
	          System.out.println("Success...");    
	     }  
	
	
	
		
	}


