package HomeWork;

import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        int a ;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите ваш рост:  ");
        a = in.nextInt();
        if (a  >= 180 )
            System.out.print(" ВЫСОКИЙ");
        else
            System.out.print(" НЕ ОЧЕНЬ ВЫСОКИЙ");
    }
}
