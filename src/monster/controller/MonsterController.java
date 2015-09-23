package monster.controller;

import monster.model.MonsterMash;
import marshmallows.view.MonsterDisplay;
import java.util.Scanner;

public class MonsterController
{
	private MonsterMash claytonMonster; //Declares a Monster called claytonMonster
	private MonsterMash userMonster;
	private MonsterDisplay myDisplay;
	private Scanner monsterScanner;
	
	public MonsterController()
	{
		String name = "The two and a half-legged thing.";
		int eyes = 3;
		int mouths = 2;
		double legs = 2.5;
		double hair = 2.0;
		boolean isMale = true;
		
		monsterScanner = new Scanner(System.in);
		myDisplay = new MonsterDisplay();
		claytonMonster = new MonsterMash(name, eyes, mouths, legs, hair, isMale);
	}
	
	public void start()
	{
		myDisplay.displayInfo(claytonMonster.toString());
		createUserMonster();
		myDisplay.displayInfo("User monster info: " + userMonster.toString());
	}
	
	private void askQuestions()

	{
		
		System.out.println("Give the monster a name:");
		String newMonsterName = monsterScanner.next();
		claytonMonster.setmonsterName(newMonsterName);
		
		System.out.println("Give him a new number of eyes");
		int newEyes = monsterScanner.nextInt();
		claytonMonster.setmonsterEyes(newEyes);
		
		System.out.println("How many mouths do you want him to have?");
		int newMouths = monsterScanner.nextInt();
		claytonMonster.setmonsterMouths(newMouths);
		
		System.out.println("How many legs does it have?");
		int newLegs = monsterScanner.nextInt();
		claytonMonster.setmonsterLegs(newLegs);
		
		System.out.println("What is the number of its hair strands?");
		int newHair = monsterScanner.nextInt();
		claytonMonster.setmonsterHair(newHair);
		
		System.out.println("Is it male or Female?");
		boolean newMale = monsterScanner.nextBoolean();
		claytonMonster.setmonsterMale(newMale);
	}

	/**
	 * Creates a MarshmallowMonster instance on user input.
	 */
	private void createUserMonster()
	{
		//Step one: Gather user information
		System.out.println("What's the name of your monster?");
		String userName;
		userName = monsterScanner.nextLine(); 
		System.out.println("How many eyes does it have? Number please");
		int userEyes = monsterScanner.nextInt();
		System.out.println("How many Mouths does it have? Numbers only");
		int userMouth;
		userMouth = monsterScanner.nextInt();
		System.out.println("How many legs does it have (decimal value only)?");
		double userLegs = monsterScanner.nextDouble();
		System.out.println("How much hair does it have? Decimal value again.");
		double userHair = monsterScanner.nextDouble();
		System.out.println("Is it a male? True or False?");
		boolean userMale = monsterScanner.nextBoolean();
		
		//Step two: Build the monster using the constructor. Has to be in same order as in line 18 of MONSTERMASH class.
		userMonster = new MonsterMash(userName, userEyes, userMouth, userLegs, userHair, userMale);
		
		
		
	}
}

