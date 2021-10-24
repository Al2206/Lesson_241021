package HomeWork;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        int a, b, c, d;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число a:  ");
        System.out.println("Введите число b:  ");
        a = in.nextInt();
        b = in.nextInt();
        c = a * b;
        if (c < 0)
            d = c * -2;
        else
            d = c * 3;
        System.out.println(d);
    }
}
