import java.util.Scanner;
public class OneSeven {
        public void equal() {
            Scanner in = new Scanner(System.in);
            System.out.println("Ведите номер простого числа");
            int a = in.nextInt();
            int c = 0;
            int v = 0;
            for (int j=2;  ; j++) {
                for (int i=2; i<=j; i++) {
                    if (j%i==0) {
                        c++;
                    }}
                if (c==1) {
                    v++;
                }
                c=0;
                if (v==a) {
                    System.out.println(j);
                    break;
                }}}}