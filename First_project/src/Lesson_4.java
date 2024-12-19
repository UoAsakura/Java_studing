public class Lesson_4 {
    public static void main(String[] args) {
        int my_age = 27;
        System.out.println(String.format("Мне уже %d!", my_age));

        int big = 1234567890;
        float f = big;
        System.out.printf("%.2f", f);

        //Пример overflow:
        short maxValue = 256;
        byte bb = (byte) maxValue;
        System.out.println(bb);

        //Примеры underflow:
        double d1 = 0.3333333333333333;
        // потеря чисел после точки начиная с 8 знака
        float f1 = (float) d1;
        System.out.println(f1);
        //Результат: 0.33333334

        float f3 = 3.64f;
        int i3 = (int) f3; // дробная часть отбрасывается
        System.out.println(i3);
        //Результат: 3

        char sim='9'; int k=sim;
        int var = 5/2;


//        int b=5/2;

//        int b=(int)(5/2.0);
//
//        int b=5/2.0;
//
//        double x=3.14; int k=x;
//
//        int b=(int)5/2.0;
//
//        double x=3.14; int k=(int)x;


    }
}
