package human_test;

public class Ninja extends Human {
	//fields
	public int stealth;
	
	//constructor
	public Ninja() {
		this.stealth = 10;
	}
	
	//steal method
	public int steal(Human reduce) {
		reduce.health -= this.stealth;
		return reduce.health;
	}
	
	//runaway method
	public void runAway() {
		this.health -= 10;
	}
	
}
