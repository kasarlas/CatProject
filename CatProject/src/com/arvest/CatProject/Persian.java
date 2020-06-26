package com.arvest.CatProject;

public class Persian extends Cat {

	public Persian(String name, String gender, int age, double weight,
			boolean isAMouser) {
		super(name, gender, age, weight, isAMouser);
	}

	void meow(int numTimes) {
		for (int i = 0; i < numTimes; i++) {
			System.out.println("Cat " + this.name+" is " + i);
		}
	}
}
