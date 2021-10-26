package HomeWork;

import java.util.Scanner;
public class Exercise11 {
    public static void main(String[] args) {
        double x;
        double result1;
        double result2;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число:  ");
        x = in.nextInt();
        if (x % 2 == 0) {
            result2 = x * x;
            System.out.println(result2);
        }
            else {
            result1 = (x + (x % 2));
            System.out.println(result1);
        }
    }
}
