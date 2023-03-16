package com.maurya.controller;
import com.maurya.dao.*;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class DetailsProduct implements Serializable
{

	public static void main(String[] args) 
	{
		
		List<Enrollment> enrollments = new ArrayList<Enrollment>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your names :");
		  String name = sc.nextLine();
		System.out.println("Enter name of the products :");
		String product =sc.nextLine();
		System.out.println("Enter your mob. no : ");
		int mobileNumber=sc.nextInt();
		
		Enrollment e = new Enrollment(name,product,mobileNumber);
		enrollments.add(e);
		
		try {
				FileOutputStream fos = new FileOutputStream("C:\\E-commerce Product\\ecommerceproductmarketing\\src\\com\\maurya\\controller\\records.txt");
				ObjectOutputStream oos= new ObjectOutputStream(fos);
				oos.writeObject(enrollments);
			}
			catch(Exception x)
			{
				System.out.println(x.getMessage());
			}
			try
			{
				FileInputStream fis = new FileInputStream("C:\\E-commerce Product\\ecommerceproductmarketing\\src\\com\\maurya\\controller\\records.txt");
				ObjectInputStream ois = new ObjectInputStream(fis);
				List<Enrollment> abc=(List<Enrollment>)ois.readObject();
				System.out.println(abc);
				
			}
			catch(Exception y)
			{
				y.printStackTrace();
			}
			System.out.println("Data Submitted");

	}

}
