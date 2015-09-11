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
	
	public String toString()
	{
		String monsterInfo = "My monster has " + monsterEyes
				+ " eyes, and it's name is" + monsterName + " "
						+ "is the monster a dude? " + monsterMale 
						+ ". The monster also has " + monsterHair + " hairs, and "
						+ monsterLegs + " legs. What a silly monster.";
		
		return monsterInfo;
	}

}
