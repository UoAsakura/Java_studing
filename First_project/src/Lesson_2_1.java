public class Lesson_2_1 {
    static int five=5; // Глобальая переменная.
    public static void main(String[] args) {
        {
            int x = 12; // Локальная переменная.
            System.out.println(x);
        }
        System.out.println(ten);
        double ten=10.00; // Переобъявляем переменную.
        for (int i = 1; i <= 3; i++) {
            System.out.println(ten);
        }
    }
    static int ten=10; // Глобальая переменная.
}