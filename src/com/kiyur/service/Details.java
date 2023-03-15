package com.kiyur.service;
import java.util.*;
import com.kiyur.beans.*;
public class Details {
	static Scanner obj=new Scanner(System.in);
	static int custid=1;
	public void detail()
	{
		System.out.println("     Enter Your Name");
		String Name=obj.next();
		System.out.println("     Enter your parent id");
		int parentId=obj.nextInt();
		int c=0;
		for(int i=custid;i>=1;i--)
		{
			if(parentId==custid)
			{
				System.out.println("      Matched ParentId");
				c++;
				break;
			}
		}
		if(c==0)
		{
			System.out.println("      You are given a Invalid Parent Id");
			System.out.println("                 -------Thank You------");
			return;
		}
			System.err.println("                 Welcome!  Now you are member of Kiyur.All the best.");
	}
	public void product()
	{
		Product k[]=Product.values();
		System.out.println("    These are the available products.");
		for(Product k1 : k)
		{
			//System.out.println("    These are the available products.");
			System.out.println("    Product Name-"+k1+"   price-"+k1.getNum());
		}
	}
}

