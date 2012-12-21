package drunkenrobot;

import drunkenrobot.miscellaneous.Alcohol;
import drunkenrobot.miscellaneous.Pub;
import drunkenrobot.robots.Robot;

public class MainApp {

	public static void main(String[] args) {

		Pub pub = new Pub(4);
		Robot voltron = new Robot("Voltron");
		Robot powerRobot = new Robot("PowerRobot");
		
		Alcohol bendersAlcohol = new Alcohol("Beer", "Ariana", 5);

		pub.getTablesByIndex(1).addRobot(voltron);
		voltron.setAlcohol(bendersAlcohol);
		voltron.setPhrase("I will pull my light sword and cut your head");
		pub.getTablesByIndex(1).listen();
		
		
	}

}
