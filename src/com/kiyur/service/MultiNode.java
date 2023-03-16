package com.kiyur.service;
import java.util.*;
public class MultiNode {
	public static double companyProfit;
	public static Node root=new Node(1,"company",0,null,0);
	public static class  Node{
		int commId;
		String Name;
		int id;
		String pid;
		@Override
		public String toString() {
			return "Node [Name=" + Name + ", id=" + id + ", comm=" + comm + ", child=" + child + "]";
		}
		double comm;
		List<Node> child=new ArrayList<>();
		public Node(int id,String Name,double comm,String pid,int memAmount)
		{
			this.Name=Name;
			this.id=id;
			this.comm=comm;
			this.pid=pid;
		}
		public Node(int id,String Name,double comm,int memAmount)
		{
			this.Name=Name;
			this.id=id;
			this.comm=0;
			companyProfit=companyProfit+memAmount;
		}
	}
	static Queue<Node> q;
		public static Node getParent(Node root,int checkid)
		{
			 q=new LinkedList();
			q.offer(root);
			int c=0;
			while(!q.isEmpty()&& c==0)
			{
				int n=q.size();
				while(n>0 && c==0)
				{ 
					Node node=q.peek();
					if(node.id==checkid)
					{
						return node;
					}
					q.remove();
					for(int i=0;i<node.child.size();i++)
					{
						q.add(node.child.get(i));
					}
					n--;
				}
			}
			return null;
		}
		public static void printUser(Node Parent)
		{
			System.out.println(Parent.Name);
			System.out.println(Parent.id);
			System.out.println(Parent.comm);
		}
		public static void data(Node root,int id)
		{
			Node Parent=getParent(root,id);
			printUser(Parent);
		}
		public static  void MembershipComm(Node root,int ide)
		{
			int num=10000;
			while(true)
			{
				Node Parent = getParent(root,ide);
				ide=Parent.id-1;
				num=(num/100)*10;
				if(Parent==root)
				{
					break;
				}
				if(Parent.commId==2)
				{
					Parent.comm=Parent.comm+num;
				}
				else
				{
					Parent.comm=Parent.comm+(num-((num/100)*10));
				}
				System.out.println(Parent.Name);
				System.out.println(num);
				System.out.println(Parent.comm);
			}
		}
		
		public static void printCompany(Node root)
		{
			 Queue<Node> q=new LinkedList<>();
			 q.offer(root);
				int c=0;
				while(!q.isEmpty()&& c==0)
				{
					int n=q.size();
					while(n>0 && c==0)
					{ //System.out.println(q.peek());
						Node node=q.peek();
						//System.out.println(node.Name);
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
		public static void main(String[] args) {
			//TODO Auto-generated method stub
			Node Parent = getParent(root,1);
			System.out.println(Parent);
			MembershipComm(root,1);
			if(Parent!=null && Parent==root)
			{
				Parent.child.add(new Node(2,"Kishore",0,1+"",10000));
				root.child.get(0).commId=2;
			}
			Node Parent1 = getParent(root,2);
			Parent1.child.add(new Node(3,"Narendra",0,2+"",9000));
			MembershipComm(root,2);
			Node Parent3= getParent(root,3);
			Parent3.child.add(new Node(4,"Yuvraj",0,3+"",9000));
			MembershipComm(root,3);
			Parent3.child.add(new Node(5,"raushan",0,"3",9000));
			MembershipComm(root,3);
			System.out.println(q.peek());
			System.out.println(Parent3.child.get(1).pid);
			printCompany(root);
			//System.out.println(Parent1.commId);
	}

}
