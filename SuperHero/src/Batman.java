
public class Batman extends SuperHero {

	public Batman(int health) {
		super("Batman", health);
		// TODO Auto-generated constructor stub
	}
	
	public void regenerateHealth() {
		Batman.super.setHealth(getHealth() + 2);
	}

	
	
}
