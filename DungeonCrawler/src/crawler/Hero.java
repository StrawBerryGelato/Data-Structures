package crawler;

public class Hero extends Entities{
	String name;
		
	
	public Hero(String name, int maxHealth, int curHealth, int attack, int defense, int speed, int money) {
		super(name, maxHealth, curHealth, attack, defense, speed, money);
		// TODO Auto-generated constructor stub
		name = "Issac";
		maxHealth = 100;
		curHealth = 100;
		attack = 10;
		defense = 10;
		speed = 10;
		money = 0;
	}

}
