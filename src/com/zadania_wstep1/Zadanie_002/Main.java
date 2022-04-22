package com.zadania_wstep1.Zadanie_002;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[5];
        for (int i=0;i <5;i++){
            array[i] =12;
        }
        for (int n : array){
            System.out.println(n);
        }
    }
}
//    Co z tym kodem jest nie tak?
//        int[] array = new int[5];
//        for (int i=0;i <=5;i++){
//        array[i] =12;
//        }