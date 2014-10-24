/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.seniorproject.factorial;

import java.util.Scanner;

/**
 *
 * @author RainWhileLoop
 */
public class MyFactorial {

    public MyFactorial() {
        System.out.println("Factorial Program");
        System.out.print("Please input number : ");
        int numb = new Scanner(System.in).nextInt();
        int result = factorial(numb);
        System.out.print(numb + "! = ");
        for (int i = numb; i > 0; i--) {
            System.out.print(i);
            if (i != 1) {
                System.out.print(" * ");
            } else {
                System.out.println("");
            }
        }
        System.out.println(numb + "! = " + result);
    }

    private int factorial(int number) {
        if (number > 0) {
            return number * factorial(number - 1);
        } else if (number == 0) {
            return 1;
        } else {
            System.err.println("Error : Factorial cannot input negative number");
            System.exit(0);
        }
        return 0;
    }

    public static void main(String[] args) {
        new MyFactorial();
    }

}
