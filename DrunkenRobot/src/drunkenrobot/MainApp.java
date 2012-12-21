package drunkenrobot;

import java.util.ArrayList;

import drunkenrobot.miscellaneous.Alcohol;
import drunkenrobot.miscellaneous.Pub;
import drunkenrobot.miscellaneous.Table;
import drunkenrobot.robots.Robot;

public class MainApp {

	public static void main(String[] args) {

		Pub robotPub = new Pub();
		robotPub.addTables(6);
		
		ArrayList<Robot> robots = new ArrayList<>();

		Alcohol bendersBeer = new Alcohol("Beer", "Zagorka", 5);
		Robot bender = new Robot("Bender", bendersBeer, "I'll bend you, when I am drunkkk$@");
		robots.add(bender);

		Alcohol johnatansWhiskey = new Alcohol("Whiskey", "JB", 40);
		Robot johnatan = new Robot("Johnatan", johnatansWhiskey, "I lofff youuuu");
		robots.add(johnatan);
		
		Table table1 = robotPub.getTablesByIndex(3);
		table1.setRobots(robots);
		table1.listen();
	}

}
