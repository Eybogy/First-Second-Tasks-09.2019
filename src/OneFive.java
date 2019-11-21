import java.util.Scanner;
public class OneFive {
        static void equal() {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter the number:...");
            int x = in.nextInt();
            int y = in.nextInt();
            int z = in.nextInt();

            if (x == y && y == z) {
                System.out.println("Cреди введённых чисел три максимальных числа");
            } else if (x < y && y == z) {
                System.out.println("Cреди введённых чисел два максимальных числа");
            } else if (y < x && x == z) {
                System.out.println("Cреди введённых чисел два максимальных числа");
            } else if (z < x && x == y) {
                System.out.println("Cреди введённых чисел два максимальных числа");
            } else {
                System.out.println("Cреди введённых чисел одно максимальное число");
            }}}
