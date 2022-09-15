package com.array.test3;

import java.util.Scanner;

public class Compute03 {
	 public static void main(String[] args)
	 { int len;
		 Scanner sc = new Scanner(System.in);
		 System.out.println("*************************************************");
	       System.out.println("Enter length of an array:");//size of the array
	        len = sc.nextInt();
	      int array_nums[] = new int[len+1];
	      System.out.println("Enter "+len+" elements:");//assign values
	        for(int i = 0; i < len; i++)
	        {
	            array_nums[i] = sc.nextInt();
	        }
		int max = array_nums[0];//max number
		int min = array_nums[0];//min number
		float sum = array_nums[0];
		for(int i = 1; i < array_nums.length; i++)
		{
			sum  += array_nums[i];
			if(array_nums[i] > max) 
				max = array_nums[i];//if num is max
			else if(array_nums[i] < min)
				min = array_nums[i];//if num is min
		}
		float x = ((sum-max-min) / (array_nums.length - 2));//output type is float
		System.out.printf("Compute the average value of an array of integers except the largest and smallest values: %2f",x);
		System.out.print("\n");	
		System.out.println("*************************************************");
		sc.close();
	  }
	}



