package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Queue<Integer> q= new LinkedList<>();


        for (int i = 0; i < 5; i++)
            q.add(i);


        System.out.println("Elementy " + q);


        int rem = q.remove();
        System.out.println("usuwamy: "
                + rem);

        System.out.println(q);


        int head = q.peek();
        System.out.println("głowa: "+ head);


        int size = q.size();
        System.out.println("Ilosc elementów" + size);
    }
}
