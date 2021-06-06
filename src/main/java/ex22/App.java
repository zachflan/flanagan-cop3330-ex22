/*
 *  UCF COP3330 Summer 2021 Assignment 22 Solution
 *  Copyright 2021 Zachary Flanagan
 */

package ex22;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        int largest = 0;

        Scanner num1 = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        String num1S = num1.nextLine();
        int num1I = Integer.parseInt(num1S);
        if(num1I > largest){
            largest = num1I;
        }

        Scanner num2 = new Scanner(System.in);
        System.out.print("Enter the second number: ");
        String num2S = num2.nextLine();
        int num2I = Integer.parseInt(num2S);
        if(num2I > largest){
            largest = num2I;
        }

        Scanner num3 = new Scanner(System.in);
        System.out.print("Enter the third number: ");
        String num3S = num3.nextLine();
        int num3I = Integer.parseInt(num3S);
        if(num3I > largest){
            largest = num3I;
        }

        System.out.format("The largest number is %d.", largest);
    }
}