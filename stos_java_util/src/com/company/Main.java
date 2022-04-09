package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        for(int i = 0; i < 5; i++)
        {
            stack.push(i);
        }

        Integer pos = (Integer) stack.search(4);

        if(pos == -1)
            System.out.println("Elementu nie znaleziono");
        else
            System.out.println("Element na pozycji: " + pos);
        for(int i = 0; i < 5; i++)
        {
            Integer element = (Integer) stack.peek();
            System.out.println("Element: " + element);
            Integer y = (Integer) stack.pop();
            System.out.println("Usuwam: " +y);
        }
    }
}
