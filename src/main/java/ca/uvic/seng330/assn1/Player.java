package ca.uvic.seng330.assn1;

/**
 * A Player belongs to a team.
 *
 */
public class Player {
	
	private String aName;
	private int aPoints; // goal or assist
	private Position aPosition;
	
	
	public Player(String pName, int pPoints, Position pPosition)
	{
		this.aName = pName;
		this.aPoints = pPoints;
		aPosition = pPosition;
	}
	
	/**
	 * @return Amount of points a player has accumulated as an integer
	 */
	public int getPoints()
	{
		return aPoints;
	}
	
	/**
	 * NOT REQUIRED
	 * @return Position that the players takes on the ice as enum
	 */
	public Position getPosition()
	{
		return aPosition;
	}
	
	/**
	 * @return Name of the player as a string
	 */
	public String getName()
	{
		return aName;
	}
	
	/**
	 * @return String representation of Player object
	 */
	public String toString()
	{
		return "NAME: " + aName  + " POINTS: " + aPoints + " POSITION: " + aPosition;
	}
}
