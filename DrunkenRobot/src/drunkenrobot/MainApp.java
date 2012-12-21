package drunkenrobot;

import drunkenrobot.miscellaneous.Alcohol;
import drunkenrobot.miscellaneous.Pub;
import drunkenrobot.robots.Robot;

public class MainApp {

	public static void main(String[] args) {

		Pub pub = new Pub(4);
		
		Robot voltron = new Robot("Voltron");
		Robot powerRobot = new Robot("PowerRobot");
		
		Alcohol voltronsAlcohol = new Alcohol("Beer", "Ariana", 5);
		Alcohol powerRobotsAlcohol = new Alcohol("Whiskey", "Johney Walker", 40.2);

		pub.getTablesByIndex(1).addRobot(voltron);
		pub.getTablesByIndex(1).addRobot(powerRobot);
		
		voltron.setAlcohol(voltronsAlcohol);
		voltron.setPhrase("I will pull my light sword and cut your head");
		
		powerRobot.setAlcohol(powerRobotsAlcohol);
		powerRobot.setPhrase("‘ÛˆÍ you, voltron");
		
		pub.getTablesByIndex(1).listen();
		
		
	}

}
