import java.util.Scanner;
public class TwoEleven {
        static void equal() {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter the number:...");
            double a = in.nextInt();
            double b = in.nextInt();
            double c = in.nextInt();
            double D = b * b - 4 * a * c;
            if (D > 0) {
                double x1, x2;
                x1 = (-b - Math.sqrt(D)) / (2 * a);
                x2 = (-b + Math.sqrt(D)) / (2 * a);
                System.out.println("Первый корень равен: " + x1);
                System.out.println("Второй корень равен: " + x2);
            } else if (D < 0) {
                System.out.println("Дискриминант меньше 0");
            } else if (D == 0) {
                double x = -b / (2 * a);
                System.out.println(x);
            }}}

