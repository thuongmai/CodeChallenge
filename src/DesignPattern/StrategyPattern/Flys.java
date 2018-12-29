package DesignPattern.StrategyPattern;

/*
 * WHEN TO USE:
 * - Reduce long lists of conditions
 * - Avoids duplicate code
 * - Keep class changes from forcing other class changes
 * - Can hide complicated/secret code from the user
 * - Negative: Increased # of Objects/Classes
 */

public interface Flys {
	String fly();
}

class ItFlys implements Flys {
	@Override
	public String fly() {
		return "Flying high";
	}
}

class CantFly implements Flys {
	@Override
	public String fly() {
		return "Can't Fly";
	}
	
}
