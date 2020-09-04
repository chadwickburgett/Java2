package model;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestMessage2 {

	int num = 7;
	int guess = 7;
	int message = 1;
	NumGuesser userGuess = new NumGuesser();

	
	@Before
	public void setUp() throws Exception {

	}

	@Test
	public void test() {
	      System.out.println("Inside testPrintMessage()");    
	      assertTrue(message == userGuess.guesser(num, guess));     

	}
	
	@Test
	public void test2() {
	      System.out.println("Inside testPrintMessage2()");    
	      assertFalse(message != userGuess.guesser(num, guess));     

	}

}
