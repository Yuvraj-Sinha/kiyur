package com.maurya.dao;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.*;






public class ProductAndUserDetailsStorage
{
      public static void main(String[] args)
      {
    	 
    	  
		
    	String data ="C:\\E-commerce Product\\ecommerceproductmarketing\\src\\com\\maurya\\dao\\DataInfo.txt";
    	   Scanner sc = new Scanner(System.in);
    	  try 
    	   {
    		  FileOutputStream fout=new FileOutputStream(data);  
			    // String s="I am making a painting."; 
			     System.out.println("Enter username");
			     String s=sc.next();
			     byte b[]=s.getBytes(); 
			     fout.write(b);  
			     fout.close();  
			     System.out.println("Write tasks successful."); 
            
                    

			     FileInputStream fin=new FileInputStream("C:\\E-commerce Product\\ecommerceproductmarketing\\src\\com\\maurya\\dao\\DataInfo.txt");  
				    int i=0;  
				    while((i=fin.read())!=-1){  
				     System.out.print((char)i);  
				    }  
				    fin.close();  
    		 
    	  
    	   }
    	  
    	  
         catch(Exception e)
    	  {
    		  
    		  
    		  e.printStackTrace();
    		  
    		  
    	  }
    	  
    	  
    	  Scanner scan = new Scanner(System.in);
    	  System.out.println("welcome to shop");          
          char ch;        
          do    
          {
              System.out.println("Press number according to requirment");
              System.out.println("1. Product details");
              System.out.println("2. user details ");
              
              int choice = scan.nextInt();            
              switch (choice)
              {
              case 1 : 
                  System.out.println("Enter product name to check history");
                                     
                  break;                          
              case 2 : 
                  System.out.println("Enter user details to check history ");
                  
                  break;                                          
             
                 default : 
                  System.out.println("Wrong Entry \n ");
                  break;   
              }
    	  
    	  
    	
      }
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
	  }
}