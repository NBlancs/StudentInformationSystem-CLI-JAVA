# Author: NBlancs
# StudentInformationSystem-CLI-JAVA
- A CLI Student Information System utilizing arrays with complete CRUD system.

# You can further improve this code by putting a class instead in the arraylist.

// For Example
// Create a separate class for this

public class ArrayListStudents {
	// Put the data you want gathered here (You can add more if you life)
	
	String name; 			// Student name
	String gender; 			// Student gender
	int age; 				// Student age
	int id;  				// Student ID
	int year_level; 		// Student Year Level
	String course; 			// Student course
	
	// Method to put the data types
	ArrayListStudents(String name, String gender, int age, int id, int year_level,String course){
	// Initialize the data types
		
	this.name = name;
	this.gender = gender;
	this.age = age;
	this.id = id;
	this.year_level = year_level;
	this.course = course;
	}
}

// You then initialize the arraylist by doing this

import import java.util.ArrayList;

public class Main {
  public satic void main (String[]args){
  
  		ArrayList<ArrayListStudents> students = new ArrayList<>();
      // The order was (Name, Gender, Age, ID, Year Level, and Student Course)
      students.add(new ArrayListStudents("Noel","Male",20,02230000,2,"BSIT"));

  }
}
