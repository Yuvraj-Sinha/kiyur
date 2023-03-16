package com.kiyur.dao;

import java.io.*;



import  com.kiyur.beans.*;
import com.kiyur.service.*;
import java.util.LinkedList;
import java.util.*;



public class Reader_Writer {
private static final long serialVersionUID=1l;
  static  CompanyDevelopment Object = new CompanyDevelopment();
  CompanyDevelopment.Users innerObject = new CompanyDevelopment.Users();
     
    public static void serialize(CompanyDevelopment.Users s1) throws Exception{
    	
		File file = new File("C:\\Users\\TrueID Pvt Ltd-F1\\Desktop\\kiyur.txt");
	    FileOutputStream fis = new FileOutputStream(file);
	    ObjectOutputStream oos=new ObjectOutputStream(fis);	
	    oos.writeObject(s1);
	    fis.close();
	}
	 public static CompanyDevelopment.Users deserilaize()throws Exception {
		 
		 File fil = new File("C:\\Users\\TrueID Pvt Ltd-F1\\Desktop\\kiyur.txt");
		    FileInputStream fos = new FileInputStream(fil);
		    ObjectInputStream ois=new ObjectInputStream(fos);
		    
		//    byte[] bytek = new byte[(int) fil.length()];
		    
		     System.out.println("deserilaize");
		   
		    Object inObject = ois.readObject();
		 //   System.out.println(inObject);
		  //  if (inObject.getClass() == Queue.class) {
		     //  System.err.println("IS LIST");
		//  NAryTree.TreeNode parent= Object.getParent((NAryTree.TreeNode)ois.readObject(),1);
		    PrintingCompanyUsers print=new PrintingCompanyUsers();
		    		print.printCompany((CompanyDevelopment.Users)inObject);
		    	
		    		CompanyDevelopment.Users node=(CompanyDevelopment.Users)inObject;
		    		  
		    		fos.close();
		    		   ois.close();
		    		return  node;
		    }
		   // fis.read(bytes);
		//    Serialization_Ex1 ss=(Serialization_Ex1)ois.readObject();
		 //     Queue<NAryTree.TreeNode>  data=(LinkedList)ois;
		   // Customer c=(Customer)ois.readObject();
		  //  fos.close();
		    //String text = new String(bytes, "UTF-8");
		   // System.out.println(text.substring(text.indexOf("899"), text.lastIndexOf("1")));
		   // System.out.println(c.getName()+""+c.getPhone_No()+""+c.getAddress()+""+c.getId());



	
	
	public static void main(String[] args)throws Exception {
		
		// TODO Auto-generated method stub
		//Customer s1=new  Customer("yuvraj",3459762,"adress","321");
		  //FileOutputStream fos=new FileOutputStream("ass.ser");
		
	   // byte[] bytes = new byte[(int) file.length()];
	   // fis.write(bytes);
	   
	  //  String text = new String(bytes, "UTF-8");
	//    System.out.println(text.substring(text.indexOf("899"), text.lastIndexOf("1")));
	    
	    
	    File fil = new File("C:\\Users\\TrueID Pvt Ltd-F2\\Desktop\\kiyur.xlsx");
	    FileInputStream fos = new FileInputStream(fil);
	    ObjectInputStream ois=new ObjectInputStream(fos);
	    
	    byte[] bytek = new byte[(int) fil.length()];
	   // fis.read(bytes);
	//    Serialization_Ex1 ss=(Serialization_Ex1)ois.readObject();
	    Customer c=(Customer)ois.readObject();
	    fos.close();
	    //String text = new String(bytes, "UTF-8");
	   // System.out.println(text.substring(text.indexOf("899"), text.lastIndexOf("1")));
	    System.out.println(c.getName()+""+c.getPhone_No()+""+c.getAddress()+""+c.getId());
	}

}