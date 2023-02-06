import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String playAgain = "y";

        while (playAgain.equals("y")) {
            int computerChoice = (int) (Math.random() * 3) + 1;
            int playerChoice = 0;

            System.out.println("Rock-Paper-Scissors");
            System.out.print("Enter 1 for rock, 2 for paper, or 3 for scissors: ");
            playerChoice = scan.nextInt();

            if (playerChoice == 1 && computerChoice == 3 ||
                    playerChoice == 2 && computerChoice == 1 ||
                    playerChoice == 3 && computerChoice == 2) {
                System.out.println("You win!");
            } else if (playerChoice == computerChoice) {
                System.out.println("It's a draw.");
            } else {
                System.out.println("You lose.");
            }

            System.out.print("Would you like to play again (y/n)? ");
            playAgain = scan.next();
        }
    }
}
