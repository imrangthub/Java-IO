package BufferedInputOutputStream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BufferedInputStreamMainCls {

	 public static void main(String args[]){  
		 
		 
		  try{    
		    FileInputStream fin=new FileInputStream("G:\\IMRAN_PROJECT\\JAVA_SE\\Java_IO\\src\\main\\resources\\file\\testout2.txt");    
		    BufferedInputStream bin=new BufferedInputStream(fin);    
		    int i;    
		    while((i=bin.read())!=-1){    
		     System.out.print((char)i);    
		    }    
		    bin.close();    
		    fin.close();    
		  }catch(Exception e){System.out.println(e);}  
		  
		  
		  
		 }  

}
