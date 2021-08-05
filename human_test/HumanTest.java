package human_test;

public class HumanTest {

	public static void main(String[] args) {
		System.out.println("Main Entry");
		
		
		Human Frankie = new Human();
		Human Joli = new Human();
		
		Frankie.attack(Joli);
		System.out.println(Joli.getHealth());
		
		Wizard Willa = new Wizard();
		
		Willa.healOnCasting(Joli);
		System.out.println(Joli.getHealth());
		
		Willa.fireballAttack(Frankie);
		System.out.println(Frankie.getHealth());
		
		Ninja Nancy = new Ninja();
		
		Nancy.steal(Frankie);
		System.out.println(Frankie.getHealth());
		
		Nancy.runAway();
		System.out.println(Nancy.getHealth());
		
		Samuri Samantha = new Samuri();
		Samuri Sally = new Samuri();
		Samuri Susan = new Samuri();
		System.out.println(Samuri.howMany());
		
		Sally.deathBlow(Joli);
		System.out.println(Sally.getHealth());
		
		Sally.meditate(Sally);
		System.out.println(Sally.getHealth());
		
		
		

	}

}
