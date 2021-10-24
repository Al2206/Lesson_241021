package HomeWork;

import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        double x;
        double result;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число:  ");
        x = in.nextInt();
        if (x < 0) {
            result = (x + x) / 2;
        } else
            result = (x * x) / (2 * x);
        System.out.println(result);
    }
}




