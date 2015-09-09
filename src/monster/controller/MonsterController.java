package monster.controller;

import monster.model.MonsterMash;

public class MonsterController
{
	private MonsterMash claytonMonster;
	
	public MonsterController()
	{
		String name = "The two and a half-legged thing.";
		int eyes = 3;
		int mouths = 2;
		double legs = 2.5;
		double hair = 2.0;
		boolean isMale = true;
		
		claytonMonster = new MonsterMash(name, eyes, mouths, legs, hair, isMale);
	}
	
	public void start()
	{
		
	}
}
