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
	

	public int getPoints()
	{
		return aPoints;
	}
	

	public Position getPosition()
	{
		return aPosition;
	}
	

	public String getName()
	{
		return aName;
	}
	

	public String toString()
	{
		return "NAME: " + aName  + " POINTS: " + aPoints + " POSITION: " + aPosition;
	}
}
