package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Podaj wysokość, wymagania trenera oraz wielkość guza?  ");
        int k = s.nextInt();
        int w = s.nextInt();
        int m = s.nextInt();

        int k2=k;
        //Wersja I
        int ile=0;
        while(k<w)
        {
            k=k+m;
            ile++;
        }

        //Wesja II
        int ile2 =(w-k2)/m;   //20/10->2
        if((ile2*m+k2)<w)
            ile2++;
        System.out.println("wynikI =  "+ile+" wynik2= "+ile2);
    }
}
