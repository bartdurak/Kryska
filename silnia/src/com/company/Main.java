package com.company;

public class Main {

    static long silnia(int n){
       long s=1;
        int i=1;
        while(i<=n)
        {
            s=s*i;
            i=i+1;
        }
        return s;
    }

    static long silnia2(int n)
    {
        if (n == 0) return 1;
        else return n* silnia2(n-1) ;
    }

    public static void main(String[] args) {
        System.out.println(silnia(5));
        System.out.println(silnia2(5));
    }
}
