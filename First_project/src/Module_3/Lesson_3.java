package Module_3;

import java.util.Random;
import java.util.Scanner;

//public class Lesson_3 {
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int[] ar = new int[scan.nextInt()];
//        long seed = scan.nextLong();
//        init(ar, seed);
//        print(ar);
//        int ind = findMax(ar);
//        System.out.println(ind);
//
//    }
//
//    public static void init(int[] mas, long rand_var) {
//        Random rand = new Random(rand_var);
//        for (int i = 0; i < mas.length; i++) {
//            mas[i] = rand.nextInt(-3, 6);
//        }
//    }
//
//    public static void print(int[] mas) {
//        for (int el : mas) {
//            System.out.printf("%d ", el);
//        }
//
//    }
//
//    public static int findMax(int[] mas) {
//        int max_var = -4;
//        int ind_max_var = 0;
//        for (int i = 0; i < mas.length; i++) {
//            if (mas[i] > max_var) {
//                max_var = mas[i];
//                ind_max_var = i;
//            }
//        }
//        System.out.println();
//        return ind_max_var;
//
//    }
//
//}


//public class Lesson_3 {
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int[][] mas = new int[scan.nextInt()][scan.nextInt()];
//        long seed = scan.nextLong();
//        initArray(mas, seed);
//        printArray(mas);
//        System.out.println();
//        printMaxIndex(mas);
//    }
//    public static void initArray(int [][] mas, long rand_var) {
//        Random rand = new Random(rand_var);
//        for (int i = 0; i < mas.length; i++) {
//            for (int j = 0; j < mas[0].length; j++) {
//                mas[i][j] = rand.nextInt(0, 11);
//            }
//        }
//
//    }
//    public static void printArray(int [][] arr) {
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[0].length; j++) {
//                System.out.printf("%d\t", arr[i][j]);
//            }
//            System.out.println();
//        }
//    }
//    public static void printMaxIndex(int [][] arr) {
//        for (int[] el:arr) {
//            findMax(el);
//        }
//
//    }
//    public static void findMax(int[] mas) {
//        int max_var = -1;
//        int ind_max_var = 0;
//        for (int i = 0; i < mas.length; i++) {
//            if (mas[i] > max_var) {
//                max_var = mas[i];
//                ind_max_var = i;
//            }
//        }
//        System.out.printf("%d ", ind_max_var);
//
//
//    }
//}


//public class Lesson_3 {
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int[] ar = new int[scan.nextInt()];
//        long seed = scan.nextLong();
//        init(ar, seed);
//        print(ar);
//        int[] b = reduceAfterMax(ar);
//        print(b);
//
//    }
//
//    public static void init(int[] mas, long rand_var) {
//        Random rand = new Random(rand_var);
//        for (int i = 0; i < mas.length; i++) {
//            mas[i] = rand.nextInt(-3, 6);
//        }
//    }
//
//    public static void print(int[] mas) {
//        for (int el : mas) {
//            System.out.printf("%d ", el);
//        }
//
//    }
//
//    public static int findMax(int[] mas) {
//        int max_var = -4;
//        int ind_max_var = 0;
//        for (int i = 0; i < mas.length; i++) {
//            if (mas[i] > max_var) {
//                max_var = mas[i];
//                ind_max_var = i;
//            }
//        }
//        System.out.println();
//        return ind_max_var + 1;
//
//    }
//    public static int[] reduceAfterMax(int [] arr) {
//        int finish = findMax(arr);
//        int[] new_arr = new int[finish];
//        System.arraycopy(arr, 0, new_arr, 0, finish);
//        return new_arr;
//    }
//
//}

public class Lesson_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] mas = new int[scan.nextInt()][scan.nextInt()];
        long seed = scan.nextLong();
        int ind = scan.nextInt();
        initArray(mas, seed);
        printArray(mas);
        System.out.println();
        mas = deleteRow(mas, ind);
        printArray(mas);
    }
    public static void initArray(int [][] mas, long rand_var) {
        Random rand = new Random(rand_var);
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[0].length; j++) {
                mas[i][j] = rand.nextInt(0, 11);
            }
        }

    }
    public static void printArray(int [][] arr) {
        for (int[] ints : arr) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.printf("%d\t", ints[j]);
            }
            System.out.println();
        }
    }

    public static int[][] deleteRow(int[][] mas, int strDel) {
        if (strDel > mas.length) {
            int[][] new_mas = new int[mas.length][mas[0].length];
            for (int i = 0; i < mas.length - 1; i++) {
                for (int j = 0; j < mas[0].length; j++) {
                    new_mas[i][j] = mas[i][j];
                }
            }
            return new_mas;
        } else {
            int[][] new_mas = new int[mas.length - 1][mas[0].length];
            for (int i = 0; i < mas.length - 1; i++) {
                for (int j = 0; j < mas[0].length; j++) {
                    if (i >= strDel) {
                        new_mas[i][j] = mas[i + 1][j];
                    } else {
                        new_mas[i][j] = mas[i][j];
                    }
                }
            }
            return new_mas;
        }

    }
}