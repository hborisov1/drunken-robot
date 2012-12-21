package drunkenrobot.miscellaneous;

import java.util.ArrayList;

import drunkenrobot.robots.Robot;

public class Table {

	private ArrayList<Robot> robots = new ArrayList<>();
	private int index;

	public Table(int index) {
		this.index = index;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public ArrayList<Robot> getRobots() {
		return robots;
	}

	public void addRobot(Robot robot){
		robots.add(robot);
	}
	
	public void addRobots(ArrayList<Robot> robots) {
		this.robots = robots;
	}

	public void listen() {

		for(Robot robot : robots){
			System.out.println(robot.getPhrase());
		}
		
	}

}
