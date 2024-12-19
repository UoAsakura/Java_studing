import java.util.Scanner;


//public class Lesson_6 {
//    public static void main(String[] args) {
//        long income;
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Введите годовой доход в копейках: ");
//        income = scan.nextLong();
//        double tax;
//        if (income / 100 <= 5e6) {
//            tax = income * 0.13;
//        } else {
//            tax = income * 0.15;
//        }
//        long taxLong = (long) Math.ceil(tax);
//        System.out.println("Налог = " + taxLong / 100 + " руб. " + taxLong % 100 + " коп.");
//    }
//}


//public class Lesson_6{
//    public static void main(String[] args) {
//        int number;
//        Scanner scan = new Scanner(System.in);
//        number = scan.nextInt();
//        switch (number) {
//            case 1:
//            System.out.println("Понедельник");
//                break;
//            case 2:
//                System.out.println("Вторник");
//                break;
//            case 3:
//                System.out.println("Среда");
//                break;
//            case 4:
//                System.out.println("Четверг");
//                break;
//            default:
//                System.out.println("Неверный номер дня недели");
//        }
//    }
//}


//public class Lesson_6 {
//    public static void main(String[] args) {
//        float num_1;
//        float num_2;
//        float num_3;
//        float num_4;
//        double d_1;
//        double d_2;
//        Scanner scan = new Scanner(System.in);
//        num_1 = scan.nextFloat();
//        num_2 = scan.nextFloat();
//        num_3 = scan.nextFloat();
//        num_4 = scan.nextFloat();
//        d_1 = Math.sqrt( (Math.pow(num_1, 2) + Math.pow(num_2, 2) ) );
//        d_2 = Math.sqrt( (Math.pow(num_3, 2) + Math.pow(num_4, 2) ) );
//        if (d_1 > d_2){
//            System.out.println("Первая точка ближе");
//        }else if (d_1 < d_2){
//            System.out.println("Вторая точка ближе");
//        }else {
//            System.out.println("Точки на равных расстояниях");
//        }
//    }
//}


//public class Lesson_6 {
//    public static void main(String[] args) {
//        int var;
//        int result;
//        Scanner scan = new Scanner(System.in);
//        if(){}
//        System.out.print("%d", result);
//    }
//}

//public class Lesson_6 {
//    public static void main(String[] args) {
//        int invest;
//        double procent;
//        Scanner scan = new Scanner(System.in);
//        invest = scan.nextInt();
//        if (invest >= 10_000){
//            procent = 5.;
//        } else if (invest >= 1000){
//            procent = 3.;
//        } else {procent = 2.;}
//        int pay = (int) (invest * (1 + procent / 100.));
//        System.out.println("К выдаче: " + pay + "р.\nПод " + procent + "%");
//    }
//}


//public class Lesson_6 {
//    public static void main(String[] args) {
//        int one, two, three, four, five;
//        double max = 1.0 / 0.0;
//        Scanner scan = new Scanner(System.in);
//        one = scan.nextInt();
//        two = scan.nextInt();
//        three = scan.nextInt();
//        four = scan.nextInt();
//        five = scan.nextInt();
//        if (one < max){
//            max = one;}
//        if (two < max) {
//            max = two;}
//        if (three < max) {
//            max = three;}
//        if (four < max) {
//            max = four;}
//        if (five < max) {
//            max = five;
//        }
//        System.out.println((int) max);
//    }
//}


//public class Lesson_6 {
//    public static void main(String[] args) {
//        int hours;
//        double tarif;
//        double result = 0.;
//        Scanner scan = new Scanner(System.in);
//        hours = scan.nextInt();
//        tarif = scan.nextDouble();
//        if (hours < 0 || tarif < 0){
//            System.out.println("ERROR");
//            return;
//        }
//        if (hours > 40){
//            result = (hours - 40) * (tarif * 2);
//            hours = 40;
//        }
//        if (hours > 20){
//            result += (hours - 20) * (tarif * 1.5);
//            hours = 20;
//        }
//        if (hours > 0) {
//            result += hours * tarif;
//        }
//
//        System.out.printf("%.2f", result);
//
//    }
//}


//public class Lesson_6 {
//    public static void main(String[] args) {
//        int a_to_b, b_to_c, height;
//        double total_fuel = 0.;
//        double fuel_tank = 300.;
//        Scanner scan = new Scanner(System.in);
//        a_to_b = scan.nextInt();
//        b_to_c = scan.nextInt();
//        height = scan.nextInt();
//        if (height > 2000 || height < 1){
//            System.out.println("ERROR");
//            return;
//        }
//        if (height > 1500){
//            fuel_tank -= (9 * a_to_b);
//        } else if (height > 1000) {
//            fuel_tank -= (7 * a_to_b);
//        } else if (height > 500) {
//            fuel_tank -= (4 * a_to_b);
//        } else  {
//            fuel_tank -= (double) 1 * a_to_b;
//        }
//        if (fuel_tank < 0){
//            System.out.println("ERROR");
//            return;
//        }
//        total_fuel = fuel_tank;
//        fuel_tank = 300.;
//        if (height > 1500){
//            fuel_tank -= (9 * b_to_c);
//        } else if (height > 1000) {
//            fuel_tank -= (7 * b_to_c);
//        } else if (height > 500) {
//            fuel_tank -= (4 * b_to_c);
//        } else  {
//            fuel_tank -= (double) 1 * b_to_c;
//        }
//        if (fuel_tank < 0){
//            System.out.println("ERROR");
//            return;
//        }
//        double total = 300 - fuel_tank - total_fuel;
//        if (total < 0){
//            System.out.printf("%.2f", 0.);
//        } else {
//            System.out.printf("%.2f", total);
//        }
//    }
//}


//public class Lesson_6 {
//    public static void main(String[] args) {
//        String name_month;
//        String result = "a";
//        Boolean flag = true;
//        Scanner scan = new Scanner(System.in);
//        name_month = scan.next();
//        switch (name_month) {
//            case "Понедельник": result="Monday"; break;
//            case "понедельник": result="Monday"; break;
//            case "Вторник": result="Tuesday"; break;
//            case "вторник": result="Tuesday"; break;
//            case "Среда": result="Wednesday"; break;
//            case "среда": result="Wednesday"; break;
//            case "Четверг": result="Thursday"; break;
//            case "четверг": result="Thursday"; break;
//            case "Пятница": result="Friday"; break;
//            case "пятница": result="Friday"; break;
//            case "Суббота": result="Saturday"; break;
//            case "суббота": result="Saturday"; break;
//            case "Воскресенье": result="Sunday"; break;
//            case "воскресенье": result="Sunday"; break;
//            default:
//                System.out.println("ERROR");
//                flag = false;}
//        if (flag){
//            System.out.println(result);
//
//
//        }
//    }
//}

//
//public class Lesson_6 {
//    public static void main(String[] args) {
//        int number;
//        String work_day = "Working day";
//        String saturday = "Saturday";
//        String sunday = "Sunday";
//        Scanner scan = new Scanner(System.in);
//        number = scan.nextInt();
//        switch (number) {
//            case 1: System.out.println(work_day); break;
//            case 2: System.out.println(work_day); break;
//            case 3: System.out.println(work_day); break;
//            case 4: System.out.println(work_day); break;
//            case 5: System.out.println(work_day); break;
//            case 6: System.out.println(saturday); break;
//            case 7: System.out.println(sunday); break;
//            default:
//                System.out.println("ERROR");
//        }
//    }
//}