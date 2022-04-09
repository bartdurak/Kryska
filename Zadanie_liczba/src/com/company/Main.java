package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {



        System.out.println("Ile liczb porownujemy?  ");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (int i = 2; ; i++) {
            if (n % i != 0) {
                System.out.println(i+" "+ (n - 1));
                break;
            }
        }
    }
}
