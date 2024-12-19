


public class Lesson_3 {
    public static void main(String[] args) {

        // арифметические операции
        int a=5;
        int b=3;
        double x=5.6;
        double y=3.2;
        double zero=0;
        System.out.println("a+b= "+(a+b)+" x+y= "+(x+y)); // a+b= 8 x+y= 8.8
        System.out.println("a-b= "+(a-b)+" x-y= "+(x-y)); // a-b= 2 x-y= 2.3999999999999995
        System.out.println("a*b= "+(a*b)+" x*y= "+(x*y)); // a*b= 15 x*y= 17.919999999999998
        System.out.println("a/b= "+(a/b)+" x/y= "+(x/y)); // a/b= 1 x/y= 1.7499999999999998
        System.out.println("a%b= "+(a%b)+" x%y= "+(x%y)); // a%b= 2 x%y= 2.3999999999999995
        System.out.println("a/b= "+(a/b)+" x/y= "+(x/zero)); // a/b= 1 x/y= Infinity
        System.out.println("a%b= "+(a%b)+" x%y= "+(x%zero)); // a%b= 2 x%y= NaN
        int k=5;
        System.out.println(k++); // Инкремент (с постсуффиксом)
        System.out.println(++k); // Декримент (с предсуффиксом)

        // Тернарная операция.
        int purechaseItem = 5;
        int bonus;
        bonus = purechaseItem > 3 ? 10 : 0 ; // Если purechaseItem больше 3, то 10, иначе 0.
        System.out.println("Скидка = "+bonus);

        a += 10; // a = a + 10;

        // Логические операции.
        // & - И
        // | - ИЛИ
        // ^ - Исключающее ИЛИ
        // || - Укороченное ИЛИ
        // && -  Укороченное И
        // ! - НЕ
    }
}