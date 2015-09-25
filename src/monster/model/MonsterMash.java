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
	

	
	
	
	public String getMonsterName()
	{
		return monsterName;
	}
	
	public int getmonsterEyes()
	{
		return monsterEyes;
	}
	
	public int getmonsterMouths()
	{
		return monsterMouths;
	}
	
	public double getmonsterLegs()
	{
		return monsterLegs;
	}
	
	public double getmonsterHair()
	{
		return monsterHair;
	}
	
	public boolean getmonsterMale()
	{
		return monsterMale;
	}

	
	
	
	
	/**
	 *  end of the gets, start of the sets
	 *
	 */
	
	
	
	
	
	
	
	public void setmonsterName(String monsterName)
	{
		this.monsterName = monsterName;
	}
	
	public void setmonsterEyes(int monsterEyes)
	{
		this.monsterEyes = monsterEyes;
	}
	
	public void setmonsterMouths(int monsterMouths)
	{
		this.monsterMouths = monsterMouths;
	}
	
	public void setmonsterLegs(double monsterLegs)
	{
		this.monsterLegs = monsterLegs;
	}
	
	public void setmonsterHair(double monsterHair)
	{
		this.monsterHair = monsterHair;
	}
	
	public void setmonsterMale(boolean monsterMale)
	{
		this.monsterMale = monsterMale;
	}
	
	public String toString()
	{
		String monsterInfo = "The"
				+ " monster's name is " + monsterName + 
				", it has " + monsterHair + " strands of hair, and has " + monsterLegs + 
				" legs. Is the monster Male? The answer is: " + monsterMale + ". there you go."
						+ " What a cool monster!";
		
		return monsterInfo;
	}
}








