package com.company;

public class Main {
    void quicksort(int[] tablica, int x, int y)
    {
        int i,j,v,temp;
        i=x;
        j=y;
        v=tablica[(x+y)/2];
        do {
            while (tablica[i]<v)
                i++;

            while (v<tablica[j])
                j--;

            if (i<=j){
                temp=tablica[i];
                tablica[i]=tablica[j];
                tablica[j]=temp;
                i++; j--;
            }
        }
        while (i<=j);


        if (x<j) quicksort(tablica,x,j);
        if (i<y) quicksort(tablica,i,y);
    }
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 12, 11, 13, 5, 6, 7 };

        System.out.println("Tablica");
        printArray(arr);

        Main ob = new Main();
        ob.quicksort(arr, 0, arr.length - 1);

        System.out.println("\nTablica posortowana");
        printArray(arr);


    }
}
