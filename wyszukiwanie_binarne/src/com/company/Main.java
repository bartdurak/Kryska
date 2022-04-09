package com.company;

public class Main {

    static int binarySearch2(int tab[], int l, int p, int y)
    {
        if (p >= l)
        {
            int srodek= (l + p)/2;
            if (tab[srodek] == y)  return srodek;
            if (tab[srodek] > y)
                return binarySearch2(tab, l, srodek-1, y);
            return binarySearch2(tab, srodek +1, p, y);
        }

        return -1;
    }

    static int binarySearch(int tab[], int l, int p, int y)
    {
        while (l <= p)
        {
            int srodek = (l + p)/2;
            if (tab [srodek ] == y)    return srodek;
            if (tab [srodek ] < y)
                l = srodek + 1;
            else
                p = srodek- 1;
        }

        return -1;
    }

    public static void main(String[] args) {
        int []dane={2, 4, 5, 7, 8, 9, 12, 12, 12, 12, 12};
        if(binarySearch(dane,0, dane.length-1, 12 )==-1)
            System.out.println("Szukanego elementu nie ma w tablicy");
        else
            System.out.println("Szukany element jest na pozycji "+binarySearch(dane,0, dane.length-1, 12 ));



     /*wyszukiwanie liniowe
        int i=0, indeks=-1;
        int y=12;

        while ((indeks==-1) && i< dane.length){
            if(dane[i]==y)
            {
                indeks=i;
            }
            i = i+1;
        }
        if(indeks!=-1)
            System.out.println("szukany element jest na pozycji "+indeks);
        else
            System.out.println("szukanego elementu nie ma w zbiorze ");

*/
    }
}
