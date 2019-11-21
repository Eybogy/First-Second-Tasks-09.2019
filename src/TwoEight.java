import java.util.Scanner;
public class TwoEight {
        static void equal(){
            Scanner in = new Scanner(System.in);
            System.out.println("Enter the number:...");
            int x = in.nextInt();
            int y = in.nextInt();
            int z = in.nextInt();

            if (x == y && y == z) {
                System.out.println(x);
            } else if (x>y && y==z) {
                System.out.println(y);
            } else if (y>x && x==z) {
                System.out.println(x);
            } else if (z>x && x==y) {
                System.out.println(x);
            } else if (x>y && y>z){
                System.out.println(y);
            } else if (x>z && z>y){
                System.out.println(z);
            } else if (y>x && x>z){
                System.out.println(x);
            } else if (y>z && z>x){
                System.out.println(z);
            } else if (z>y && y>x){
                System.out.println(y);
            } else if (z>x && x>y){
                System.out.println(x);
            } else if (x<y && y==z) {
                System.out.println(x);
            } else if (y<x && x==z) {
                System.out.println(y);
            } else if (z<x && x==y) {
                System.out.println(z);
            } else {
                System.out.println("NO");
            }}}