package monster.controller;

import monster.model.MonsterMash;
import marshmallows.view.MonsterDisplay;

public class MonsterController
{
	private MonsterMash claytonMonster;
	private MonsterDisplay myDisplay;
	
	public MonsterController()
	{
		String name = " The two and a half-legged thing.";
		int eyes = 3;
		int mouths = 2;
		double legs = 2.5;
		double hair = 2.0;
		boolean isMale = true;
		
		myDisplay = new MonsterDisplay();
		claytonMonster = new MonsterMash(name, eyes, mouths, legs, hair, isMale);
	}
	
	public void start()
	{
		myDisplay.displayInfo(claytonMonster.toString());
	}

}
