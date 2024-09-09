package gitlearning;

import java.util.Scanner;

public class GitStudy {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your mood details as happy or sad");
		String mood= s.next();
		if(mood.contentEquals("happy")) {
		System.out.println("Learning Git Throughly");
	}
		else if(mood.contentEquals("sad")) {
			System.out.println("shutUP");
			System.out.println("Fool");
			System.out.println("harami sala");
		}
		else {
			System.out.println("You have entered wrong input, rerun the application");
		}
	}

}
