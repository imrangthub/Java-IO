package com.imran.FileInputOutputStream;

import java.io.FileInputStream;

public class FileInputStreamMainCls {

	public static void main(String[] args) {


	    try{    
            FileInputStream fin=new FileInputStream("G:\\IMRAN_PROJECT\\JAVA_SE\\Java_IO\\src\\main\\resources\\file\\testout.txt");    
   
            int i=0;    
            while((i=fin.read())!=-1){    
             System.out.print((char)i);    
            }
  
            fin.close();    
          }catch(Exception e){
        	  System.out.println(e);
          }    
         

	}

}
