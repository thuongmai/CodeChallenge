package DesignPattern.ReviewOOP;

public class Giraffe extends Creature{

	private String name;
	
	@Override
	public void setName(String newName) {
		name = newName;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setWeight(int newWeight) {
	}

	@Override
	public int getWeight() {
		return 0;
	}

}
