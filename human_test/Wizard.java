package human_test;

public class Wizard extends Human {
	public int health;
	public int intelligence;
	
	//constructor
	public Wizard() {
		this.health = 50;
		this.intelligence = 8;
	}
	
	//heal method
	public int healOnCasting(Human heal) {
		heal.health += this.intelligence;
		return heal.health;
	}
	
	//fire ball method
	public int fireballAttack(Human hurt) {
		hurt.health -= this.intelligence * 3;
		return hurt.health;
	}

	
}
