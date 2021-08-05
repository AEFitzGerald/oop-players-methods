package human_test;

public class Samuri extends Human {
	public static int totalSamuri = 0;
	public Samuri() {
		this.health = 200;
		totalSamuri++;
	}
	
	//method death blow
	public int deathBlow(Human attack) {
		attack.health = 0;
		this.health = this.health / 2;
		
		return this.health;
	}
	
	public int meditate(Samuri heal) {
		this.health = this.health * 2;
		
		return this.health;
	}
	
	public static int howMany() {
		return totalSamuri;
	}
	
	
	

}
