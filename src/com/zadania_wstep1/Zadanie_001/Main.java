package com.zadania_wstep1.Zadanie_001;
public class Main {
    public static void main(String[] args) {
        int[] tablica = new int[] { 2, 4, 7, 99, 77 };
        int[] wyjscie = new int[tablica.length];
        int licznik = tablica.length;

        for (int i=tablica.length-1 ; i >= 0; i--) {
            wyjscie[licznik-i-1] = tablica[i];
        }
        for (int n : wyjscie) {
            System.out.println(n);
        }
    }
}
//    Napisz metodę, która odwraca daną tablicę liczb całkowitych.
//        swap([1,2,3]) = [3,2,1]
