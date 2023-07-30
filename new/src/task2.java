import java.util.Random;
import java.util.Scanner;
//a computer that plays the higher-lower number guessing game with you.
public class task2 {
    public static void main(String[] args) {
        System.out.println("Think of a whole number between 1 and 100. I'll guess what it is!");
        Scanner read = new Scanner(System.in);
        String myAnswer = "";
        Random rand =  new Random();

        int guess = 0;
        int max = 100;
        int min = 1;

        do {
            guess = rand.nextInt(max - min + 1) + min;
            System.out.println("My guess is: " + guess);
            System.out.println("Please type yes if I got it right.");
            System.out.println("Please type higher if your number is greater than: " + guess + ".");
            System.out.println("Please type lower if your number is less than: " + guess + ".");
            myAnswer = read.next();

            if(myAnswer.equals("higher")) {
                min = guess + 1;
            }
            else if(myAnswer.equals("lower")) {
                max = guess - 1;
            }
        }while(!myAnswer.equals("yes"));

        read.close();
        System.out.println("That's Right");

    }
}
