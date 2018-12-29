package DesignPattern.StrategyPattern;

public class Dog extends Animal {
	public Dog() {
		super.setSound("Bard");
		flyingType = new CantFly();
	}
}
