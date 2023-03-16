package com.kiyur.service;
import java.util.*;
import java.util.LinkedList;
public class CheckParentId {
	public static CompanyDevelopment.Users getParent(CompanyDevelopment.Users root,String checkid)
	{
		Queue<CompanyDevelopment.Users> q =new LinkedList();
		q.offer(root);
		int c=0;
		while(!q.isEmpty()&& c==0)
		{
			int n=q.size();
			while(n>0 && c==0)
			{ 
				CompanyDevelopment.Users user=q.peek();
				if(user.id.equals(checkid))
				{
					return user;
				}
				q.remove();
				for(int i=0;i<user.child.size();i++)
				{
					q.add(user.child.get(i));
				}
				n--;
			}
		}
		return null;
	}
}
