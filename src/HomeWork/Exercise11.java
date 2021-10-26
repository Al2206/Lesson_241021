package HomeWork;

import java.util.Scanner;
public class Exercise10 {
    public static void main(String[] args) {
        int x, i;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число:  ");
        System.out.println("Введите номер оператора  от 1 до 3:  ");
        x = in.nextInt();
        i = in.nextInt();
        if  (i == 1) {
          x /= x ;
        } else  if (i == 2) {
            x *= x;
        } else if (i == 3) {
            x = x * x - x;
        } else  if ( i > 3) {
            System.out.println("Введено неверное значение ");
        }
        switch (i) {
            case 1:
                System.out.println(x);
                break;
            case 2:
                System.out.println(x);
                break;
            case 3:
                System.out.println(x);
                break;
            default:
        }
    }
}
