package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello");
        int num = 55;
        Scanner scanner = new Scanner(System.in);
        int num2 = scanner.nextInt();
        int num3 = num + num2 ;
        System.out.println("Num3 = " + num3);
        if ( num3 < 10) {
            System.out.println("Da");}
            else {
                System.out.println("Net");
            }
        }
    }

