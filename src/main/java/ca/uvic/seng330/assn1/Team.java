package ca.uvic.seng330.assn1;

import ca.uvic.seng330.assn1.Player.Position;

import java.util.ArrayList;
import java.util.Collections;
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
	
	// Players for testing
	Player one = new Player("Mike", 322, Position.DEFENDER);
	Player two = new Player("Maxi", 123, Position.GOALIE);
		
	public Team(/*String pTeamName*/)
	{
//		this.aTeamName = pTeamName;
		this.aTeamName = "Penguins";
		aTeam = new ArrayList<Player>();
		addPlayers(one);
		addPlayers(two);
		
//		System.out.println(aTeam); // Prints out player on the team in an array [PlayerOne, PlayerTwo, ...]
	}
	
	/**
	 * Use ArrayList method (.add) to add players to the team
	 * @param aPlayer
	 */
	private void addPlayers(Player aPlayer)
	{
		aTeam.add(aPlayer);
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
		return "NAME: " + aTeamName;
	}
	

	@Override
	public int compareTo(Team o) 
	{
		// TODO Auto-generated method stub
		return 0;
	}
	
}
