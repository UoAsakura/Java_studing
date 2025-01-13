package Module_3;

import java.util.Scanner;

//public class Lesson_5 {
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        StringBuilder sb1 = new StringBuilder("test");
//        StringBuilder sb2 = new StringBuilder(); //по умолчанию емкость 16
//        StringBuilder sb3 = new StringBuilder(50); //емкость 50
//        StringBuilder sb4 = new StringBuilder(sb1); //на основе другого StringBuilder
//
//        String str = sb1.toString(); //преобразование в строку
//        StringBuilder sb5 = new StringBuilder(str); //преобразование в StringBuilder
//
//        StringBuilder sb1 = new StringBuilder("test");
//        System.out.println(sb1.capacity()); // выводит 20
//        System.out.println(sb1.length()); //выводит 4
//
//        StringBuilder sb2 = new StringBuilder(); //по умолчанию емкость 16
//        System.out.println(sb2.capacity()); //выводит 16
//        sb2.ensureCapacity(32);
//        System.out.println(sb2.capacity()); //выводит 34
//
//        StringBuilder sb1 = new StringBuilder("test");
//        sb1.setLength(20);
//        System.out.println(sb1);
//
//        StringBuilder s1 = new StringBuilder("Java");
//        StringBuilder s2 = new StringBuilder("Java");
//        System.out.println( s1 == s2); //false, т.к. разные ссылочные переменные
//        System.out.println(s1.equals(s2)); //тоже false, т.к. метод equals()
//        //также сравнивает ссылочные переменные
//        s2 = s1; //ссылки теперь одинаковые
//        System.out.println(s1 == s2); //true
//        System.out.println(s1.equals(s2)); //true
//
//        StringBuilder s1 = new StringBuilder("Java");
//        StringBuilder s2 = new StringBuilder("Java");
//        System.out.println(s1.toString().contentEquals(s2)); //true
//    }
//}


//public class Lesson_5 {
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        String str = scan.nextLine();
//        str = str.trim();
//        String[] all_words = str.split(" +");
//        StringBuilder result = new StringBuilder(all_words[0]);
//        for (int i = 1; i < all_words.length; i++) {
//            for (int j = 1; j < all_words.length; j++) {
//                if ( result.charAt(result.length()-1) == all_words[j].charAt(0) ) {
//                    result.append(" ").append(all_words[j]);
//                    break;
//                }
//            }
//        }
//        System.out.println(result);
//    }
//}


public class Lesson_5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
//        String[] all_words = str.split("");
        int counter = 0;
        boolean flag = false;
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) - '0' > -1 && str.charAt(i) - '0' < 10) {
                flag = true;
                result.append(str.charAt(i)).append("+");
                counter += Character.getNumericValue(str.charAt(i));
            }
        }
        if (! flag) {
            System.out.println("ERROR");
        } else {
            System.out.println(result.substring(0, result.length() - 1) + "=" + counter);
        }
    }
}


























