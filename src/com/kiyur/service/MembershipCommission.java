package com.kiyur.service;
public class MembershipCommission {
	public static  void MembershipComm(CompanyDevelopment.Users root,String ide)
	{
		int num=10000;
		while(true)
		{
			CheckParentId check=new CheckParentId();
			CompanyDevelopment.Users Parent = check.getParent(root,ide);
			ide=Parent.pid;
			num=(num/100)*10;
			if(Parent.commId==2)
			{
				Parent.comm=Parent.comm+num;
			}
			if(Parent==root)
			{
				break;
			}
			/*if(Parent.commId==2)
			{
				Parent.comm=Parent.comm+num;
			}*/
			else
			{
				Parent.comm=Parent.comm+(num-((num/100)*10));
			}
			System.out.println(Parent.Name);
			System.out.println(num);
			System.out.println(Parent.comm);
		}
	}
}
