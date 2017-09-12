import java.util.Scanner;

public class RockPaperScissors {

	public static void main(String[] args) {
		
		//welcome the user and explain the rules
		System.out.println("Welcome to Rock, Paper, Scissors!");
		System.out.println("The rules are: 0 for rock, 1 for paper, 2 for"
				+ " scissors");
		System.out.println("First to 10 wins. Let's play!");
		
		//declare starting scores for both computer and human
		int human = 0;
		int comp = 0;
		
		Scanner scan = new Scanner(System.in);
		
		//set while loop to continue until either human or comp reaches 10 wins
		while (human < 10 && comp < 10) {
			
			//prompt the user to pick rock, paper, or scissors
			System.out.println("Enter a choice (0, 1, or 2): ");
			int choice = scan.nextInt();
			//generate a random integer between 0 and 2 for the comp choice
			int compChoice = (int) (Math.random() * 3);
			
			//set if/else statements to tell the user who won the round, change
			//the score accordingly, and display the current score
			if (choice == 0 && compChoice == 1) {
				
				System.out.println("Computer picks "+ compChoice);
				System.out.println("Hah, gotcha!");
				comp++;
				System.out.println("Score: Human " + human + " - " + comp 
						+ " Computer");
				
			} else if (choice == 0 && compChoice == 2) {
				
				System.out.println("Computer picks "+ compChoice);
				System.out.println("You win this round...");
				human++;
				System.out.println("Score: Human " + human + " - " + comp 
						+ " Computer");
				
			} else if (choice == 1 && compChoice == 0) {
				
				System.out.println("Computer picks "+ compChoice);
				System.out.println("You win this round...");
				human++;
				System.out.println("Score: Human " + human + " - " + comp 
						+ " Computer");
				
			} else if (choice == 1 && compChoice == 2) {
				
				System.out.println("Computer picks "+ compChoice);
				System.out.println("Hah, gotcha!");
				comp++;
				System.out.println("Score: Human " + human + " - " + comp 
						+ " Computer");
				
			} else if (choice == 2 && compChoice == 0) {
				
				System.out.println("Computer picks "+ compChoice);
				System.out.println("Hah, gotcha!");
				comp++;
				System.out.println("Score: Human " + human + " - " + comp 
						+ " Computer");
				
			} else if (choice == 2 && compChoice == 1) {
				
				System.out.println("Computer picks "+ compChoice);
				System.out.println("You win this round...");
				human++;
				System.out.println("Score: Human " + human + " - " + comp 
						+ " Computer");
				
			//if the round is a tie, leave score unchanged and tell the user
			} else if (choice == compChoice) {
				
				System.out.println("Computer picks "+ compChoice);
				System.out.println("That's a tie.");
				System.out.println("Score: Human " + human + " - " + comp 
						+ " Computer");
			
			//if user chooses anything that isn't 0, 1, or 2, leave the score
			//unchanged and put user back on track
			} else {
				
				System.out.println("I'm sorry, something went wrong. "
						+ "Try entering 0, 1, or 2.");
				System.out.println("Score: Human " + human + " - " + comp 
						+ " Computer");
			}
		}
		//if user won, congratulate him/her
		if (human == 10) {
			System.out.println("Congratulations, you win!");
		//if computer won, execute banter
		} else {
			System.out.println("Looks like you lost to an amateur program "
					+ "written by a student. Bummer.");
		}
		//print final score
		System.out.println("Final score: Human " + human + " - " + comp 
				+ " Computer");

	}

}
