package com.company;

public class Main {

    static int fib(int n)
    {
        if(n==1 || n==2)
            return 1;
        else
        {
            return fib(n-1)+fib(n-2);
        }
    }//0(2^n)

    static int fib2(int n)
    {
        int []tab= new int[n+1];
        tab[0]=0;
        tab[1]=1;
        tab[2]=1;
        for(int i=3; i<=n; i++)
            tab[i]=tab[i-1]+tab[i-2];

        return tab[n];
    }//O(n)

    public static void main(String[] args) {
        System.out.println(fib2(60));
        System.out.println(fib(60));
    }
}
