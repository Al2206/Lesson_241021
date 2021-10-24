package HomeWork;

import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        int x;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число:  ");
        x = in.nextInt();
        int i = 0;
        switch (1) {
            case 1:
                i = x / x;
                System.out.println(i);
            break;
        }
        switch (2) {
            case 2:
                i = x * x;
                System.out.println(i);
                break;
        }
        switch (1) {
            case 1:
                i = x * x - x;
                System.out.println(i);
                break;
        }

    }
}
