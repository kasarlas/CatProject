package com.arvest.CatProject;

public class BritishShorthair extends Cat {

	public BritishShorthair(String name, String gender, int age, double weight,
			boolean isAMouser) {
		super(name, gender, age, weight, isAMouser);
	}

	void meow(int numTimes) {
		for (int i = 0; i < numTimes; i++) {
			System.out.println(" Meow " + i);
		}
	}
}
