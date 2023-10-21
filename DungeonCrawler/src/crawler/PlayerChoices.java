package crawler;
import java.util.Scanner;
public class PlayerChoices {

	Scanner input = new Scanner(System.in);
	
	Room tavern = new Room();
	
	 void tavernMenu() {
		System.out.println();
		System.out.println("What will you do?");
		System.out.println("Options");
		System.out.println("Store - Dungeon - Rest(10 GP) - Stats");
	 }
	 
	void tavernChoice(Entities player) {
		String choice=input.next();
		switch(choice) { 
		case "dungeon":
		case "Dungeon"://Enter Dungeon
		Room room1 = new Room();
		Room room2 = new Room();
		Room room3 = new Room();
		Room room4 = new Room();
		Room room5 = new Room();
		Room room6 = new Room();
		Room room7 = new Room();
		Room room8 = new Room();
		Room room9 = new Room();
		Room room10 = new Room();
		Room victory = new Room();
		room1.next=room2;
		room2.next=room3;
		room3.next=room4;
		room4.next=room5;
		room5.next=room6;
		room6.next=room7;
		room7.next=room8;
		room8.next=room9;
		room9.next=room10;
		room10.next=victory;
		victory.next=tavern;
		System.out.println("You leave the errie tavern and make way eastward towards the dungeon.");
		System.out.println("In about an hour you have arrived in the dungeon and enter its dark and decrepit walls.");
			break;
		case "store":
		case "Store"://Store
		Room store = new Room();
		System.out.println();
		System.out.println("You leave the tavern and head down the road to general store.");
		System.out.println("As you enter you gaze upon the various trinkets that adorn the dusty shelves.");
		System.out.println("The shopkeep sweeping up the dust notices you and suddenly perks up.");
		System.out.println("Ah an adventurer, welcome to my shop what can I getcha?");

		store.next=tavern;
			break;
		case "stats":
		case "Stats":
			System.out.println(player.getName());
			System.out.println("Attack: "+ player.getAttack());
			System.out.println("Defense: " +player.getDefense());
			System.out.println("Max HP: "+ player.getMaxHealth());
			System.out.println("Current HP: "+ player.getCurHealth());
			System.out.println("Gold: "+ player.getMoney());
		case "rest":
		case "Rest":
			if (player.getMoney()>=10) {
			System.out.println("You rent a room in the tavern and rest for the night. It costed 10 Gold");
			player.setCurHealth(player.getMaxHealth());
			player.setMoney(player.getMoney()-10);
			}
			else {
				System.out.println("You cannot afford a room currently.");
				tavernMenu();
				tavernChoice(player);
			}
		break;
		default:
			System.out.println("Invalid Choice");
		}
	}
}
