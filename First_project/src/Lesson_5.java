//public class Lesson_5 {
//    public static void main(String[] args) {
//        System.out.println("Hello!");
//        int var = 15;
//        String usingLiteral = "foreach";
//        System.out.println("var + var="+(var+var));
//        System.out.printf("i=%d\n",  var);
//
//        double item = 3.5453;
//        System.out.printf("item=%.2f", item);
//    }
//}


//Task_1

//class Main {
//    public static void main(String[] args) {
//        String name = "Андрей";
//        int age = 23;
//        double discount = 15.5;
//        // put your code here
//        System.out.printf("С Днем Рождения, %s!\n", name);
//        System.out.printf("Сегодня Вам %d!\n", age);
//        System.out.printf("По этому поводу Вам скидка %.1f", discount);
//        System.out.println("%");
//        System.out.print("на весь ассортимент нашего сайта!");
//    }
//}




//import java.util.Scanner;
//
//class Lesson_5 {
//    public static void main(String[] args) {
//        // Инициализиуем переменную типа Scanner присваивая её имя scan.
//        // После через оператор присваивания запрашиваем ввод с клавиатуры.
//        Scanner scan = new Scanner(System.in);
//        // Объявляем переменную строковаго типа.
//        System.out.println("Введите ваше имя: ");
//        String name;
//        // Присваиваем её ввод с строки до переноса строки. *next() - до первого пробельного символа.
//        name=scan.nextLine();
//        System.out.println("Пирвет, "+name+"!");
//        System.out.println("Сколько вам лет?");
//
//        // Заранее проверяем следующий ввод строки, возможно ли
//        // её преобразования к классу int
//        if(scan.hasNextInt()){
//            // Объявляем переменную типа int и записываем в
//            // неё результат сканированя входного потока.
//            int age;
//            age=scan.nextInt();
//            System.out.println(age+" - это ваш возраст!");
//        }else{
//            System.out.println("Неверный формат данных");
//        }
//    }
//}


//Task_2

//import java.util.Scanner;
//
//class Task_2{
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int var_1;
//        int var_2;
//        var_1=scan.nextInt();
//        var_2=scan.nextInt();
//        System.out.println(var_1+var_2);
//    }
//}


// Task_3

//import java.util.Scanner;
//
//class Task_3{
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        String name;
//        int age;
//        double discount;
//        name=scan.nextLine();
//        age=scan.nextInt();
//        discount=scan.nextDouble();
//        System.out.println("С днем рождения, "+name+"! Сегодня Вам "+age+"!");
//        System.out.println("По этому поводу дарим Вам скидку "+discount+"%");
//        System.out.println("на весь ассортимент нашего сайта!");
//
//    }
//}

//
//import java.util.Locale;
//import java.util.Scanner;
//
//class Lesson_5{
//    public static void main(String[] args) {
//        // Инициализация метода, для возможности вводить дробные числа с точкой.
//        // Инициализация строго до создания сканера.
//        Locale.setDefault(Locale.US);
//        Scanner scanner = new Scanner(System.in);
//        double number_1 = scanner.nextDouble();
//        double number_2 = scanner.nextDouble();
//        // Пример импользования тернарного оператора.
//        System.out.println(number_1 > number_2 ? number_1:number_2);
//    }
//}


// Tsak_4

//import java.util.Scanner;
//
//class Taks_4 {
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int rubs = scan.nextInt();
//        int kop = scan.nextInt();
//        if(kop > 100){
//            rubs += (int)(kop / 100);
//            kop = kop % 100;
//        }
//        System.out.println(rubs+" р. "+kop+" к.");
//    }
//}


// Task_5

//import java.util.Scanner;
//
//class Task_5{
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int salary_1 = scan.nextInt();
//        int salary_2 = scan.nextInt();
//        int salary_3 = scan.nextInt();
//        int min_salary = salary_1 < salary_2 ? salary_1:salary_2;
//        min_salary = min_salary < salary_3 ? min_salary:salary_3;
//        int max_saalry = salary_1 > salary_2 ? salary_1:salary_2;
//        max_saalry = max_saalry > salary_3 ? max_saalry:salary_3;
//        System.out.println(max_saalry - min_salary);
//    }
//}


// Taks_6

//import java.util.Scanner;
//
//class Taks_6{
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int all_time = scan.nextInt();
//        int hours; int minuts; int seconds;
//        hours = (int) (all_time / 3600);
//        minuts = (int)((all_time - (hours * 3600)) / 60);
//        seconds = all_time % 60;
//        System.out.println(hours+" часов "+minuts+" минут "+seconds+" секунд");
//    }
//}


// Taks_7

//import java.util.Scanner;
//
//class Taks_7{
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int rubs = scan.nextInt();
//        int kop = scan.nextInt();
//        int discount = scan.nextInt();
//        float total = rubs * 100 + kop;
//        int result = (int)(total - (int)(total / 100 * discount));
//        rubs = result / 100;
//        kop = result % 100;
//        System.out.printf("%02d руб. %02d коп.", rubs, kop);
//    }
//}


// Taks_8

//import java.util.Scanner;
//
//import static java.lang.Math.*;
//
//class Task_8{
//
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        double x = scan.nextDouble();
//        double result = (float) log(x + 7 *sqrt(pow(x, 4)+ PI));
//        System.out.printf("%.4f", result);
//
//    }
//}


// Taks_9

import java.util.Scanner;
import static java.lang.Math.*;

class Taks_9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double var = scan.nextDouble();
        double res_1 = 2 * pow(sin(3*PI-(2*var)), 2)*pow(cos(5*PI + 2*var), 2);
        double res_2 = 0.25 - 0.25 * sin(((double)5/2 * PI)-(8 * var));
        System.out.printf("%.5f %.5f", res_1, res_2);
    }
}
































