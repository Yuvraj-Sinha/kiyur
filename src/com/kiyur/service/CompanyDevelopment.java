package com.kiyur.service;

import java.util.ArrayList;
import java.io.Serializable;
import java.util.List;

import com.kiyur.dao.Reader_Writer;
import com.kiyur.service.MultiNode.Node;

import java.util.*;
public class CompanyDevelopment implements Serializable{
	static double COMPANYPROFIT;
	public static Users root=new Users(1+"","company",0,null,0);
	static {
		try {
			root=Reader_Writer.deserilaize();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static class Users implements Serializable {
		
		
		int commId;
		String Name;
		String id;
		String pid;
		double comm;
		List<Users> child=new ArrayList<>();
		
		
		public Users() {
			super();
		}
		public Users(String id,String Name,double comm,String pid,int memAmount)
		{
			this.Name=Name;
			this.id=id;
			this.comm=comm;
			this.pid=pid;
			CompanyDevelopment.COMPANYPROFIT=CompanyDevelopment.COMPANYPROFIT+memAmount;
		}
		public Users(String id,String Name,double comm,int memAmount)
		{
			this.Name=Name;
			this.id=id;
			this.comm=0;
			CompanyDevelopment.COMPANYPROFIT=CompanyDevelopment.COMPANYPROFIT+memAmount;
		}

	}
		static void addToCompany(String parentid,String name,String id) throws Exception{
		System.out.println("you are in add method");
		CheckParentId check=new CheckParentId();
		CompanyDevelopment.Users parent=check.getParent(root, parentid);
		if(parent==null)
		{
			System.out.println("You Are Entered A wrong Parent ID");
			Details d=new Details();
			d.detail();
		}
		else if(parent==root)
		{
			parent.child.add(new Users(id,name,0,parentid,10000));
			parent.commId=2;
			mem.MembershipComm(root,parentid);
		}
		else 
		{
			parent.child.add(new Users(id,name,0,parentid,9000));
			mem.MembershipComm(root, parentid);
		}
		
		System.out.println("you are Added");
		PrintingCompanyUsers print=new PrintingCompanyUsers();
		print.printCompany(root);
		Reader_Writer.serialize(root);
		System.out.println("Done");
		
	}
	static MembershipCommission mem=new MembershipCommission();
	public static void printUser(Users Parent)
	{
		System.out.println("Name-"+Parent.Name);
		System.out.println("Id-"+Parent.id);
		System.out.println("Commission-"+Parent.comm);
	}
	static CheckParentId check=new CheckParentId();
	public static int data(String id)
	{
		int k=0;
		CheckParentId check=new CheckParentId();
		Users Parent=check.getParent(root,id);
		if(Parent==null)
		{
			k++;
			System.out.println("wrong user id");
			
		}
		else
		printUser(Parent);
		return k;
	}
	public static void main(String[]args)throws Exception
	{
		
	//	PrintingCompanyUsers print=new PrintingCompanyUsers();
	//	MembershipCommission mem=new MembershipCommission();
	//	CompanyDevelopment.Users Parent = check.getParent(root,1);
	//	System.out.println(Parent);
		//mem.MembershipComm(root,1);
		//if(Parent!=null && Parent==root)
		//{
		//	Parent.child.add(new Users(2,"Kishore",0,1+"",10000));
		//	root.child.get(0).commId=2;
		//}
		//Users Parent1 = check.getParent(root,2);
		//Parent1.child.add(new Users(3,"Narendra",0,2+"",9000));
		//mem.MembershipComm(root,2);
		//Users Parent3= check.getParent(root,3);
		//Parent3.child.add(new Users(4,"Yuvraj",0,3+"",9000));
		//mem.MembershipComm(root,3);
		//Parent3.child.add(new Users(5,"raushan",0,"3",9000));
		//mem.MembershipComm(root,3);
	//	System.out.println(Parent3.child.get(1).pid);
	///	print.printCompany(root);
	//	System.out.println(COMPANYPROFIT);
		//Scanner sc=new Scanner(System.in);
		//System.out.println("Enter parent id");
		//int  parentid=sc.nextInt();
		//System.out.println("Enter parent id");
		//String name=sc.next();
		//System.out.println("Enter parent id");
		//int id=sc.nextInt();
		//addToCompany(parentid,name,id);
		//print.printCompany(root);
		//Reader_Writer.serialize(root);
		
		
		
		
		
	}
}
