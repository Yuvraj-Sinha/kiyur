package com.maurya.dao;
import java.io.Serializable;
public class Enrollment implements Serializable
{      
   private String name;
   private String product;
   @Override
public String toString() 
{
	return "Enrollment [name=" + name + ", product=" + product + ", mobileNumber=" + mobileNumber + "]";
}
private int mobileNumber;
public Enrollment(String name,String product, int mobileNumber)
{
	
	this.name = name;
	this.product = product;
	this.mobileNumber = mobileNumber;
}
public String getName()
{
	return name;
}
public void setName(String name)
{
	this.name = name;
}
public String getProduct() 
{
	return product;
}
public void setProduct(String product)
{
	this.product = product;
}
public int getMobileNumber() 
{
	return mobileNumber;
}
public void setMobileNumber(int mobileNumber) 
{
	this.mobileNumber = mobileNumber;
}
   
 
}
