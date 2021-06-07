package ex16;

import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Naomi Palm
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
