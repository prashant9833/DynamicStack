package com.demo.test;

import  java.util.*;

public class Stack {
	
	static Scanner sc=new Scanner(System.in);
	
	static int size,top=-1,item;
	
	static int[] stack;
	
	static {
		
		create();
	}
	
  public static void create() {
	  
	  System.out.println("Enter the size of stack..."); 
	  size=sc.nextInt();
	  stack=new int[size];
	  System.out.println("Stack has been created with size "+size); 
  }
  
  public static void push(int item){
	  
	  if(isFull()) {
		  System.out.println("stack is overflow.....");
	  }else {
		  
		  stack[++top]=item;
	  }
	  
  }
  
  public static boolean isFull() {
	  
	  if(top==size-1) {
		  
		  return true;
		  
	  }else {
		  
		  return false;
	  }
  }
  
  public static int pop(){
	  
	  if(isEmpty()) {
		  
		  return 0;
		  
	  }else {
		  
		  return stack[--top];
	  }
	  
  }
  
  public static boolean isEmpty(){
	  
	  if(top==-1) {
		  
		  return true;
		  
	  }else {
		  
		  return false;
	  }
	  
  }
  
  public static int peek(){
	  
        if(isEmpty()) {
		  
		  return 0;
		  
	  }else {
		  
		  return stack[top];
	  }
	  
  }
  
  public static void traverse(){
	  
	  System.out.println("Please see.Below are the items available in your stack."); 
	  for(int i=top;i>=0;i--) {
		  
		  System.out.println(stack[i]); 
		  
	  }
	  
  }
  
  public static void clear(){
	  
	  stack=null;
	  System.out.println("Your stack has no longer part of any operations....");
	  System.exit(1);
	  
  }
  
  
	public static void main(String[] args) {
		
		int choice;
		
		while(true) 
		{
			
	
		System.out.println("Below are the list of operations for your choice.");
		System.out.println("1. Push");
		System.out.println("2. Pop");
		System.out.println("3. Peek");
		System.out.println("4. Traverse");
		System.out.println("5. Quit");
		System.out.println("6. Clear");
		
		System.out.println("Enter your choice...");
		choice=sc.nextInt();
		switch(choice) {
		
		case 1: System.out.println("Enter the item to push into the stack"); 
		       item=sc.nextInt();
			   push(item);
		       break;
		case 2:item=pop();
		       if(item==0) {
		    	   
		    	   System.out.println("stack is underflow....");
		       }else {
		    	   
		    	   System.out.println("Your item has been popped.See here---> "+item); 
		       }
	           break;
		case 3:item=peek();
	       if(item==0) {
	    	   
	    	   System.out.println("stack is underflow....");
	       }else {
	    	   
	    	   System.out.println("Your item has been peeked.See here---> "+item); 
	       }
           break;
		case 4:traverse();
	       break;
		case 5:System.exit(1);;
	       break;
		case 6:clear();
	       break;
		default:System.out.println("Your choice was invalid..."); 
		   break;
		
		}
		
		}
	
	}
	

}

