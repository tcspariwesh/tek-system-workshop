package com.tek.fi;
@FunctionalInterface   //annotation
interface Animal{
	void eat();
//	void run();
}

class Cat implements Animal{  //OOP
	@Override
	public void eat() {
		System.out.println("animal eat inside class");
	}
}
public class FunctionalInterfaceDemo {
	public static void main(String[] args) {
		oopWay();
//		functional();
	}

	private static void oopWay() {
		Animal animal = new Cat();
		animal.eat();
	}

	private static void functional() {
		Animal animal = ()->{  //inline lambda expression or function
			System.out.println("animal eat in Lambda");
		};
		animal.eat();		
	}
}
