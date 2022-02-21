package com.logical;
import java.util.Scanner;

public class PrimeNumber {
	   public static void main(String[] args)
	   {
	      int num, i, count=0;
	      Scanner s = new Scanner(System.in);
	      
	      System.out.print("Enter a Number: ");
	      num = s.nextInt();
	      
	      for(i=2; i<num; i++)
	      {
	         if(num%i == 0)
	         {
	            count++;            
	         }
	      }
	      
	      if(count==0)
	         System.out.println("The given number " + num + "is a Prime Number.");
	      else
	         System.out.println("The given number " + num + " is not a Prime Number.");
	   }
	}
