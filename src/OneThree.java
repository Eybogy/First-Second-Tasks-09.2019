import java.util.Scanner;
public class OneThree {
        public void equal(){
            Scanner in = new Scanner(System.in);
            System.out.println("Enter the number:...");
            int x = in.nextInt();
            int y = in.nextInt();
            int z = in.nextInt();
            if (x == y || x == z || y == z){
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }}}