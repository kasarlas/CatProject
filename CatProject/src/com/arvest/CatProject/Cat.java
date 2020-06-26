package com.arvest.CatProject;

public class Cat {
	
	//variable
public String name;
public String gender;
public int age;
double weight;
public boolean isAMouser = true;

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
		System.out.println("Cat Name is "+this.name);
		// TODO Auto-generated method stub
		return this.name;
	}

	public String getGender() {
		System.out.println(this.name +" is a "+ this.gender);
		// TODO Auto-generated method stub
		return this.gender;
	}

	public int getAge() {
		System.out.println("Cat "+this.name +" is "+ this.age);
		// TODO Auto-generated method stub
		return this.age;
	}

	public double getWeight() {
		System.out.println("Cat "+this.name +" weight is "+ this.weight);
		// TODO Auto-generated method stub
		return this.weight;
		}

	public boolean isAMouser() {
		if (isAMouser){
		System.out.println(this.name +" is a "+ "Cat");
		}else {
		System.out.println(this.name +" is not a "+ "Cat");
		}
		return this.isAMouser;
	}
	
	public void jump(int numTimes){
		for (int i = 0; i < numTimes; i++) {
			System.out.println(this.name+" Jump"+" Everyday");
		}
	}
		
		public void meow(int numTimes){
			for(int i=0; i<numTimes; i++){
				System.out.println("Meow");
			}
		}
		public  String[] meow(String string, int size){
			String[] strings = new String[size];
					for (int i=0; i<size; i++){
						strings[i] = string;
					}
			
			return strings;
		}
		
	}


