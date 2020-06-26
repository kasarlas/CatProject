package com.arvest.CatProject;

public class BritishShorthair extends Cat {

	public BritishShorthair(String name, String gender, int age, double weight,
			boolean isAMouser) {
		super(name, gender, age, weight, isAMouser);//The super keyword refers to superclass (parent) objects.
	}

	void meow(int numTimes) {
		for (int i = 0; i < numTimes; i++) {
			System.out.println(this.name + " Meow " + i);
		}
	}
		public void jump(int numTimes){
			for (int i = 0; i < numTimes; i++) {
				System.out.println(this.name+" Jump"+" Everyday");
		}
	}

}