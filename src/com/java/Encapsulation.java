package com.java;

class Test {
	private int age;
	private String name;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	void display() {
		System.out.println(age+" :"+name);
	}
}

public class Encapsulation {

	public static void main(String[] args) {
		Test test = new Test();
		test.setAge(28);
		test.setName("Abrar");
		test.display();
		//System.err.println(test.getAge() + " " + test.getName());

	}

}
