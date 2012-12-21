package drunkenrobot;

import drunkenrobot.miscellaneous.Alcohol;
import drunkenrobot.miscellaneous.Pub;
import drunkenrobot.robots.Robot;

public class MainApp {

	public static void main(String[] args) {

		Pub pub = new Pub(4);
		Robot bender = new Robot("Bender");
		pub.getTablesByIndex(1).addRobot(bender);
		Alcohol bendersAlcohol = new Alcohol("Beer", "Ariana", 5);
		bender.setAlcohol(bendersAlcohol);
		bender.setPhrase("Bitcheeeees");
		pub.getTablesByIndex(1).listen();
	}

}
