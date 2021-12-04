package mathgame;

public class Game {
	
	//Create a controller object
	private int answer, correct, incorrect, numberOfQuestions;
	private double number;
	
	
	public int getAnswer() {
		return answer;
	}

	public void setAnswer(int answer) {
		this.answer = answer;
	}

	public int getCorrect() {
		return correct;
	}

	public void setCorrect(int correct) {
		this.correct = correct;
	}

	public int getIncorrect() {
		return incorrect;
	}

	public void setIncorrect(int incorrect) {
		this.incorrect = incorrect;
	}

	public int getNumberOfQuestions() {
		return numberOfQuestions;
	}

	public void setNumberOfQuestions(int numberOfQuestions) {
		this.numberOfQuestions = numberOfQuestions;
	}

	public double getNumber() {
		return number;
	}

	public void setNumber(double number) {
		this.number = number;
	}



	//Method that takes in user input and math problem
    public int problem(int guess, Problem problem) {
    	
    
    	//Calls the getAnswer method in problem and assigns to variable
    	int answer = problem.getAnswer();

    	//Test to give the user at least 2 attempts to answer the question.
    	
    	if( guess != answer) {
        	
    		System.out.println("incorrect, the answer should be: " + answer);
 
    		return answer;
    	}
    	
    	//Print correct, and return number of correct. 
    	System.out.println("correct");
    	correct++;
    	return correct;
	

    }
    
    public double numberCorrect(double numberOfQuestions) {
    	double number = numberOfQuestions;
    	return number;
    }
    
    
    public double percentCorrect() {
    	double answerCorrect = 0.0;
    	try {
    		answerCorrect = correct * 100.0/(double)numberOfQuestions;
    	} catch(Exception e) {
    		System.out.println("Exception Occurred. Returning the default percentage 0.0.");
    		answerCorrect = 0.0;
    	}
    	 
    	return answerCorrect;
    }
    
}

