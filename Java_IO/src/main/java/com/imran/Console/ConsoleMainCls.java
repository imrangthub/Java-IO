package com.imran.Console;

import java.io.Console;

public class ConsoleMainCls {

	public static void main(String args[]){   
		
		System.out.println("Enter your name: ");   
		
		Console c=System.console();    
		
 
		String n=c.readLine();    
		
		System.out.println("Welcome "+n);  
		
		
		}  

}
