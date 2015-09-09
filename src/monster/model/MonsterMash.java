package monster.model;

public class MonsterMash
{
	private String monsterName;
	private int monsterEyes;
	private int monsterMouths;
	private double monsterLegs;
	private double monsterHair;
	private boolean monsterMale;
	
	
	private MonsterMash()
	{
		
	}
	
	public MonsterMash(String monsterName, int monsterEyes,
						int monsterMouths, double monsterLegs, 
						double monsterHair, boolean monsterMale)
	{
		this.monsterName = monsterName;
		this.monsterEyes = monsterEyes;
		this.monsterMouths = monsterMouths;
		this.monsterLegs = monsterLegs;
		this.monsterHair = monsterHair;
		this.monsterMale = monsterMale;
	
	}
}
