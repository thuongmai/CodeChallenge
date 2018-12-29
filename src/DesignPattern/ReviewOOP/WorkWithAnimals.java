package DesignPattern.ReviewOOP;

public class WorkWithAnimals {
	public static void main (String[] args) {
		Dog fido = new Dog();
		fido.setName("Fido");
		System.out.println(fido.getName());
		
		fido.digHole();
		fido.setWeight(-1);
		
		changeObjectName(fido);
		System.out.println("Dog name: " + fido.getName());
		
		Animal newDog = new Dog();
		Animal newCat  = new Cat();
		System.out.println("Dog sound: " + newDog.getSound());
		System.out.println("Cat sound: " + newCat.getSound());
		
		speakAnimal(newDog);
		((Dog)newDog).digHole();
	}
	
	public static void changeObjectName(Dog fido) {
		fido.setName("Marcus");
	}
	
	public static void speakAnimal(Animal randAnimal) {
		System.out.println("Animal says: " + randAnimal.getSound());
	}
}
