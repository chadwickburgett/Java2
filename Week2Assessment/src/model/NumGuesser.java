package model;
import java.util.Scanner;

public class NumGuesser {
	public int guesser(int num, int guess) {
		Scanner in = new Scanner(System.in);
		int count = 1;
		if (guess == num) {
	    	System.out.println("Great guess! First try too!");
	    }
		while (guess != num){
	    	count ++;
	    	if (guess > num) {
	    		System.out.println("Too high, try again");
	    		guess = in.nextInt();
	    	}
	    	else if (guess < num) {
	    		System.out.println("Too low, try again");
	    		guess = in.nextInt();
	    	}
	    }
		in.close();
		return count;
	}
}
