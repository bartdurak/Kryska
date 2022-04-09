package com.company;

public class Main {

    public static void main(String[] args) {
        Queue q = new Queue(10);
        q.enqueue(6);
        q.enqueue(9);
        q.enqueue(26);
        q.enqueue(36);
        q.enqueue(16);

        System.out.println(q.peek());
        q.dequeue();
        System.out.println(q.peek());
        q.dequeue();
        q.enqueue(100);
        while(!q.empty())
        {
            System.out.println(q.peek());
            q.dequeue();
        }
    }
}
