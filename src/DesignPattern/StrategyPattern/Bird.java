package DesignPattern.StrategyPattern;

public class Bird extends Animal{
	public Bird() {
		super.setSound("Twit");
		flyingType = new ItFlys();
	}
}
