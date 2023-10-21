package crawler;

import java.util.Scanner;



 	
public class GameEngine{
	public static void main(String[] args) {
	//Intro Sequence
	Entities player = new Entities("Issac", 100, 100, 10, 10, 10, 0);
	System.out.println("The door creaks loudly as you enter the tavern.");
	
	System.out.println("Ghostly patrons are silent as they all stare as the echoes of your deafening boots breaks the silence.");

	System.out.println("As you approach the counter, the tavern owner eyes you up and down before finally asking");

	System.out.println("Tavern Owner: Welcome weary traveller, to whom do I owe my business to?");
	Scanner input = new Scanner(System.in);
	
	System.out.println("Please Enter Name.");
	player.setName(input.next());
	
	System.out.println();
	System.out.println(player.getName()+" eh? If you are here you must be an adventurer no? ");
	System.out.println("Tavern Owner: Well adventurer, The local dungeon is about 100 yalms east from here you can't miss it.");
	System.out.println("Tavern Owner: If you need to need a place of rest, a cold beer or a hot meal, you can return here for 10 gold, no bargaining.");
	System.out.println("Tavern Owner: Well Adventurer, I'll let you get settled in, if you need anything you need only ask.");
	
	
	//Start of Game
	Room tavern = new Room();
	PlayerChoices choice = new PlayerChoices();
	choice.tavernMenu();
	choice.tavernChoice(player);
	
	

	//Tavern Routes
	

		input.close();
}
}
