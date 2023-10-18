package crawler;

public class Entities {
	private String name;
	private int maxHealth;
	private int curHealth;
	private int attack;
	private int defense;
	private int speed;
	private int money;
	/**
	 * @return the name
	 */
	

	public Entities(String name, int maxHealth, int curHealth, int attack, int defense, int speed, int money) {
		super();
		this.name = name;
		this.maxHealth = maxHealth;
		this.curHealth = curHealth;
		this.attack = attack;
		this.defense = defense;
		this.speed = speed;
		this.money = money;
	}
	
	Entities hero = new Entities("Logan",100,100,10,10,10,0);
	Entities bandit = new Entities("Bandit",100,100,10,10,10,0);
	Entities wolf = new Entities("Wolf",100,100,10,10,10,0);
	Entities spider = new Entities("Spider",100,100,10,10,10,0);

	
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the maxHealth
	 */
	public int getMaxHealth() {
		return maxHealth;
	}
	/**
	 * @param maxHealth the maxHealth to set
	 */
	public void setMaxHealth(int maxHealth) {
		this.maxHealth = maxHealth;
	}
	/**
	 * @return the curHealth
	 */
	public int getCurHealth() {
		return curHealth;
	}
	/**
	 * @param curHealth the curHealth to set
	 */
	public void setCurHealth(int curHealth) {
		this.curHealth = curHealth;
	}
	/**
	 * @return the attack
	 */
	public int getAttack() {
		return attack;
	}
	/**
	 * @param attack the attack to set
	 */
	public void setAttack(int attack) {
		this.attack = attack;
	}
	/**
	 * @return the defense
	 */
	public int getDefense() {
		return defense;
	}
	/**
	 * @param defense the defense to set
	 */
	public void setDefense(int defense) {
		this.defense = defense;
	}
	/**
	 * @return the speed
	 */
	public int getSpeed() {
		return speed;
	}
	/**
	 * @param speed the speed to set
	 */
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	/**
	 * @return the money
	 */
	public int getMoney() {
		return money;
	}
	/**
	 * @param money the money to set
	 */
	public void setMoney(int money) {
		this.money = money;
	}

}
