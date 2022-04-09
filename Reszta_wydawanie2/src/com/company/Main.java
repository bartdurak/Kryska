package com.company;
import java.awt.*;
import java.io.*;


    public class Main {

        public static void main(String arg[]) throws IOException {
            float Monety[] = {5.0f, 2.0f, 1.0f, 0.50f, 0.20f, 0.10f, 0.05f, 0.02f, 0.01f};
            float R, W = 0f;
            int i = 0;
            String s;

            System.out.print("Podaj reszte ");
            System.out.println(" do wydania: ");


            InputStreamReader we = new InputStreamReader(System.in);

            BufferedReader br = new BufferedReader(we);
            s = br.readLine();
            Float f = Float.valueOf(s);
            R = f.floatValue();

            System.out.println("Wydaj monety: ");
            while (R - W > 0.0f) {
                if (W + Monety[i] <= R) {
                    W = W + Monety[i];
                    System.out.println(Monety[i] + "  ");
                } else i++;
            }
        }
    }




