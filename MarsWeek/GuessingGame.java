import java.util.Scanner;
import java.util.Random;

public class GuessingGame {     
    public static void mainM(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Hello! What's your name?");
        String userName=scan.nextLine();
        scan.close();
        
        // create an instance of the Random object
        Random rand = new Random();

        // call method nextInt and pass in upper range bound
        int number = rand.nextInt(100);
        System.out.println(userName+ ", I'm thinking of a number between 1 and 100. Try to guess my number.");
        int guess=checknumber(userName,number, 1, 100);
    }
    public static int guessnumber(int start,int end) {
        Random rand = new Random();
        int guess = rand.nextInt(end-start)+start;
        return guess;
    }
    public static int checknumber(String userName, int number, int start, int end) {
        int guess=guessnumber(start, end);
        int count=1;
        while (number!=guess) {
            if (guess<number){
                System.out.println("Your guess?" +guess);
                System.out.println("Your guess is too low, try again.");
                start=guess;
                guess=guessnumber(start, end);
                count++;                
            }
            if (guess>number){
                System.out.println("Your guess?" +guess);
                System.out.println("Your guess is too high, try again.");
                end=guess;
                guess=guessnumber(start, end);
                count++;
            }
            if (guess!=(int)guess){
            System.out.println("That's not an integer, try again");
            }   
        }
        
        System.out.println("Well done, "+userName+"! You found my number in "+count+" tries.");
        
        return guess;
    }   
}