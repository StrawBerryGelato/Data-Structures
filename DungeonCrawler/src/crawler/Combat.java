package crawler;
import java.util.Random;
public class Combat extends Entities{
	public Combat(String name, int maxHealth, int curHealth, int attack, int defense, int speed, int money) {
		super(name, maxHealth, curHealth, attack, defense, speed, money);
		// TODO Auto-generated constructor stub
	}
	Entities hero = new Entities(hero.getName(),hero.getMaxHealth(),hero.getCurHealth(),hero.getAttack(),hero.getDefense(),hero.getSpeed(),hero.getMoney() );
	void battle() {
		for()
	}
	
	
	
	int playerAttack(int curHealth,int attack,int defense) {
		int damage=curHealth-attack-defense;
		return damage;
	}
	int enemyAttack(int curHealth,int attack,int defense) {
		int damage=curHealth-attack;
		return damage;
	}
	
	
	 	
	
}
