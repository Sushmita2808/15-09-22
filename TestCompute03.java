package com.array.test03;

import com.array.test3.ApartmentOwner;

//import com.array.test3.ApartmentOwner;
public class TestCompute03 {
	public static void main (String[] args) {
    ApartmentOwner p = new ApartmentOwner("Mr. XYZ");
		
		p.setApartments("BEST Apartments, 29", 0);
		p.setApartments("Dhatri Meadows - Builders and Developers, 42", 1);
		p.setApartments("Karle Zenith Residences, 9", 2);
		p.setApartments("Prestige City Sarjapur, 30", 5);
		p.setApartments("Godrej Ananda, 2500", 8);
		
		System.out.println(p);
		
		System.out.println("\n");
		
		System.out.println(p.getOwner() + " has " + p.countApartments() + " apartments");
	
		System.out.println("Apartment 2: " + p.getApartments(2));
		
		System.out.println();
		
		p.reorganizeApartments();
		System.out.println(p);
	}
}
