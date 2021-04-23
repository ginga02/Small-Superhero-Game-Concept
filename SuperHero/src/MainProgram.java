import java.util.Random;

public class MainProgram {
	
	private static int roundCounter;

	public static void main(String[] args) {
	
	Random randomNumberGenerator = new Random();
	int health1 = randomNumberGenerator.nextInt(100);
	int health2 = randomNumberGenerator.nextInt(100);
	
	Superman Superman = new Superman(health1);
	Batman Batman = new Batman(health2);
	
	System.out.println("Super heroes created. Now let's fight");
	
	roundCounter = 0;
	
	while(!Superman.isDead() && !Batman.isDead()) {
		Superman.attack(Batman);
		Batman.attack(Superman);
		
		if((roundCounter%2)==0) {
			Batman.regenerateHealth();
			System.out.println("Batman has regenerated");
		}
		
		if((roundCounter%3)==0) {
			Superman.attack(Batman);
			System.out.println("Superman has attacked twice!");
		}
		
		if(Superman.isDead()) {
			System.out.println("Superman is dead!");
		}
		if(Batman.isDead()) {
			System.out.println("Batman is dead!");
		}
		
		
		
	}
}
}