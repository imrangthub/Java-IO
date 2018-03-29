package BufferedInputOutputStream;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class BufferedOutputStreamMainCls {

	public static void main(String args[])throws Exception{  
		
	     FileOutputStream fout=new FileOutputStream("G:\\IMRAN_PROJECT\\JAVA_SE\\Java_IO\\src\\main\\resources\\file\\testout.txt");  
	     
	     BufferedOutputStream bout=new BufferedOutputStream(fout);   
	     
	     String s="Welcome to BufferedOutputStream.";    
	     
	     byte b[]=s.getBytes();   
	     
	     bout.write(b);    
	     bout.flush();    
	     bout.close();    
	     fout.close();    
	     
	     System.out.println("success");    
	}  

}
