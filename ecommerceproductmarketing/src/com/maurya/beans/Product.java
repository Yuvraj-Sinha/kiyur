package com.maurya.beans;
import com.maurya.beans.*;

public class Product implements SellProduct
{
	
	private int id;
	private String name;
	private double productprice;
	private int quantity;
	
	public Product(int id, String name, double price, int quantity) 
	{
		
		this.id = id;
		this.name = name;
		this.productprice = price;
		this.quantity = quantity;
	}

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public double getproductPrice() 
	{
		return productprice;
	}

	public void setPrice(double price)
	{
		this.productprice = productprice;
	}

	public int getQuantity() 
	{
		return quantity;
	}

	public void setQuantity(int quantity) 
	{
		this.quantity = quantity;
	}
	
	@Override
	public double getPrice()
	{
		return productprice;
	}
	 @Override
	    public String toString() 
	 {
	        return "Product [id=" + id + ", name=" + name + ", price=" + productprice + ", quantity=" + quantity + "]";
	 }
	
	
}



