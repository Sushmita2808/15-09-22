package com.array.test3;

public class ApartmentOwner {
	private String owner;
	private String[] apartments;
	
	
	public ApartmentOwner(String owner) {//Parametrize Constructor 
		this.owner = owner;
		apartments = new String[10];//size of an array is 10
		}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getApartments(int slot) {//return slot value
		return apartments[slot];
	}

	public void setApartments(String address,int slot) {//return address
		apartments[slot] = address;
	}
	 public int countApartments() {
		 int num = 0;//count the apartments
		for (int i = 0; i < 10; i++)
		if (apartments[i] != null)
			num ++;
		return num;//return number of apartments
		}
		public void reorganizeApartments() {
			int empty = -1; //  empty slot
			for (int i = 0; i < 10; i++) {
				if (apartments[i] == null && empty == -1)
					empty = i;
				if (apartments[i] != null && empty != -1) {
					apartments[empty] = apartments[i];
					apartments[i] = null;
					empty++;
		      }
		   }
		}
		
		@Override
		public String toString() {
			String apart = "";
			apart += "Owner: " + owner;
			for (int i = 0; i < 10; i++)
				if (apartments[i] != null)
					apart+= "\nApartment " + i + ": " + apartments[i];
			return apart;
		}
	}




