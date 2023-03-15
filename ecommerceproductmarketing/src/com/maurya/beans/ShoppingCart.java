package com.maurya.beans;

import java.util.ArrayList;

public class ShoppingCart 
{
         private ArrayList<SellProduct> cart = new ArrayList<>();
         
         public void addProduct(SellProduct product) 
         {
             cart.add(product);
         }

         public void removeProduct(SellProduct product)
         {
             cart.remove(product);
         }

         public ArrayList<SellProduct> getCart() 
         {
             return cart;
         }

         public double getTotalPrice() 
         {
             double totalPrice = 0;
             for (SellProduct sellable : cart) 
             {
                 totalPrice += sellable.getPrice();
             }
             return totalPrice;
         }
     }

