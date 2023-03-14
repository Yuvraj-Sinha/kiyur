package com.kiyur.dao;
import java.io.*;
import java.util.*;

public class Reader_Writer {
	 FileReader fr;
	 File file;
     Scanner sc;
     String name;
	Reader_Writer()
    {
  try	{	  file = new File("C:\\Users\\pankaj\\Desktop\\test.txt");
        sc = new Scanner(file);
  
  }
  catch(Exception e) {
	 e.printStackTrace(); 
  }
  
}
  
     
	 // ObjectOutputStream oos=new ObjectOutputStream(fos);
	  //oos.writeObject(s1);
	  
	   
	 // ObjectInputStream  ois=new ObjectInputStream(fis);){
	 // Serialization_Ex1 ss=(Serialization_Ex1)ois.readObject();
	  //System.out.println(" "+ss.username+"\n"+" "+ss.pwd);
	  //System.out.println(" "+ss.pin);
	  //oos.close();
	  //ois.close();
   
	
	public boolean verify_Cust(String name,String id)throws Exception {
		   String data ;
		   while (sc.hasNextLine())
			    System.out.println(sc.nextLine());
					  fr=new FileReader("kiyur.txt");
			    
		return true;
	}
	
	 
}
