import java.util.Scanner;
public class OneSix {
        static void equal(){
            Scanner in = new Scanner(System.in);
            System.out.println("Enter the number:...");
            double x = in.nextDouble();
            if (x > 1) {
                System.out.println("Расстояние от числа Х до отрезка равно");
                System.out.println(x-1);
            } else if (x < 0) {
                System.out.println("Расстояние от числа Х до отрезка равно");
                System.out.println(Math.abs(x));
            } else if (x>=0 && x<=1) {
                System.out.println("Ввидённое вами число лежит на данном отрезке");
            }
        }
}
