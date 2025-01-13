package Module_3;

import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
//public class Lesson_4 {
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        String str_1 = scan.nextLine();
//        String str_2 = scan.nextLine();
//        String str_3 = scan.nextLine();
//        String[] arr = {str_1, str_2, str_3};
//        Arrays.sort(arr);
//        for (String el : arr) {
//            System.out.println(el);
//        }
//    }


//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int var = scan.nextInt();
//        if (var < 100000 || var > 999999) {
//            System.out.println("ERROR");
//            return;
//        }
//        int pre_half = 0;
//        int post_half = 0;
//        for (int i = 0; i < 6; i++) {
//            if (i < 3) {
//                post_half += var % 10;
//                var /= 10;
//            } else {
//                pre_half += var % 10;
//                var /= 10;
//            }
//        }
//        System.out.println(pre_half == post_half ? "YES" : "NO");
//    }

//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        float first = 0;
//        float second = 0;
//        for (int i = 0; i < 6; i++) {
//            if (i < 2) {
//                first += scan.nextInt();
//            } else {
//                second += scan.nextInt();
//            }
//        }
//        first /= 2;
//        second /= 4;
//        if (second == first) {
//            System.out.println("Draw");
//        } else {
//            System.out.println(first > second ? "First" : "Second");
//        }
//    }
//}


//String concat(String s) (аналог +) - слияние строк
//boolean equals(Object ob) - сравнение строк с учётом регистра
//boolean equalsIgnoreCase(String s) - сравнение строк без учёта регистра
//int compareTo(String s) - лексикографическое сравнение строк с учётом регистра
//int compareToIgnoreCase(String s) - лексикографическое сравнение строк без учёта регистра
//String substring(int n, int m) - срез с n до m не включительно
//String substring(int n) - срез c индекса n
//int length() - определение длины строки
//int indexOf(char ch) - поиск первого символа
//int indexOf(char ch, int n) - поиск первого символа с индекса n
//int lastIndexOf(char ch) - поиск последнего символа
//int lastIndexOf(char ch, int n) - поиск последнего символа с индекса n
//String toUpperCase()/toLowerCase
//String replace(char ch1, char ch2)/String replace(String str1, String str2)
//String trim() - удаление пробелов в начале и конце
//char charAt(int position) - возвращение символа по индексу
//boolean isEmpty()
//char[] getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin) - извлечение всех символов стрки в массиве символов
//String[] split(String regex)
//String[] split(String regex, int limit)
//


//public class Lesson_4 {
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        String all_string = "";
//        for (int i = 0; i < 3; i++) {
//            all_string += scan.nextLine();
//        }
//        boolean flag = false;
//        char search = ';';
//        String result = "";
//        for (int i = 0; i < all_string.length(); i++) {
//            if (! flag) {
//                char actual_symbol = all_string.charAt(i);
//                if (actual_symbol == search) {
//                    flag = true;
//                }
//            } else {
//                char actual_symbol = all_string.charAt(i);
//                if (actual_symbol == search) {
//                    flag = false;
//                } else {
//                    result += actual_symbol;
//                }
//            }
//        }
//        System.out.println(result);
//    }
//}

//public class Lesson_4 {
//
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        String str = scan.nextLine();
//        System.out.println(delCom(str));
//    }
//    public static String delCom(String email) {
//        if (email.matches("^.+\\.com$"))
//        {
//            return email.substring(0, email.length()-4);
//        } else {
//            return email;
//        }
//    }
//}
//
//public class Lesson_4 {
//    public static void main(String[] args) {
//        String text = "Егор Алла Александр";
//        Pattern pattern = Pattern.compile("А.+а");
//        Matcher matcher = pattern.matcher(text);
//        while (matcher.find()) {
//            System.out.println(text.substring(matcher.start(), matcher.end()));
//        }
//    }
//}

//public class Lesson_4 {
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        String str = scan.nextLine();
//        str = str.trim(); //удаляем пробелы в начале и в конце
//        String[] words = str.split(" +"); //формируем массив слов без пробелов
//        int imax = 0; //индекс слова макс длины
//        for (int i = 0; i < words.length; i++) { //перебираем слова в массиве строк
//            if (words[i].length() > words[imax].length()) {
//                imax = i;
//            }
//        }
//        System.out.println(words[imax]);
//    }
//}

//public class Lesson_4 {
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        String str = scan.nextLine();
//        String control_word = scan.nextLine();
//        str = str.trim(); //удаляем пробелы в начале и в конце
//        String[] all_words = str.split(" +"); //формируем массив слов без пробелов
//        String[] result_words = new String[all_words.length];
//        int count = 0;
//        for (int i = 0; i < all_words.length; i++) {
//            if (all_words[i].equals(control_word)) {
//                result_words[count] = all_words[i];
//                count++;
//            }
//        }
//        for (String el: result_words) {
//            if (el != null) {
//                System.out.printf("%s ", el);
//            }
//        }
//    }
//}





public class Lesson_4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String[] all_words = str.split(" +"); //формируем массив слов без пробелов
        for (String el: all_words) {
            System.out.printf(el.substring(0, 1).toUpperCase() + el.substring(1) + " ");
        }
    }
}




