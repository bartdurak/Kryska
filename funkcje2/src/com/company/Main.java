package com.company;

public class Main {

    static int suma(int a, int b)
    {
        int s=a+b;
        return s;
    }


    static void suma2(int a, int b)
    {
        int s=a+b;
        System.out.println("suma ="+s);
    }

   static void  wypisywanie(String tekst, int n)  //rozwiązanie iteracyjne
   {
       for(int i=0; i<n; i++)
           System.out.println(tekst);

   }
   //rozwiazanie rekurecyjne
    static void  wypisywanie2(String tekst, int n)
    {
        if(n>0)
        {
            System.out.println(tekst);
            wypisywanie2(tekst, n-1);
        }

    }


    public static void main(String[] args) {

       /* int wynik= suma(56, 123);
        System.out.println(wynik);
        for(int i=1; i<20; i++)
            System.out.println(suma(i, 41-i));

       wynik= suma2(4, 234);*/

        wypisywanie("Algorytmy ", 8);
        System.out.println("\n\nwersja rekurencyjna\n");
        wypisywanie2("Algorytmy ", 8);
    }
}
