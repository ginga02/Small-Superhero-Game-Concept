import java.util.Random;

public class SuperHero {
	
	private String name;
	private int health;
	private boolean isDead;
	
	public SuperHero(String name, int health) {
		super();
		this.name = name;
		this.health = health;
		System.out.println(this.name + " is born with a health of " + this.health);
	}
	
	public void attack(SuperHero opponent) {
		
		Random randomNumberGenerator = new Random();
		int damage = randomNumberGenerator.nextInt(10);
		
		opponent.determineHealth(damage);
		System.out.println(opponent.getName() + " has taken a hit of " + damage + " points. His health is now " + opponent.getHealth());
		
	}
	
	public void determineHealth(int damageTaken) {
		if (this.getHealth() - damageTaken <= 0) {
			this.setHealth(0);
			this.setDead(true);
		}
		else {
			this.setHealth(this.health - damageTaken);
		}
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	public boolean isDead() {
		return isDead;
	}
	public void setDead(boolean isDead) {
		this.isDead = isDead;
	}
	
	
}
