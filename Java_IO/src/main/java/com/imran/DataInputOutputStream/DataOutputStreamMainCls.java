package com.imran.DataInputOutputStream;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStreamMainCls {

	 public static void main(String[] args) throws IOException {  
	        FileOutputStream file = new FileOutputStream("G:\\IMRAN_PROJECT\\JAVA_SE\\Java_IO\\src\\main\\resources\\file\\testFile.txt");  
	        DataOutputStream data = new DataOutputStream(file);  
	        data.writeInt(65);  
	        data.flush();  
	        data.close();  
	        System.out.println("Succcess...");  
	    } 
	 
	 

}
