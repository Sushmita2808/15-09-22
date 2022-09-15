package com.array.test3;

import java.util.Scanner;

public class SortNum01 {
	 public static void main(String[] args) {
	    	
			Scanner scanner = new Scanner(System.in);
			int num[] = new int[5];//size of an array 5
			
			System.out.println("*************************************************");
			System.out.println("Enter " + num.length + " num: ");//assign value
			for(int i=0; i<num.length; i++) 
				num[i] = scanner.nextInt();
			
			//Before sorting
			System.out.println("Number before sorting: ");
			for(int i=0; i<num.length; i++)
				System.out.println(num[i]);
			
			// ascending order of the value
			
			
			for(int i=0; i<num.length; i++) {//nested loop we use
				for(int j=i+1; j<num.length; j++) {
				
					if(num[i]>num[j])  {
						int temp = num[i];
						num[i] = num[j];
						num[j] = temp;
					}
				}
			}
			
			System.out.println("\nNumber after sorting in ascending order:");
			for(int i=0; i<num.length; i++)
				System.out.println(num[i]);
			
			// descending order of the value
			for(int i=0; i<num.length; i++) {
						for(int j=i+1; j<num.length; j++) {
							if(num[i]<num[j]) {
								int temp = num[i];
								num[i] = num[j];
								num[j] = temp;
							
							}
							
						}
			}
					
			System.out.println("\nNumber after sorting in descending order:");
				for(int i=0; i<num.length; i++)
						System.out.println(num[i]);
			
				System.out.println("*************************************************");
			scanner.close();

		}

	}



