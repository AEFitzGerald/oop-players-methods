package human_test;

public class HumanTest {

	public static void main(String[] args) {
		System.out.println("Main Entry");
		
		
		Human Frankie = new Human();
		Human Joli = new Human();
		
		Frankie.attack(Joli);
		System.out.println(Joli.getHealth());
		

	}

}
