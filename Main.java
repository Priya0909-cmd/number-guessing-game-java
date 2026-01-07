import java.util.*;

public class Main{
    static Scanner user = new Scanner(System.in);
    static Random random = new Random();
    public static void playGame(){
        int count = 0;
        final int Max_ATTEMPTS = 10;
        int computer = random.nextInt(101);
        int guess = 0;

        System.out.println("Guess a number between 1 and 100!!");
        System.out.println("You have a maximum of " + Max_ATTEMPTS + " attempts to guess the correct number.");

        while(guess != computer && count < Max_ATTEMPTS){
            System.out.print("Enter your guess : ");
            guess = user.nextInt();
            count++;
            if(guess > computer){
                System.out.println("Too High !!");
                System.out.println("You can try again :)");   
            }
            else if(guess < computer){
                System.out.println("Too low !!");
                System.out.println("You can try again :)");
            }
            else{
                System.out.println("Congratulations!!! You have guessed correctly ");
                System.out.println("You took " + count + " attempts to guess the number.");
            }
            System.out.println("Attempts left: " + (Max_ATTEMPTS - count));
            System.out.println(); 
        }
        if(count == Max_ATTEMPTS && guess != computer){
            System.out.println("Sorry, you've used all your attempts. The correct number was: " + computer);
        }
    }
    public static void main(String[] args){
        char choice;
        do{
            playGame();
            System.out.print("Do you want to play again? (y/n): ");
            choice = user.next().charAt(0);
            if(choice != 'y' && choice != 'Y'){
                System.out.println("Thank you for playing! Goodbye!");
            }
            System.out.println();
        }while(choice == 'y' || choice == 'Y');

        user.close();
    }
    
}