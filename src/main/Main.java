/*
 *@author Janvi Pangoriya
 *Version 1.0
 * */
package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int a = obj.nextInt();
        if (a % 2 == 0)
            System.out.println("even");
        else
            System.out.println("odd");
    }
    }