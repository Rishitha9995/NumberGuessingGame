import java.util.Random;
import java.util.Scanner;
public class NumberGuessingGame {
    public static void main(String[] args){
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("WELCOME TO NUMBER GUESSING GAME!");
        System.out.println("Max attempts in each round is 5");
        int RoundNumber = 0,playerGuess =0,randomNumber,score = 0;
        while(true) {
            int tryCount = 0;
            RoundNumber++;
            System.out.println("ROUND "+RoundNumber);
            randomNumber = rand.nextInt(100)+1;
            for (int i = 1; i <= 5; i++) {
                System.out.print("Enter your guess (1-100):");
                playerGuess = sc.nextInt();
                tryCount++;
                if (playerGuess == randomNumber) {
                    System.out.println("CORRECT! YOU WIN!");
                    System.out.println("It took you " + tryCount + " tries");
                    score += (6-tryCount);
                    break;
                }
                else if (playerGuess < randomNumber) {
                    System.out.println("Nope! The number is higher.");
                }
                else {
                    System.out.println("Nope! The number is lower.");
                }
            }
            if(playerGuess != randomNumber) {
                System.out.println("The Number to be guessed is "+randomNumber);
                System.out.println("YOU LOST!");
            }
            System.out.print("Do you want to play again (yes or no):");
            String res = sc.next();
            if(res.equalsIgnoreCase("no")){
                System.out.println("Thanks for playing! Your Total Score is: "+score);
                break;
            }
        }
    }
}
