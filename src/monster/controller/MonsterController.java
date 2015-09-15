package monster.controller;

import monster.model.MonsterMash;
import marshmallows.view.MonsterDisplay;
import java.util.Scanner;

public class MonsterController
{
	private MonsterMash claytonMonster;
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
		askQuestions();
		myDisplay.displayInfo("Updated monster info: " + claytonMonster.toString());
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
		
	}
}

