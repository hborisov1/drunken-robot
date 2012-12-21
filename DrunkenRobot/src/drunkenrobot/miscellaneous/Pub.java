package drunkenrobot.miscellaneous;

import java.util.ArrayList;

public class Pub {

	private ArrayList<Table> tables = new ArrayList<>();

	public ArrayList<Table> getTables() {
		return tables;
	}

	public Table getTablesByIndex(int index) {
		return tables.get(index);
	}
//master change
	public void addTables(int numberTables) {
		for (int i = 1; i <= numberTables; i++) {
			tables.add(new Table(i));
		}
	}

}
