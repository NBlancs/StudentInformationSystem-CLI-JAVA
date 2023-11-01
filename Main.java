import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;

public class Main {
	
	public static void mainMenu() {
		System.out.println("======== STUDENT INFORMATION SYSTEM ========\n");
		System.out.println("* PRESS 1 TO ADD STUDENT (Add in order: Name, Gender, Course, Year level, Age, and Student ID)");
		System.out.println("* PRESS 2 TO SEARCH FOR STUDENT");
		System.out.println("* PRESS 3 TO UPDATE STUDENT INFORMATION");
		System.out.println("* PRESS 4 TO REMOVE STUDENT");
		System.out.println("* PRESS 5 TO EXIT");
		System.out.println("\n============================================\n");
	}

	public static void main(String[] args) {
		ArrayList<ArrayList<String>> students = new ArrayList<>(); // Collection of ArrayLists
		Scanner scanner = new Scanner(System.in);
		
		
		int age = 0;
		
		System.out.println(age);
		
		while (true) {
			mainMenu();
			
			try {
				System.out.print("PLEASE TYPE HERE: ");
				int input = scanner.nextInt();
				
				if (input == 1) {
					// Add a student
					ArrayList<String> studentInfo = new ArrayList<>();

					System.out.println("Add the user in this format (Name, Gender, Age, Course, Year Level, and Student I.D)");
					System.out.println("e.g: Noel, Male, 20, BSIT, 2nd Year, 02230000");
					System.out.println("========== TYPE 1 TO GO TO MAIN MENU =========\n");
					System.out.print("Input here: ");
					scanner.nextLine();
					
					String userData = scanner.nextLine();
					studentInfo.add(userData);
					students.add(studentInfo);
				} else if (input == 2) {
					// Search for a student
				 System.out.println("Enter the student number to search (0-based index): ");
				 int studentNumber = scanner.nextInt();
				 if (studentNumber >= 0 && studentNumber < students.size()) {
				     System.out.println(students.get(studentNumber));
				 } else {
				     System.out.println("Invalid student number.");
				 }
				} else if (input == 3) {
					// Update student information
				    System.out.println("Enter the student number to update (0-based index): ");
				    int studentNumber = scanner.nextInt();
				    if (studentNumber >= 0 && studentNumber < students.size()) {
				        // Get the student's current information
				        ArrayList<String> studentInfo = students.get(studentNumber);
				        System.out.println("Enter updated information in the same format as when adding a student.");
				        System.out.print("Input here: ");
				        scanner.nextLine();

				        String updatedUserData = scanner.nextLine();
				        
				        // Update the student's information in the ArrayList
				        students.set(studentNumber, new ArrayList<>(Arrays.asList(updatedUserData.split(", "))));
				        
				        System.out.println("Student information updated successfully.");
				    } else {
				        System.out.println("Invalid student number.");
				    }
					
				} else if (input == 4) {
				    // Remove a student
				    System.out.println("Enter the student number to remove (0-based index): ");
				    int studentNumber = scanner.nextInt();

				    if (studentNumber >= 0 && studentNumber < students.size()) {
				        // Remove the student at the specified index
				        students.remove(studentNumber);
				        System.out.println("Student removed successfully.");
				    } else {
				        System.out.println("Invalid student number.");
				    }
					
				} else if (input == 5) {
					// Exit the program
					System.out.println("\n\n=============PROGRAM TERMINATED=============");
					break;
				} else {
					System.out.println("PLEASE ENTER A NUMBER FROM 1-5 ONLY");
				}
			} catch (InputMismatchException e) {
				System.out.println("PLEASE TYPE INTEGER ONLY");
				scanner.nextLine(); // Consume the invalid input
			}
		}
		scanner.close();
	}
}
