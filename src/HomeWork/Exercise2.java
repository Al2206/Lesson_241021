package HomeWork;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        int a ;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число:  ");
        a = in.nextInt();
        if (a % 2 == 0 )
            System.out.print(" Число чётное");
        else
            System.out.print(" Число нечётное");
    }
}