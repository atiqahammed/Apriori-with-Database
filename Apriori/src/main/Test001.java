package main;

import database_sqlite.DatabaseTest;

public class Test001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DatabaseTest test = new DatabaseTest();
		//test.createNewDatabase();

		//test.createNewTable();
		//test.insert("Atiq", 0.0);
		//test.selectAll();



		//test.createNewTableOfAP();
		//test.insertIntoApTable("pen note_book");
		test.selectAllFromApTable();

	}

}
