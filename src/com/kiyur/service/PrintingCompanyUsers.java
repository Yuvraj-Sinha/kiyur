package com.kiyur.service;

import java.util.LinkedList;
import java.util.Queue;
public class PrintingCompanyUsers {
	public static void printCompany(CompanyDevelopment.Users root)
	{
		 Queue<CompanyDevelopment.Users> q=new LinkedList<>();
		 q.offer(root);
			int c=0;
			while(!q.isEmpty()&& c==0)
			{
				int n=q.size();
				while(n>0 && c==0)
				{ 
					CompanyDevelopment.Users node=q.peek();
					try {
					System.out.println("Name-"+node.Name+"  "+"Id-"+node.id+" "+"Parent Id-"+node.pid+" "+"Commision-"+node.comm);}
					catch(Exception e)
					{
						return;
					}
					q.remove();
					int k=0;
					for(int i=0;i<node.child.size();i++)
					{
						k++;
						if(k==1)
						System.out.println("Child");
						q.add(node.child.get(i));
					}
				}
				n--;
			}
	}
}
