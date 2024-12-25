package Module_3;

import java.util.Random;
import java.util.Scanner;

//public class Lesson_1 {
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int number = scan.nextInt();
//        printDivider(number);
//    }
//
//    static int printDivider(int num) {
//        for (int i=1; i < num + 1; i++) {
//            if (num % i == 0) {
//                System.out.printf("%d ", i);
//            }
//        }
//        return 0;
//    }
//}


//public class Lesson_1 {
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int a = scan.nextInt();
//        int b = scan.nextInt();
//        int max = maxNumberDivider(a, b);
//        System.out.println(max);
//    }
//    static int maxNumberDivider(int a, int b) {
//        int number = 0;
//        int new_count;
//        int counter = 0;
//        for (int i = a; i < b + 1; i++) {
//             new_count = countDivider(i);
//             if (new_count > counter) {
//                 counter = new_count;
//                 number = i;
//             }
//        }
//        return number;
//    }
//    static int countDivider(int a) {
//        int counter = 0;
//        for (int i = 1; i < a + 1; i++) {
//            if (a % i == 0) {
//                counter += 1;
//            }
//        }
//        return counter;
//    }
//}


//public class Lesson_1 {
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int var = scan.nextInt();
//        if (var == 1) {
//            double var_1 = scan.nextDouble();
//            double result = square(var_1);
//            System.out.println(result);
//        } else {
//            double var_1 = scan.nextDouble();
//            double var_2 = scan.nextDouble();
//            double result = square(var_1, var_2);
//            System.out.println(result);
//        }
//
//    }
//
//    static double square(double a) {
//        return a * a;
//    }
//
//    static double square(double a, double b) {
//        return a * b;
//    }
//}


//public class Lesson_1 {
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int a = scan.nextInt();
//        int b = scan.nextInt();
//        int c = scan.nextInt();
//        double x = scan.nextDouble();
//        double y = scan.nextDouble();
//        double z = scan.nextDouble();
//        System.out.printf("%.2f %.2f\n", average(a, b), average(a, b, c));
//        System.out.printf("%.2f %.2f\n", average(x, y),average(x, y, z));
//    }
//
//    static double average(double a, double b) {
//        return (a + b) / 2.;
//    }
//
//    static double average(double a, double b, double c) {
//        return (a + b + c) / 3.;
//    }
//}


public class Lesson_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int rand_num = scan.nextInt();
        int[] arr = new int[size];
        int indMaxVar = 0;
        int MaxVar = -2147483648;
        int indNegVar = 0;
        int NegVar = 0;
        boolean flag = false;
        Random rand = new Random(rand_num);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(-5, 16);
            System.out.printf("%d ", arr[i]);
            if (arr[i] > MaxVar) {
                indMaxVar = i;
                MaxVar = arr[i];
            }
            if (arr[i] < 0) {
                flag = true;
                indNegVar = i;
                NegVar = arr[i];
            }
        }
        System.out.println();
        if (flag) {
            arr[indMaxVar] = NegVar;
            arr[indNegVar] = MaxVar;
            for (int el : arr) {
                System.out.printf("%d ", el);

            }
        } else {
            for (int el : arr) {
                System.out.printf("%d ", el);
            }

        }
    }
}
















