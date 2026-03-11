package day2;

public class Dog extends Animal implements Pet {
	private String breed;

	public Dog(String breed) {
		this.breed = breed;
	}
	public  void sound(int str){
        System.out.println("dog makes sound");
    }

	public String getBreed() {
		return breed;
	}

	@Override
	public void play() {
		System.out.println("playing with " + getName());
	}

	public void bark() {
		System.out.println(getName() + "  is barking");
	}
}
