package com.kiyur.service;
import java.util.*;
import com.kiyur.beans.*;
public class Details  {
	static Scanner sc=new Scanner(System.in);
	static int custid=1;
	public void detail() throws Exception
	{   System.out.println(" The membership fee is 10000");
		
		System.out.println("     Enter your parent id");
		String parentId=sc.next();
		while(parentId.equals(0+"")) {
			System.err.print("please enter correct input");
			
			parentId=sc.next();
		}
		System.out.println("     Enter Your Name");
		String name=sc.next();
		while(name==null) {
			System.err.print("please enter correct input");
			name=sc.next();
		}
		System.out.println("     Enter ID");
		String id=sc.next();
		while(id.equals(0+"")) {
			System.err.print("please enter correct input");
			id=sc.next();
		}
	
		CompanyDevelopment.addToCompany(parentId,name,id);
	    welcome w=new welcome();
	       w.wish();
			//System.err.println("                 Welcome!  Now you are member of Kiyur.All the best.");
	}
	public void product()
	{
		System.out.println("Enter Your Id");
		String n=sc.next();
		CompanyDevelopment d=new CompanyDevelopment();
		int k2=d.data(n);
		if(k2!=0)
			return;
		System.out.println();
		Product k[]=Product.values();
		System.out.println("=====These are the available products.=====");
		for(Product k1 : k)
		{
			//System.out.println("    These are the available products.");
			System.out.println("   Product Name- "+k1+"   price-"+k1.getNum());
		}
	}
}

