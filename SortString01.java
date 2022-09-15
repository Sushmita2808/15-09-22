package com.array.test3;

import java.util.Scanner;

public class SortString01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String names[] = new String[3];//size of an array is 3
		
		System.out.println("*************************************************");
		System.out.println("Enter " + names.length + " Names: ");//assign values
		for(int i=0; i<names.length; i++) 
			names[i] = scanner.nextLine();
		
		System.out.println("Names before sorting: ");
		for(int i=0; i<names.length; i++)
			System.out.println(names[i]);
		
		// ascending order of the values
		
		
		for(int i=0; i<names.length; i++) {  //nested loop
			for(int j=i+1; j<names.length; j++) {
			
				if(names[i].compareTo(names[j])<0)  {
					String temp = names[i];
					names[i] = names[j];
					names[j] = temp;
				}
			}
		}
		
		System.out.println("\nNames after sorting in ascending order:");
		for(int i=0; i<names.length; i++)
			System.out.println(names[i]);
		
		// descending order of the values
		for(int i=0; i<names.length; i++) { //nested loop
					for(int j=i+1; j<names.length; j++) {
						if(names[i].compareTo(names[j])>0) {
							String temp = names[i];
							names[i] = names[j];
							names[j] = temp;
						
						}
						
					}
		}
				
		System.out.println("\nNames after sorting in descending order:");
			for(int i=0; i<names.length; i++)
					System.out.println(names[i]);
		
		System.out.println("*************************************************");
		scanner.close();

	}

}



