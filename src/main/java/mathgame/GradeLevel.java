package mathgame;

public class GradeLevel {

	 
	 public double grade(double correct) {
		 
		 double score = correct;
		 
		 if (score >= 90) {
			 System.out.println("\nYour grade is an A!");
			 return score;
		 }
		 else if (score >= 80) {
			 System.out.println("\nYour grade is a B!");
			 return score;

		 }
		 else if (score >= 70) {
			 System.out.println("\nYour grade is an C!");
			 return score;

		 }
		 else if (score >= 60) {
			 System.out.println("\nYour grade is a D!");
			 return score;

		 }
		 else 
			 System.out.println("\nYour grade is a F!");
		return score;

	 }
}
