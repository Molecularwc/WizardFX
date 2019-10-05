package application;

/**
* A Wizard class that describes a magic user character as would be used as a Video Game Character
*
* @author	Richard Salvaty
* @version	1.0
*/

public class Wizard extends Person
{
	//Properties of a Wizard
	private double SpellDmg, Damage;
	private int Magika, MaxMagika, HP, MaxHP, Intelligence, Defense, Level;
	protected String Bio;
	protected int bioLength = 200;
	WearLoc loc;
	
	/**
	* No argument constructor that creates a generic Wizard object
	*/
	public Wizard()
	{
		this.setFirstName("Gandalf");
		this.setLastName("The Grey");
		this.setGender("male");
		this.setAge((byte) 100);
		Magika = 100;
		MaxMagika = 100;
		HP = 150;
		MaxHP = 150;
		Intelligence = 75;
		SpellDmg = .20;
		Defense = 50;
		Damage = Intelligence / SpellDmg;
		Level = 1;
		Bio = "A powerful wizard, with a variety of destruction spells at their disposal.";
		
	}
	
	/**
	 * A constructor that creates a Wizard object with the most common properties set at
	 * construction time
	 * 
	 * @param fN	The first name of the new Wizard object
	 * @param lN	The last name of the new Wizard object
	 * @param sex	The gender of the new Wizard object (valid values are "male", "female", and "unspecified")
	 * @param age	The age in years of the new Wizard object (age must be a positive integer less than 128)
	 * @param bio	The biography of the new Wizard object (must not exceed bioLength)
	 * @throws IllegalArgumentException		Thrown if the passed in Bio exceeds the set biolength
	 */
	public Wizard(String fN, String lN, String sex, Byte age, String bio) throws IllegalArgumentException
	{
		this.setFirstName(fN);
		this.setLastName(lN);
		this.setGender(sex);
		this.setAge(age);
		Magika = 100;
		MaxMagika = 100;
		HP = 150;
		MaxHP = 150;
		Intelligence = 75;
		SpellDmg = .20;
		Defense = 50;
		Level = 1;
		if(bio.length() < bioLength)
		{
			Bio = bio;
		}
		else
		{
			throw new IllegalArgumentException(String.format("Biographies must not exceed the %d character limit.", bioLength));
		}
	}
	
	/**
	 * A method to retrieve the current Magika of this Wizard object
	 * 
	 * @return Magika	The amount of resources the Wizard object can spend on spells
	 */
	public int getMagika()
	{
		return Magika;
	}
	
	/**
	 * A method to retrieve the current MaxMagika of this Wizard object
	 * 
	 * @return MaxMagika	The maximum amount of resources the Wizard object can spend on spells
	 */
	public int getMaxMagika()
	{
		return MaxMagika;
	}
	
	/**
	 * A method to retrieve the current HP of this Wizard object
	 * 
	 * @return HP	The amount of HP or hit points this Wizard object has
	 */
	public int getHP()
	{
		return HP;
	}
	
	/**
	 * A method to retrieve the MaxHP of this Wizard object
	 * 
	 * @return MaxHP	The maximum amount of HP or hit points this Wizard object has
	 */
	public int getMaxHP()
	{
		return MaxHP;
	}
	
	/**
	 * A method to retrieve the Intelligence of this Wizard object
	 * 
	 * @return Intelligence		The amount of Intelligence of the Wizard object
	 */
	public int getIntelligence()
	{
		return Intelligence;
	}
	
	/**
	 * A method to retrieve the SpellDmg of this Wizard object
	 * 
	 * @return SpellDmg		The amount of SpellDmg for this Wizard object
	 */
	public double getSpellDmg()
	{
		return SpellDmg;
	}
	
	/**
	 * A method to retrieve the Damage dealt of this Wizard object
	 * 
	 * @return Damage	The amount of damage done by this Wizard object
	 */
	public double getDamage()
	{
		return Damage;
	}
	
	/**
	 * A method to retrieve the Defense of the Wizard object
	 * 
	 * @return Defense		The amount of defense of this Wizard object
	 */
 	public int getDefense()
	{
		return Defense;
	}
	
	/**
	 * A method to retrieve the LEvel of this Wizard object
	 * 
	 * @return Level	The Level of this Wizard object
	 */
	public int getLevel()
	{
		return Level;
	}
	
	/**
	 * A method to retrieve the Bio of this Wizard object
	 * 
	 * @return Bio	The biography of this Wizard object
	 */
	public String getBio()
	{
		return Bio;
	}
	
	/**
	 * A method to retrieve the bioLength of this Wizard object
	 * 
	 * @return bioLength	This limits the length of the Bio field
	 */
	public int getBioLength()
	{
		return bioLength;
	}
	
	/**
	 * A method to set the current Magika of this Wizard object
	 * 
	 * @param mag	The amount of resources the Wizard object can spend on spells
	 */
	public void setMagika(int mag)
	{
		Magika = mag;
	}
	
	/**
	 * A method to set the current MaxMagika of this Wizard object
	 * 
	 * @param maxMag	The maximum amount of resources the Wizard object can spend on spells
	 */
	public void setMaxMagika(int maxMag)
	{
		MaxMagika = maxMag;
	}
	
	/**
	 * A method to set the current HP of this Wizard object
	 * 
	 * @param hp	The amount of HP or hit points this Wizard object has
	 */
	public void setHP(int hp)
	{
		HP = hp;
	}
	
	/**
	 * A method to set the MaxHP of this Wizard object
	 * 
	 * @param maxHP	The maximum amount of HP or hit points this Wizard object has
	 */
	public void setMaxHP(int maxHP)
	{
		MaxHP = maxHP;
	}
	
	/**
	 * A method to set the Intelligence of this Wizard object
	 * 
	 * @param intel		The amount of Intelligence of the Wizard object
	 */
	public void setIntelligence(int intel)
	{
		Intelligence = intel;
	}
	
	/**
	 * A method to set the SpellDmg of this Wizard object
	 * 
	 * @param spellDmg		The amount of SpellDmg for this Wizard object
	 */
	public void setSpellDmg(double spellDmg)
	{
		SpellDmg = spellDmg;
	}
	
	/**
	 * A method to set the Damage dealt of this Wizard object
	 * 
	 * @param dmg		The amount of damage done by this Wizard object
	 */
	public void setDamage(double dmg)
	{
		Damage = dmg;
	}
	
	/**
	 * A method to set the Defense of the Wizard object
	 * 
	 * @param def	The amount of defense of this Wizard object
	 */
	public void setDefense(int def)
	{
		Defense = def;
	}
	
	/**
	 * A method to set the LEvel of this Wizard object
	 * 
	 * @param lvl	The Level of this Wizard object
	 */
	public void setLevel(int lvl)
	{
		Level = lvl;
	}
	
	/**
	 * A method to set the Bio of this Wizard object
	 * 
	 * @param bio	The biography of this Wizard object
	 * @throws IllegalArgumentException		Thrown if the passed in Bio exceeds the set biolength
	 */
	public void setBio(String bio)
	{
		if(bio.length() < bioLength)
		{
			Bio = bio;
		}
		else
		{
			throw new IllegalArgumentException(String.format("Biographies must not exceed the %d character limit.", bioLength));
		}
	}
	
	/**
	 * A method to set the bioLength of this Wizard object
	 * 
	 * @param bL	This limits the length of the Bio field
	 */
	public void setBioLength(int bL)
	{
		bioLength = bL;
	}
}
