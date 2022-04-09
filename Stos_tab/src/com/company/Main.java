package com.company;

public class Main {

    int tab[]=new int [1000];
    int t;
    void stack_init( )
    {
        t=-1;
    }

    boolean is_empty( )
    {
        if(t==-1)
            return true;
        else return false;
    }
    void push(int elem)
    {
        t++;
        tab[t]=elem;
    }
    void pop()
    {
        t--;
    }
    int top()
    {
        if(t>-1)
            return tab[t];
        else
            return 0;
    }
    static void pisz(int liczba, String tekst)
    {
        System.out.println(liczba+tekst);
    }

    public static void main(String[] args) {
        pisz(36, "tekst");
        Main stos = new Main();
       // stos.pisz(34, "ala ma kota");
        stos.stack_init();
        stos.push(24);
        stos.push(46);
        for (int i=20; i<70; i=i+5)
            stos.push(i);

        //System.out.println(stos.top());
        while(!stos.is_empty())
        {
            System.out.println(stos.top());
            stos.pop();
        }

        stos.pisz(34, "ala ma kota");


    }
}
