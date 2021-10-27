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
        switch (i) {
            case 1:
                x /= x ;
                System.out.println(" x /= x :" + x);
                break;
            case 2:
                x *= x;
                System.out.println(" x *= x :" + x);
                break;
            case 3:
                x = x * x - x;
                System.out.println("  x = x * x - x :" + x);
                break;
            default:
                System.out.println("Введено неверное значение ");
        }
    }
}
// вчера при таком условии не работало почему-то... Наверное где-то косякнул. А сегодня запустилось.
