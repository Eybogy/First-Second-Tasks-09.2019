import java.util.Scanner;
public class TwoSeven {
        static void equal(){
            Scanner in = new Scanner(System.in);
            System.out.println("Enter the numbers:...");
            int x = in.nextInt();
            System.out.println("x = " + x);
            int y = in.nextInt();
            System.out.println("y = " + y);
            x = x + y;
            y = y -x;
            y = -y;
            x = x - y;
            System.out.println("x = " + x);
            System.out.println("y = " + y);
        }
    }
