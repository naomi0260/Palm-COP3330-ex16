package ex16;

import java.util.Scanner;

/*
Example Output
What is your age? 15
You are not old enough to legally drive.
Or

What is your age? 35
You are old enough to legally drive.
Constraints
Use a single output statement.
Use a ternary operator to write this program. If your language doesn’t support a ternary operator,
use a regular if/else statement, and still use a single output statement to display the message.
 */


public class App {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args){

        System.out.print("What is your age? ");
        int age = input.nextInt();

        if (age >= 16){
            System.out.print("You are old enough to legally drive.");
            return;
        }else{
            System.out.print("You are not old enough to legally drive.");
        }

    }
}
