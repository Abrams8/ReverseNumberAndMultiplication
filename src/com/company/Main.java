package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите число: ");
        int number = in.nextInt();
        int result = 1;

        Integer newNumber = number;
        StringBuilder builder = new StringBuilder(newNumber.toString());
        builder.reverse();
        int reverseNumber = Integer.parseInt(builder.toString());
        System.out.println(reverseNumber);

        while (reverseNumber!=0) {
            int ostatok = reverseNumber%10;
            result = ostatok * result;
            reverseNumber = reverseNumber/10;
            System.out.print(ostatok);
            if(reverseNumber!=0) {
                System.out.print(" * ");
            }
        }
        System.out.print(" = " + result);

    }
}
