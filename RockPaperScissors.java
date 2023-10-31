// Simple Rock Paper Scissors Game

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to my simple Rock Paper Scissors game!");

        int userWins = 0;
        int computerWins = 0;
        int draws = 0;
        
        while (true) {
            String[] rps = {"rock", "paper", "scissors"};
            String computerPick = rps[new Random().nextInt(rps.length)];
            String userPick;
        
            while (true) {
                System.out.println("Pick a move to play: ");
                userPick = scanner.nextLine().toLowerCase();
                if (userPick.equals("rock") || userPick.equals("paper") || userPick.equals("scissors")) {
                    break;
                }
                System.out.println("Please enter a valid move.");
            }

            System.out.println("Computer picked " + computerPick);

            if (userPick.equals(computerPick)) {
                System.out.println("Its a draw.");
                draws++;
            }

            if (userPick.equals("rock")) {
                if (computerPick.equals("scissors")) {
                    System.out.println("You won!");
                    userWins++;

                } else if (computerPick.equals("paper")) {
                    System.out.println("You lost.");
                    computerWins++;
                }
            }

            else if (userPick.equals("paper")) {
                if (computerPick.equals("rock")) {
                    System.out.println("You won!");
                    userWins++;

                } else if (computerPick.equals("scissors")) {
                    System.out.println("You lost.");
                    computerWins++;
                }
            }

            else if (userPick.equals("scissors")) {
                if (computerPick.equals("paper")) {
                    System.out.println("You won!");
                    userWins++;

                } else if (computerPick.equals("rock")) {
                    System.out.println("You lost.");
                    computerWins++;
                }
            } 

            System.out.println("Play again?");
            String playAgain = scanner.nextLine().toLowerCase();

            if (!playAgain.equals("yes")) {
                System.out.println("User score: " + userWins + " Computer score: " + computerWins + " Draws: " + draws);
                System.out.println("Thank you for playing!");
                break;
            }
        }
    }
}
