package Module_3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lesson_2 {
    public static void main(String[] args) {
//        Объявление двумерного массива
//        int[][] mas = {{1, 2, 3}, {4, 5, 6}};
//        int[][] mas = new int[3][4];
//        int[][] mas = new int[3][];
//        int mas[][] = new int[3][4];
        Scanner scan = new Scanner(System.in);
        int str = scan.nextInt();
        int column = scan.nextInt();
        int[][] array = new int[str][column];

        String[] result = new String[str];
        Random rand = new Random(scan.nextLong());
        for (int i = 0; i < array.length; i++) {
            boolean flag = true;
            for (int j = 0; j < array[i].length; j++) {
                int var = rand.nextInt(-10, 11);
                array[i][j] = var;
                System.out.printf(var + "\t");
                if (flag && var < 0) {
                    result[i] = String.valueOf(j);
                    flag = false;
                }
            }
            if (flag) {
                result[i] = "NO";
            }
            System.out.println();
        }

        for (String el : result) {
            System.out.printf("%s\n", el);
        }
    }
}
