import java.util.Scanner;

//public class Lesson_7 {
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        final int N = 5;
//        int mark;
//        double average = 0;
//        int kol = 0;
//        while (kol < N) {
//            mark = scan.nextInt();
//            average += mark;
//            kol++;
//        }
//        average /= N;
//        System.out.printf("%.1f", average);
//    }
//}


//class Main {
//    public static void main(String[] args) {
//        // put your code here
//        Scanner scan = new Scanner(System.in);
//        final int bad = 4;
//        int number;
//        int count = 0;
//        int counter = 10;
//        while (counter != 0) {
//            number = scan.nextInt();
//            if (number < bad){
//                count ++;
//            };
//            counter --;
//        };
//        System.out.printf("%d", count);
//    }
//}




import java.util.Scanner;

//class Lesson_7  {
//    public static void main(String[] args) {
//        // put your code here
//        Scanner scan = new Scanner(System.in);
//        int start, stop;
//        int number_1 = scan.nextInt();
//        int number_2 = scan.nextInt();
//        if (number_1 < number_2) {
//            start = number_1; stop = number_2;
//        } else {start = number_2; stop = number_1;
//        }
//        double result = 0.;
//        result = start;
//        while (start < stop ) {
//            start ++;
//            result *= start ;
//        };
//        System.out.printf("%f\n", result);
//
//    }
//}


//class Lesson_7{
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int next_var;
//        int diff_var;
//        diff_var = scan.nextInt();
//        int counter = 0;
//        do {
//            next_var = scan.nextInt();
//            if (diff_var % next_var == 0 && next_var > 0){
//                counter += 1;
//            }
//        } while (next_var > 0);
//        System.out.println(counter);
//
//    }
//}


//class Lesson_7{
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int counter_cif = 0;
//        int counter_sum = 0;
//        int number = Math.abs(scan.nextInt());
//        do{
//            counter_sum += number % 10;
//            number /= 10;
//            counter_cif += 1;
//        }
//        while (number > 0);
//        System.out.printf("%d %d", counter_cif, counter_sum);
//
//    }
//}


//public class Lesson_7 {
//    public Lesson_7() {
//    }
//
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int grade, k = 0, sum = 0;
//        float sred;
//        grade = scan.nextInt();
//        while (grade >= 0) {
//            sum += grade;
//            k++;
//            grade = scan.nextInt();
//        }
//        if (k > 0) {
//            sred = (float) sum / k;
//            System.out.printf("%.1f", sred);
//        } else {
//            System.out.println("No data");
//        }
//    }
//}








