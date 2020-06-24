package com.arvest.CatProject;

public class Cat {
	
	//variable
private String name;
private String gender;
private int age;
double weight;
//boolean isAMouser;
private boolean isAMouser = true;

	public Cat(String name, String gender, int age, double weight, boolean isAMouser) {
		// TODO Auto-generated constructor stub
		//Cat(String string, String string2, int i) not a good variables
		//Constructor
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.weight = weight;
		this.isAMouser = isAMouser;
	
		
	}

	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}

	public String getGender() {
		// TODO Auto-generated method stub
		return this.gender;
	}

	public int getAge() {
		// TODO Auto-generated method stub
		return this.age;
	}

	public double getWeight() {
		// TODO Auto-generated method stub
		return this.weight;
		}
//	public void thisCatIsAMouser(Boolean mouser){
//		if (mouser == true)
//			System.out.println("yes");
//		else {
//			System.out.println("No");
//		}


	public boolean isAMouser(Boolean mouser) {
		return this.isAMouser(mouser);
	}
}

