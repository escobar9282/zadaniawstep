package com.zadania_wstep1.Zadanie_003;

public class Main {
    public static void main(String[] args) {
        int[] metoda = new int[]{55, 61, 95, 8906, 170000};
        int i = 0, j = 0;
        while (i < metoda.length) {
            int min = i;
            j = i;
            while (j < metoda.length) {
                if (metoda[j] < metoda[min]) {
                    min = j;
                }
                j++;
            }
            int temporary = metoda[i];
            metoda[i] = metoda[min];
            metoda[min] = temporary;
            i++;
        }
        for (int n : metoda) {
            System.out.println(n);
        }
    }
    }
//    Napisz metodę, która zwraca posortowaną tablicę liczb.
//        mySort([4,1,9,15]) = [1,4,9,15]
