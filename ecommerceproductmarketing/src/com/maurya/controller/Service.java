package com.maurya.controller;

import java.util.Scanner;

import com.maurya.beans.Product;
import com.maurya.beans.SellProduct;
import com.maurya.beans.User;
import com.maurya.beans.ShoppingCart;
public class Service
{
    
	public static void main(String[] args) 
	{
		 Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter your name: ");
	        String name = scanner.nextLine();
	        System.out.print("Enter your email: ");
	        String email = scanner.nextLine();
	        User user = new User(name, email);
	        System.out.println("Welcome " + user.getName() + " to Ambay Product");

	        Product product1 = new Product(1, "Amway Nutrilite Kids Drink", 5000.0, 5);
	        Product product2 = new Product(2, "Amway Glister Multi Action Toothpaste",2000.0,1);
	        		 
	        Product product3 = new Product(3, "Amway Silicone Glaze Auto Polish",3000.0,1);
	        		
	        Product product4 = new Product(4, "Amway Nutrilite Kids Drink", 1000.0, 1);
	        
	        Product product5 = new Product(5, "Amway Nutrilite Kids Drink", 1000.0, 1);
	        
	        ShoppingCart cart = new ShoppingCart();
	        cart.addProduct(product1);
	        cart.addProduct(product2);
	        cart.addProduct(product4);
	        
	        System.out.println("Total Price: " + cart.getTotalPrice());

	        System.out.print("Enter the ID of the product you want to buy: ");
	        int productId = scanner.nextInt();
	        System.out.print("Enter the quantity you want to buy: ");
	        int quantity = scanner.nextInt();

	        Product selectedProduct = null;
	        for (SellProduct sellable : cart.getCart()) 
	        {
	            if (sellable instanceof Product && ((Product) sellable).getId() == productId) 
	            {
	                selectedProduct = (Product) sellable;
	                break;
	            }
	        }
	        if (selectedProduct != null && selectedProduct.getQuantity() >= quantity) 
	        {
	            selectedProduct.setQuantity(selectedProduct.getQuantity() - quantity);
	            System.out.println("Thank you for your purchase. Your total price is " + selectedProduct.getPrice() * quantity);
	        } else 
	        {
	            System.out.println("Product not found or insufficient quantity.");
	        }

	        scanner.close();
	    }
	        
	        
     
	}


