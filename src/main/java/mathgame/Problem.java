package mathgame;

import java.util.Random;

public class Problem {


	//Create new random number generator
	private final static Random rand = new Random();
	private int num1, num2, answer;
	private String mathtype;
	

	public void setAnswer(int answer) {
		this.answer = answer;
	}



	public int getNum1() {
		return num1;
	}



	public void setNum1(int num1) {
		this.num1 = num1;
	}



	public int getNum2() {
		return num2;
	}



	public void setNum2(int num2) {
		this.num2 = num2;
	}



	public Random getRand() {
		return rand;
	}



	//Constructor for the problems
	public Problem(String mathtype) {
		this.mathtype = mathtype;

	}


	public String getProblem() {
		
		switch(mathtype) {
		case "addition": return addition();
		
		case "subtraction": return subtraction();
		
		case "multiplication": return multiplication();
		
		case "division": return division();
		
		case "random": return random();
		default: 
			return addition();
		}
	}
	
	public String addition() {
		
		int num1 = (1 + rand.nextInt(9));
		int num2 = (1 + rand.nextInt(9));
		
		
		String question = "What is: " + num1+ " + " +num2;
		
		answer = num1 + num2;
		
		
		return question ;
	}
	
	public String subtraction() {
		
		int num1 = (1 + rand.nextInt(9));
		int num2 = (1 + rand.nextInt(9));
		
		
		if (num2 > num1) {
			
			int temp = num1;
			num1 = num2;
			num2 = temp;
			
			answer = num1 - num2;
		}
		
		String question = "What is: " + num1+ " - " +num2;
	
		
		answer = num1 - num2;
		
		return question ;
	}
	
	public String multiplication() {
		
		int num1 = (1 + rand.nextInt(9));
		int num2 = (1 + rand.nextInt(9));
		
		String question = "What is: " + num1+ " * " +num2;
		
		answer = num1 * num2;
		
		
		return question;
	}
	
	public String division() {
		
		double num1 = (1 + rand.nextInt(9));
		double num2 = (1 + rand.nextInt(9));
		
		
		if (num2 > num1) {
			double temp = num1;
			num1 = num2;
			num2 = temp;
			
			try {
				answer = (int) (num1 / num2);
			} catch(Exception e) {
				System.out.println("Exception occurred. System will exit.");
				System.exit(1);
			}
			
		}
		
		String question = "What is: " + num1+ " / " +num2;
		
	
		try {
			answer = (int) (num1 / num2);
		} catch(Exception e) {
			System.out.println("Exception occurred. System will exit.");
			System.exit(1);
		}
		
		
		return question;
	}
	
	public String random() {
		int value = ( 1 + rand.nextInt(4));
		
		switch(value) {
		
		case 1: return addition();
		case 2: return subtraction();
		case 3: return multiplication();
		case 4: return division();
		
		default: return addition();
		}

	}



	public int getAnswer() {
		
		return answer;
	}
}
