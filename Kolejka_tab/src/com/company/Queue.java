package com.company;

public class Queue {

    int tab[];
    int f, r;

    Queue(int n)
    {
        tab=new int [n];
        f=-1;
        r=-1;
    }

   boolean empty( )
    {
        if(r==-1) return true;
        if(f>r){
            r=-1;
            f=-1;
            return true;
        }

        else return false;
    }
    void enqueue(int element)
    {
        if(r==-1)
        {
            r=0; f=0;
        }
        else
        {
            r=r+1;
        }
        tab[r]=element;
    }
    void dequeue()
    {
        f=f+1;
    }
    int peek()
    {
        return tab[f];
    }
}
