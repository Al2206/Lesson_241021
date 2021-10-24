package HomeWork;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        int a , result;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число a:  ");
        a = in.nextInt();
        if (a<5)
            result = 10;
        else
            result = 20;
        System.out.printf(String.valueOf(result));
        }
}

