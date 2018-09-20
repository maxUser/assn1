package ca.uvic.seng330.assn1;

import java.util.ArrayList;
//import java.util.Iterator;
//import java.util.Collections;
import java.util.List;
//import java.util.stream.Stream;


/**
 * a Team holds a List of Players and Managers.
 * a Team holds the number of players and the team name.
 * @author Karan Tongay (karantongay@uvic.ca)
 * @author Andreas Koenzen 
 *
 */
public class Team implements Comparable<Team> 
{
	
	private List<Player> aTeam;
	private String aTeamName;
	

	public Team(String pTeamName)
	{
		this.aTeamName = pTeamName;
		aTeam = new ArrayList<Player>();
	}
	

	public void addPlayer(Player aPlayer)
	{
		aTeam.add(aPlayer);
	}
	
	/**
	 * Sums the points of all players and returns as integer
	 * @return total points of all players
	 */
	public int getPoints()
	{
		int teamPoints = 0;
		
		for(Player aPlayer : aTeam)
		{
			teamPoints += aPlayer.getPoints();
		}
		
//		System.out.println(teamPoints);
		return teamPoints;
	}

	/**
	 * Print out all players on the team
	 */
	public void printRoster()
	{
		for(Player aPlayer : aTeam)
		{
			System.out.println(aPlayer.getName() + aPlayer.getPosition() + aPlayer.getPoints());
		}
	
	}
	
	public void teamSize()
	{
		System.out.println(aTeam.size());
	}
	
	public void teamName()
	{
		System.out.println(aTeamName);
	}
	
	public String toString()
	{
		return aTeamName + " have " + this.getPoints() + " points";
	}
	

	@Override
	public int compareTo(Team o) 
	{
		// TODO Auto-generated method stub
		if(this.getPoints() > o.getPoints())
		{
			return 1;
		} 
		else if(this.getPoints() > o.getPoints())
		{
			return -1;
		}
		else 
		{
			return 0;
		}
	}

	
}
