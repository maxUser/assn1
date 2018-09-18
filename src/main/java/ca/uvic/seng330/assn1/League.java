package ca.uvic.seng330.assn1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class League implements Iterable<Team> {
	
	
	private List<Team> aLeague;
	private String aLeagueName;
	
	
	/**
	 * League constructor
	 * @param pLeagueName: String representation of the league name
	 */
	public League(String pLeagueName)
	{
		this.aLeagueName = pLeagueName;
		aLeague = new ArrayList<Team>();
	}
	
	public void addTeam(Team aTeam)
	{
		aLeague.add(aTeam);
	}
	
	public String toString()
	{
		return "LEAGUE NAME: " + aLeagueName;
	}

	@Override
	public Iterator<Team> iterator() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
