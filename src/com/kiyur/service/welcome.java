package com.kiyur.service;
//package com.kiyur.service;
import java.util.*;
public class welcome {
	static Scanner obj=new Scanner(System.in);
	
		public void wish() throws Exception
		{   System.err.print("=================Welecome to kiyur chain marketing=================");
			System.out.println();
			System.out.println("     Press '1' if you are new User");
			System.out.println("     Press '2' if you are already a Member");
			int n=obj.nextInt();
			switch(n)
			{
			    case 1: 
			    		Details d=new Details();
			    		d.detail();
			    
			    		break;
			    case 2: Details d1=new Details();
			    
			    		d1.product();
			    default:{
			    	System.out.println("===========THANKYOU FOR  USING OUR SERVICE==========");
			    	break;
			}
			
		}
}
}
