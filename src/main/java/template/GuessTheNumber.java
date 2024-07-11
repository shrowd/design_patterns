package template;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber extends Game {

    private int generatedNumber;
    private int shotsLeft;
    private int userInput;
    private boolean isGameFinished;
    private Scanner scanner;


    @Override
    public void onEnd() {
        if (isGameFinished) {
            if (generatedNumber == userInput) {
                System.out.println("You won!!!");
            } else {
                System.out.println("You lost! The drawn number was: " + generatedNumber);
            }
            System.out.println("---------------------------------");
        }
    }

    @Override
    public void paintScreen() {
        if (shotsLeft > 0 && !isGameFinished) {
            System.out.println("Number of remaining shots: " + shotsLeft);

            if (userInput < generatedNumber) {
                System.out.println("The guessed number is greater than: " + userInput);
            } else if (userInput > generatedNumber) {
                System.out.println("The guessed number is smaller than " + userInput);
            }
        }
    }

    @Override
    public void makeMoves() {
        userInput = scanner.nextInt();

        if (userInput == generatedNumber) {
            isGameFinished = true;
        } else {
            shotsLeft--;

            if (shotsLeft == 0) {
                isGameFinished = true;
            }
        }
    }

    @Override
    public void initialize() {
        scanner = new Scanner(System.in);
        Random random = new Random();

        shotsLeft = 5;
        generatedNumber = random.nextInt(30) + 1;
        isGameFinished = false;

        System.out.println("---------------------------------");
        System.out.println("The game has started! Choose a number between 1 and 30.");
        System.out.println("Number of your shots: " + shotsLeft);
    }

    @Override
    public boolean gameOver() {
        return isGameFinished;
    }
}
