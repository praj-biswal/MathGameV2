package mathgame;

import java.util.Scanner;

public class Controller {

	Game game;
	static GUI gui;
	Scanner input;
	Controller controller;
	Problem problem;
	GradeLevel grade;
	
	void myMain() {
		game = new Game();
		gui = new GUI();
		input = new Scanner(System.in);
		grade = new GradeLevel();
		
		System.out.println("What type of math problem would you like to solve?");
		System.out.println("Enter addition, subtraction, multiplication, division or random:");
		String mathType = input.next();
		problem = new Problem(mathType);
		
		System.out.println("How many questions would you like?");
		int numberOfQuestions = 0;
		try {
			numberOfQuestions = input.nextInt();
		} catch(Exception e) {
			System.out.println("Invalid entry. System will exit.");
			System.exit(1);
		}
		
		// safeguarding the system for zero or negative value of numberOfQuestions
		if( numberOfQuestions == 0) {
			System.out.println("You entered 0. System will exit.");
			System.exit(1);
		} else if (numberOfQuestions < 0) {
			numberOfQuestions = Math.abs(numberOfQuestions);
		}
		
		game.setNumberOfQuestions(numberOfQuestions);
		
		for(int i = 0; i < numberOfQuestions; i ++) {
			
			System.out.println("\nQuestion number: " + (i+1));
			System.out.println("-------------------");
			gui.displayProblem(problem);
			
			System.out.println("Enter your answer?");
		    int response = input.nextInt();

		    game.problem(response, problem);
		}
			
			//System.out.println(game.percentCorrect());
			//Displays percentage correct
			gui.displayResponseToStudent(game,grade);
	}
	
	
	public static void main(String args[]) {
		Controller controller = new Controller();
		controller.myMain();
	}
}
