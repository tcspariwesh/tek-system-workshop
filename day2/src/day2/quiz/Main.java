package day2.quiz;
class Animal {
     void eat() {
        System.out.println("Eating");
    }
}

class Dog extends Animal {
	@Override
    void eat() {
        System.out.println("Dog eating");
    }
}
 
public class Main{
	public static void main(String[] args) {
		Animal animal = new Dog();
		animal.
	}
}