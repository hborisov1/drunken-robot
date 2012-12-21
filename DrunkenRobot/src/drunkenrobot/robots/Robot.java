package drunkenrobot.robots;

import drunkenrobot.miscellaneous.Alcohol;

public class Robot {

	
	private Alcohol alcohol;
	private String phrase;
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Robot(String name, Alcohol alcohol, String phrase) {
		this.name = name;
		this.alcohol = alcohol;
		this.phrase = phrase;
	}

	public Alcohol getAlcohol() {
		return alcohol;
	}

	public void setAlcohol(Alcohol alcohol) {
		this.alcohol = alcohol;
	}

	public String getPhrase() {
		return phrase;
	}

	public void setPhrase(String phrase) {
		this.phrase = phrase;
	}
	
	
}
