package model;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestMessage1 {

	String name = "Robert";
	String message = "Hello " + name + "!";
	Greeting greeter = new Greeting();

	
	@Before
	public void setUp() throws Exception {

	}

	@Test
	public void test() {
	      System.out.println("Inside testPrintMessage()");    
	      assertEquals(message, greeter.sayHello(name));     

	}


}
