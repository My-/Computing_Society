/*
Random number guesing game.
    Made by: Mindaugas Sarskus.
    Date: 17/09/2016.
*/
package Chapter_01;

import java.util.Random;
import java.util.Scanner;

public class Example_1_3_NumberGuessGame {

    public static void main(String[] args) {
        
        Random randomNumGenerator = new Random();
        Scanner input = new Scanner(System.in);
        
        int
                userGuess = 0,
                randomNum = 0;
        boolean
                playGame = true;
        
        while(playGame){
            
            randomNum = randomNumGenerator.nextInt(11);  // Or randomNum = (int) Math.random() *101
            
            do{
                System.out.print("Please take a guess: ");
                userGuess = input.nextInt();
                
                // Check user guess
                if(userGuess > randomNum){
                    System.out.println("\n\tYour guess is to big\n");
                }else if(userGuess < randomNum){
                    System.out.println("\n\tYour guess is to small\n");
                }
                
            }while(userGuess != randomNum);

            System.out.printf("\nYou are right!!\n\tNumber was: %d\n\n" ,randomNum);
            
            // Ask if user wants play again
            System.out.println("Do you want play again?\n\tpress 'y' to continue..");
            playGame = input.next().toLowerCase().trim().charAt(0) == 'y';
        }
    }
}
