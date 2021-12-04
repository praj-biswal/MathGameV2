package mathgame;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class GameTest {
	
	private Game game;
	
	@Test
	public void testPercentCorrect1() {
		game = new Game();
		game.setCorrect(2);
		game.setNumberOfQuestions(4);
		double percentCorrect = 50.0;
		assertTrue(game.percentCorrect() == percentCorrect);
	}
	
	@Test
	public void testPercentCorrect2() {
		game = new Game();
		game.setCorrect(2);
		game.setNumberOfQuestions(3);
		String percentCorrect = "66.66";
		assertTrue(String.valueOf(game.percentCorrect()).startsWith(percentCorrect));
	}	
	
	@Test
	public void testPercentCorrect3() {
		game = new Game();
		game.setCorrect(0);
		game.setNumberOfQuestions(3);
		double percentCorrect = 0.0;
		assertTrue(game.percentCorrect() == percentCorrect);
	}
	
}
