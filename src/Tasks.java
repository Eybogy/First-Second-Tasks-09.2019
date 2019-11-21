import java.util.Scanner;
public class Tasks {
    public static void main(String[] args){
        OneThree a = new OneThree();
        OneFour b = new OneFour();
        OneFive c = new OneFive();
        OneSix d = new OneSix();
        OneSeven e = new OneSeven();
        TwoSeven f = new TwoSeven();
        TwoEight g = new TwoEight();
        TwoNine h = new TwoNine();
        TwoEleven i = new TwoEleven();
        System.out.println("1 - Проверить задание 1" + "\n" + "2 - Проверить задание 2");
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        if (x==1){
            System.out.println("3 - Проверить задание 3" + "\n" + "4 - Проверить задание 4" + "\n" + "5 - Проверить задание 5" + "\n" + "6 - Проверить задание 6" + "\n" + "7 - Проверить задание 7");
            int y = in.nextInt();
            if (y==3){ a.equal(); }
            else if (y==4){b.equal(); }
            else if (y==5){c.equal(); }
            else if (y==6){d.equal(); }
            else if (y==7){e.equal(); }
        } else if (x==2){
            System.out.println("7 - Проверить задание 7" + "\n" + "8 - Проверить задание 8" + "\n" + "9 - Проверить задание 9" + "\n" + "11 - Проверить задание 11");
            int y = in.nextInt();
            if (y==7){ f.equal(); }
            else if (y==8){g.equal(); }
            else if (y==9){h.equal(); }
            else if (y==11){i.equal(); }
        }}}
