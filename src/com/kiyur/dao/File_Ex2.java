package com.kiyur.dao;

import java.io.*;


import  com.kiyur.beans.*;



public class File_Ex2 {

	public static void main(String[] args)throws Exception {
		
		// TODO Auto-generated method stub
		Customer s1=new  Customer("yuvraj",3459762,"adress","321");
		  //FileOutputStream fos=new FileOutputStream("ass.ser");
		File file = new File("C:\\Users\\TrueID Pvt Ltd-F2\\Desktop\\kiyur.txt");
	    FileOutputStream fis = new FileOutputStream(file);
	    ObjectOutputStream oos=new ObjectOutputStream(fis);
	    byte[] bytes = new byte[(int) file.length()];
	   // fis.write(bytes);
	    oos.writeObject(s1);
	    fis.close();
	    String text = new String(bytes, "UTF-8");
	//    System.out.println(text.substring(text.indexOf("899"), text.lastIndexOf("1")));
	    
	    
	    File fil = new File("C:\\Users\\TrueID Pvt Ltd-F2\\Desktop\\kiyur.txt");
	    FileInputStream fos = new FileInputStream(file);
	    ObjectInputStream ois=new ObjectInputStream(fos);
	    
	    byte[] bytek = new byte[(int) file.length()];
	   // fis.read(bytes);
	//    Serialization_Ex1 ss=(Serialization_Ex1)ois.readObject();
	    Customer c=(Customer)ois.readObject();
	    fos.close();
	    //String text = new String(bytes, "UTF-8");
	   // System.out.println(text.substring(text.indexOf("899"), text.lastIndexOf("1")));
	    System.out.println(c.getName()+""+c.getPhone_No()+""+c.getAddress()+""+c.getId());
	}

}
