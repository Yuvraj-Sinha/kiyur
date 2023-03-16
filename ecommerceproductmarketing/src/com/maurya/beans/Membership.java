package com.maurya.beans;

import java.util.ArrayList;
import java.util.Scanner;

public class Membership
{
	
	private String name;
	
	private static int mobileNumber;
	
	private String membershipType;

	public Membership(String name, int mobileNumber, String membershipType)
	{
		super();
		this.name = name;
		this.mobileNumber = mobileNumber;
		this.membershipType = membershipType;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public int getMobileNumber()
	{
		return mobileNumber;
	}

	public void setMobileNumber(int mobileNumber) 
	{
		this.mobileNumber = mobileNumber;
	}

	public String getMembershipType() 
	{
		return membershipType;
	}

	public void setMembershipType(String membershipType) 
	{
		this.membershipType = membershipType;
	}



     public static void main(String []args)
     {
	ArrayList<Membership> members = new ArrayList<Membership>();
	
	Scanner sc = new Scanner(System.in);
	int choice;
	do
	{
		System.out.println("1. Add new member");
		System.out.println("2. Display all members");
		System.out.println("3. search for member");
		System.out.println("4. Exit");
		System.out.println("Enter your choice: ");
		choice=sc.nextInt();
		switch(choice)
		{
		case 1:
			System.out.println("Enter your name : ");
			sc.nextLine();
			String name =sc.nextLine();
			System.out.println("Enter mobile number:");
			int mobileNumber=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter membership type (Regular or Premium:");
			sc.nextLine();
			String membershipType=sc.nextLine();
			Membership member = new Membership(name, mobileNumber, membershipType);
			members.add(member);
			break;
		case 2:
			
			System.out.println("All members:");
            for (Membership m : members) {
                System.out.println("Name: " + m.getName());
                System.out.println("Mobile number: " + m.getMobileNumber());
                System.out.println("Membership type: " + m.getMembershipType());
                System.out.println();
            }
            break;
		case 3:
            System.out.print("Enter mobile number: ");
            int searchMobileNumber = sc.nextInt();
            boolean found = false;
            for (Membership m : members) 
               {
                if (m.getMobileNumber() == searchMobileNumber) 
                   {
                    System.out.println("Name: " + m.getName());
                    System.out.println("Mobile number: " + m.getMobileNumber());
                    System.out.println("Membership type: " + m.getMembershipType());
                    System.out.println();
                    found = true;
                    break;
                    }
		
	           }
            
                 if (!found) 
                 {
                System.out.println("Member not found.");
                 }
                 break;
        case 4:
            System.out.println("Exiting program.");
            break;
        default:
            System.out.println("Invalid choice. Please try again.");
            break;
 }

        System.out.println();
	}     while (choice != 4);

           sc.close();
}
}


	
	
	
	


