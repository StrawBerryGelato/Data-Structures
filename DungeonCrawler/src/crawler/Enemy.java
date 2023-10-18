package crawler;

public class Enemy extends Entities {

	public Enemy(String name, int maxHealth, int curHealth, int attack, int defense, int speed, int money) {
		super(name, maxHealth, curHealth, attack, defense, speed, money);
		// TODO Auto-generated constructor stub
		name = name;
		maxHealth = maxHealth;
		curHealth = curHealth;
		attack = attack;
		defense = defense;
		speed =speed;
		money = money;
	}
	
	Enemy bandit = new Enemy("Bandit",100,100,10,10,10,6);
	Enemy wolf = new Enemy("Wolf",50,50,5,5,7,4);
	Enemy skeleton = new Enemy("Skeleton",80,80,10,5,4,3);
	Enemy spider = new Enemy("Spider",30,30,4,5,5,3);
	/**
	 * @return the bandit
	 */
	public Enemy getBandit() {
		return bandit;
	}
	/**
	 * @param bandit the bandit to set
	 */
	public void setBandit(Enemy bandit) {
		this.bandit = bandit;
	}
	/**
	 * @return the wolf
	 */
	public Enemy getWolf() {
		return wolf;
	}
	/**
	 * @param wolf the wolf to set
	 */
	public void setWolf(Enemy wolf) {
		this.wolf = wolf;
	}
	/**
	 * @return the skeleton
	 */
	public Enemy getSkeleton() {
		return skeleton;
	}
	/**
	 * @param skeleton the skeleton to set
	 */
	public void setSkeleton(Enemy skeleton) {
		this.skeleton = skeleton;
	}
	/**
	 * @return the spider
	 */
	public Enemy getSpider() {
		return spider;
	}
	/**
	 * @param spider the spider to set
	 */
	public void setSpider(Enemy spider) {
		this.spider = spider;
	}
	

}
