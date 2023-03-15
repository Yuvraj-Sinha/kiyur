package com.kiyur.service;
import com.kiyur.beans.*;
//import stream.GFG.Node;
import java.util.*;
public class GFG {
     static List<Customer> ar1;
     static List<Customer> ar2;
    static List<Customer> ar3;
     static List<Customer> ar4;
     static List<Customer> ar5;
  Customer[] arr1;
	Customer[] arr2;
	Customer[] arr3;
	Customer[] arr4;
	Customer[] arr5;
	
	
    // Representation of node
  public static class Node {
      public Customer data;
      public Node next;
      public Node child;

      public Node(Customer data) {
          this.data = data;
          this.next = null;
          this.child = null;
      }
  }
   
 
    // A function to create a linked list
  // with n(size) nodes returns head pointer
  public static Node createList(List<Customer> arr, int n) {
      Node head = null;
      Node tmp = null;
       
    // Traversing the passed array
      for (int i = 0; i < n; i++) {
             // Creating a node if the list
              // is empty
          if (head == null) {
              tmp = head = new Node(arr.get(i));
          } else {
                 
                // Created a node with data and
              // setting child and next pointer
              // as NULL.
              tmp.next = new Node(arr.get(i));
              tmp = tmp.next;
          }
      }

      return head;
  }
   
     
//To print the linked list
  public static void printMultiLevelList(Node head) {   
        // While head is not null
      while (head != null) {
          if (head.child != null) {
        	  System.out.println();
        	  System.out.println("under--");
              printMultiLevelList(head.child);
          }
        
          System.out.print(head.data + " ");
          head = head.next;
      }
  }
  
  public static String add() {
	  
	  
	  
  return null;
  }
  
  public static  boolean search(String s) {
	  boolean x=false;
	  for(int i=0;i<ar1.size();i++) {
		  
   	  if(ar1.get(i).getName().equals(s)) {
   		 System.out.println("you are our member");  
   		  x=true;
   		  if(x==true) {
   			Node n=head2;
   	       int m=0;
   	      do {
   	      
   	      n=n.next;
   	      m++;
   	      System.out.println(m);
   	      }
   	      while(m==3) ;
   	    	n.child=head5;  
   			 
   			
	  break;
   	  }
   	  
      }
	  }
	  for(int j=0;j<ar2.size();j++) {
		  
	   	  if(ar2.get(j).getName().equals(s)) {
	   		  if(j==0) {
	   			  
	   			  
	 
	   			  
	   		  }
	   		    
	   		  break;
	   	  }
	  }
	   	for(int k=0;k<ar3.size();k++) {
			  
	     	  if(ar1.get(k).getName().equals(s)) {
	     		  
	     		
	     		  break;
	     	  }
	   	}
	     	 for(int l=0;l<ar4.size();l++) {
	   		  
	     	   	  if(ar1.get(l).getName().equals(s)) {
	     	   		  
	     	   		
	     	   		  break;
	     	   	  }
	     	 }
	  
	  return x;
  }
  
    static Node head1;
    static  Node head2;
     static Node head3;
     static Node head4;
     static Node head5;
     
  public static void main(String[] args) {
         
    // Initializing the data in arrays(row wise)
	  
     Customer[] arr1= {new Customer("yuvraj",8700083606l,"address","252"),new Customer("nissan",8700083606l,"address","252")};
     ar1=Arrays.asList(arr1); 
     Customer[] arr2 = {new Customer("nishant",8700083606l,"address","252"), new Customer("manish",8700083606l,"address","252"), new Customer("ankit",8700083606l,"address","252"), new Customer("anisha",8700083606l,"address","252")};
     ar2=Arrays.asList(arr2);  
     Customer[] arr3 = {new Customer("rahul",8700083606l,"address","252")};
     ar3=Arrays.asList(arr3); 
     Customer[] arr4 = {new Customer("jatin",8700083606l,"address","252"), new Customer("manvansh",8700083606l,"address","252"), new Customer("kiyur",8700083606l,"address","252")};
     ar4=Arrays.asList(arr4);  
     Customer[] arr5 = {new Customer("jatin",8700083606l,"address","252"), new Customer("manvansh",8700083606l,"address","252"), new Customer("kiyur",8700083606l,"address","252")};
     ar5=Arrays.asList(arr5);  
      
     List<Customer>  arr6=new ArrayList<>();
    	 arr6.add(new Customer("anjali",879787832,"address","222"));
    //	 ar1.addAll(arr6);
         // creating Four linked lists
      // Passing array and size of array
      // as parameters
      
      
    head1 = createList(ar1, ar1.size());
      head2 = createList(ar2, ar2.size());
       head3 = createList(ar3, ar3.size());
       head4 = createList(ar4, ar4.size());
       head5=createList(ar5,ar5.size());
       
        // Initializing children and next pointers
         // as shown in given diagram
      head1.next.child = head2;
      head2.next.next.child = head3;
      head2.next.child = head4;
    // head1.next(6).child=head3;
       
      
        // Creating a null pointer.
      Node head = head1;
         
     
         // Function Call to print
      printMultiLevelList(head);
     System.out.println(search("yuvraj")); 
     
  }
}