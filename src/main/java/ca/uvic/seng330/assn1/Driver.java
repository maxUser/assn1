package ca.uvic.seng330.assn1;


//import java.util.Iterator;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Collections;

/**
 * Entry point.
 * 
 * @author Andreas Koenzen <akoenzen@uvic.ca>
 */
public final class Driver {


    /**
     * Main method.
     */
	public static void main(String[] args) {
		//there is nothing here ... but you might 
		// use this for simple testing on the console.
//		Team t = new Team(...);
		// Print everything.
//		System.out.println(team);
		
		// Creating a single player
//		Position one = Position.CENTRE;
		Player playerOne = new Player("Max", 123, Position.GOALTENDER);
		Player playerTwo = new Player("Max", 1, Position.GOALTENDER);
		Player playerThree = new Player("Max", 6, Position.GOALTENDER);
//		System.out.println(playerOne.getPosition());
		
		// Creating a team
		Team bTeam = new Team("Oilers");
		bTeam.addPlayer(playerOne);
		bTeam.addPlayer(playerTwo);
		bTeam.addPlayer(playerThree);
 
		System.out.println(bTeam.getPoints());


		
	  
	}
}