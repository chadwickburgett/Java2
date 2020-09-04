package model;
import org.joda.time.LocalTime;
import java.util.Scanner;
import java.lang.Math;

/*
 * Author Chadwick Burgett
 * purpose to show a few different methods and classes with maven and a test suite.
 */
public class HelloWorldAdvanced {
	public static void main(String[] args) {
	    LocalTime currentTime = new LocalTime();
	    Scanner in = new Scanner(System.in);
	    int min = 1;  
	    int max = 10;
	    int num = (int)(Math.random()*(max-min+1)+min);
	    int count = 0;
	    
	    System.out.println("The current local time is: " + currentTime);
	    
	    System.out.print("What is your name? ");
		String name = in.next();
		in.nextLine();
	    Greeting greeter = new Greeting();
	    System.out.println(greeter.sayHello(name));
	    
	    System.out.println("Pick a number between 1-10 ");
	    int guess = in.nextInt();
	    
	    NumGuesser userGuess = new NumGuesser();
	    count = userGuess.guesser(num, guess);
	    if (count != 1) {
	    	System.out.println("Great guess! You got it on try number " + count + ".");
	    }
	    	    
	    in.close();
	  }
}
