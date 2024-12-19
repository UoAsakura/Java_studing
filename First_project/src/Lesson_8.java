import java.util.Scanner;

//public class Lesson_8 {
//    public static void main(String[] args) {
//        int var = new Scanner(System.in).nextInt();
//        for (int i=var; i > 0; i--){
//            for (int j=i; j>0; j--) {
//                System.out.printf("%d", i);
//            };
//            System.out.println();
//        };
//    }
//}


import java.util.Scanner;

//class Lesson_8 {
//    public static void main(String[] args) {
//        // put your code here
//        Scanner scan = new Scanner(System.in);
//        int height = scan.nextInt();
//        int width = scan.nextInt();
//        if (width<1 || height<1) {
//            System.out.println("ERROR");
//            return;
//        };
//        for (int i=0; i < height; i++) {
//            for (int j=0; width > j; j++) {
//                if (i==0 || i==height-1) {
//                    System.out.printf("*");
//                } else if (j==0 || j==width-1) {
//                    System.out.printf("*");
//                } else {
//                    System.out.print(" ");
//                };
//            };
//            System.out.println();
//        };
//
//    };
//};


//class Lesson_8 {
//    public static void main(String[] args) {
//        // put your code here
//        Scanner scan = new Scanner(System.in);
//        int height = scan.nextInt();
//        int tmp = 0;
//        if (height < 1) {
//            System.out.println("ERROR");
//            return;
//        }
//        if (height%2==0){
//            tmp = height / 2;
//        } else {
//            tmp = height / 2 + 1;
//        };
//        ;
//        for (int i = 0; i < tmp; i++) {
//            for (int j = 0; j < height; j++) {
//                if (i <= j && height - i > j) {
//                    System.out.printf("*");
//                }else if (height-i == j)
//                {
//                    break;
////                    System.out.printf("#");
//                } else {
//                    System.out.printf(" ");
//                };
//
//            }
//            ;
//            System.out.println();
//        }
//        ;
//    }
//
//    ;
//};

public class Lesson_8 {
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        int var = scan.nextInt();
        for (int i=1; i<var+1; i++) {
            System.out.printf("%d\t", i);
            for (int j=2; j<var+1; j++) {
                System.out.printf("%d\t", i*j);
            }
            System.out.println();
        };
    }
}









