package HomeWork;

import java.util.Scanner;
public class Exercise6 {
    public static void main(String[] args) {
        int a ;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите вухзначное число:  ");
        a = in.nextInt();
        int b = 0;
        while ( a > 0) {
            b = b + a % 10;
            a = a / 10;
        }
        if (b % 2 == 0 )
            b = b + 2;
        else
            b = b - 2;
        System.out.println(b);
    }

}
