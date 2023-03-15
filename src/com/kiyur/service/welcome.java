package com.kiyur.service;
//package com.kiyur.service;
import java.util.*;
public class welcome {
	static Scanner obj=new Scanner(System.in);
		public void wish()
		{
			System.err.println("                 Welecome to kiyur chain marketing");
			System.out.println("     press '1' if you are new user");
			System.out.println("     press '2' if you are already a member");
			int n=obj.nextInt();
			switch(n)
			{
			    case 1: System.out.println("     The membership fee is 10000");
			    		Details d=new Details();
			    		d.detail();
			    		break;
			    case 2: Details d1=new Details();
			    		d1.product();
			}
			
		}
}
