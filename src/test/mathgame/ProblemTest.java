package mathgame;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

public class ProblemTest {
	
	private Problem problem;
	
	@Test
	public void testGetProblemAddition() {
		String mathType = "addition";
		problem = new Problem(mathType);
		
		String question = problem.getProblem();
		assertNotNull(question);
		assertTrue(question.contains("+"));
		assertFalse(question.contains("-"));
		assertFalse(question.contains("*"));
		assertFalse(question.contains("/"));
	}
	
	@Test
	public void testGetProblemSubtraction() {
		String mathType = "subtraction";
		problem = new Problem(mathType);
		
		String question = problem.getProblem();
		assertNotNull(question);
		assertTrue(question.contains("-"));
		assertFalse(question.contains("+"));
		assertFalse(question.contains("*"));
		assertFalse(question.contains("/"));
	}
	
	@Test
	public void testGetProblemMultiplication() {
		String mathType = "multiplication";
		problem = new Problem(mathType);
		
		String question = problem.getProblem();
		assertNotNull(question);
		assertTrue(question.contains("*"));
		assertFalse(question.contains("+"));
		assertFalse(question.contains("-"));
		assertFalse(question.contains("/"));
	}
	
	@Test
	public void testGetProblemDivision() {
		String mathType = "division";
		problem = new Problem(mathType);
		
		String question = problem.getProblem();
		assertNotNull(question);
		assertTrue(question.contains("/"));
		assertFalse(question.contains("+"));
		assertFalse(question.contains("-"));
		assertFalse(question.contains("*"));
	}
	
	@Test
	public void testGetProblemSomethingElse_1() {
		String mathType = "something_else";
		problem = new Problem(mathType);
		
		String question = problem.getProblem();
		assertNotNull(question);
		assertTrue(question.contains("+"));
		assertFalse(question.contains("-"));
		assertFalse(question.contains("*"));
		assertFalse(question.contains("/"));
	}
	
	@Test
	public void testGetProblemSomethingElse_2() {
		String mathType = "hello";
		problem = new Problem(mathType);
		
		String question = problem.getProblem();
		assertNotNull(question);
		assertTrue(question.contains("+"));
		assertFalse(question.contains("-"));
		assertFalse(question.contains("*"));
		assertFalse(question.contains("/"));
	}
	
	@Test
	public void testGetProblemSomethingElse_3() {
		String mathType = "5353";
		problem = new Problem(mathType);
		
		String question = problem.getProblem();
		assertNotNull(question);
		assertTrue(question.contains("+"));
		assertFalse(question.contains("-"));
		assertFalse(question.contains("*"));
		assertFalse(question.contains("/"));
	}
}
