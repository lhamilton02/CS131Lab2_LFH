
/**
 * This class represents a wizard for
 * a D&D type game.
 * @author rkelley
 * @version 1.0
 * Lab 2
 * CS131ON
 *
 */
public class Wizard implements Lockable
{
	
	private String name;
	private int health;
	private int key;
	private boolean locked;
	
	/**
	 * End constructor to put object into consistent state
	 */
	public Wizard() 
	{
		this.name = "unknown";
		this.health = 100;
		this.key = 0;
		this.locked = false;
			
	
	}//end constructor
	
	/**
	 * Constructor to create object with common
	 * usage. This is the preferred constructor.
	 * @param name
	 */
	
	public Wizard(String name) 
	{
		this.name = name;
		this.health = health;
		this.key = key;
		this.locked = locked;

	}//end constructor
	
	/**
	 * This method processes the 
	 * damage to the object when 
	 * it is hit by other objects
	 * (e.g. weapons, lightening, etc.)
	 * @param power
	 */
	public void takeDamage(int power)
	{
		if (!locked)
		{
			this.health -= power;
			if (this.health < 0)
			{
				this.health = 0;
			}
		}
	}//end takeDamage
	
	/**
	 * Getter for name
	 * @return
	 */
	
	
	public String getName() 
	{
		return name;
	}//end getName
	
	/**
	 * Setter for name
	 * @param name
	 */
	public void setName(String name) {
	
	}//end setName
	
	/**
	 * Getter for health
	 * @return
	 */
	public int getHealth() 
	{
		return health;
	}//end getHealth
	
	/**
	 * Setter for health
	 * @param health
	 */
	public void setHealth(int health) 
	{
		this.health = health;
	}//end setHealth
	
	/**
	 * Getter for the key
	 * @return
	 */
	public int getKey() {
		return key;
	}//end getKey
	
	
	/**
	 * Setter for the key
	 * @param key
	 */
	
	public void setKey(int key)
	{
		if (key > 0 && this.key ==0)
		{
			this.key = key;
		}
	}//end setKey
	
	/**
	 * Check if object is locked
	 * @return true if locked, false if not
	 */
	
	public boolean isLocked()
	{
		return locked;
	}//end isLocked
	
	/**
	 * locl object with the key
	 * @param key to lock the object
	 */
	public void lock(int key)
	{
		if (this.key == key)
		{
			this.locked = true;
		}
	}//end lock
	
	/**
	 * unlock object with key
	 * @param key to unlock
	 */
	public void unlock(int key)
	{
		if (this.key == key)
		{
			this.locked = false;
		}
	}//end unlock
	
	@Override
	public String toString() {
		return "Wizard [name=" + name + ", health=" + health + ", key=" + key + ", locked=" + locked + "]";
	}//end toString
	
}//end class
