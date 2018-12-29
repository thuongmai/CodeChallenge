package DesignPattern.StrategyPattern;

public class AnimalPlay {
	public static void main (String[] args) {
		Animal dog = new Dog();
		Animal bird = new Bird();
		
		//System.out.println("Dog sound: " + dog.getSound());
		System.out.println("Dog sound: " + dog.tryToFly());
		
		//System.out.println("Bird sound: " + bird.getSound());
		System.out.println("Bird sound: " + bird.tryToFly());
	}
}

