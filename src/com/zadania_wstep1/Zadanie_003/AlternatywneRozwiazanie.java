package com.zadania_wstep1.Zadanie_003;

public class AlternatywneRozwiazanie {
    public static void main(String[] args) {
        int[] board = new int[]{7901, 67, -2412, -246, 980, 742};
        for (int n : sort(board)) {
            System.out.println(n);
        }
    }
    public static int[] sort(int[] board) {
        int i = 0, j = 0;
        while (i < board.length) {
            int min = i;
            j = i;
            while (j < board.length) {
                if (board[j] < board[min]) {
                    min = j;
                }
                j++;
            }
            int temporary = board[i];
            board[i] = board[min];
            board[min] = temporary;
            i++;
        }   return board;
    }
}
