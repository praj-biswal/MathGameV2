package mathgame;

public class GUI {
	
	private double result,percent;
	
	GradeLevel Query_the_grade_level() {
		GradeLevel retVal = null;
		
		return retVal;
	}
	
	
	public void displayResponseToStudent(Game game, GradeLevel grade) {
		
	//	double numberQuestions = game.getNumberOfQuestions();
	//	double numberCorrect = game.percentCorrect();
	//	double result = ((numberCorrect / numberQuestions) * 100);
		
	//	System.out.printf("Percentage correct: %.2f %s",result,"%");
		result = game.percentCorrect();
		System.out.printf("Percentage correct: %.2f %s",result,"%");
		
		percent = grade.grade(result);
		
	}
	
	
	public void displayProblem(Problem problem) {
		

		String question = problem.getProblem();
		
		System.out.println(question);
	}
	
}
