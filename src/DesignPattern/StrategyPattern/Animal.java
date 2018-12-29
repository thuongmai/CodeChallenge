package DesignPattern.StrategyPattern;

public class Animal {
	private String sound;
	public Flys flyingType;

	public String getSound() {
		return sound;
	}
	public void setSound(String sound) {
		this.sound = sound;
	}
	
	public String tryToFly() {
		return flyingType.fly();
	}
	
	public void setFlyingAbility(Flys newFlyType) {
		flyingType = newFlyType;
	}
}