package human_test;

public class Human {
	//fields
	public int strength;
	public int stealth;
	public int intelligence;
	public int health;
	
	//constructor
	public Human() {
		this.strength = 3;
		this.stealth = 3;
		this.intelligence = 3;
		this.health = 100;
	}
	//attack method
	public int attack(Human a) {
		a.health -= this.strength;
		return a.health;
	}
	//getters and setters
	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public int getStealth() {
		return stealth;
	}

	public void setStealth(int stealth) {
		this.stealth = stealth;
	}

	public int getIntelligence() {
		return intelligence;
	}

	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}
	
	
	//public class Human (int strength input, int stealth input, int 

}
