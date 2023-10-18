package crawler;

import java.util.Scanner;

public class game {
	Scanner input = new Scanner(System.in);
	Entities hero = new Entities(input.next(),100,100,10,10,10,0);
	Entities bandit = new Entities("Bandit",100,100,10,10,10,0);
	Entities wolf = new Entities("Wolf",100,100,10,10,10,0);
	Entities spider = new Entities("Spider",100,100,10,10,10,0);
}
