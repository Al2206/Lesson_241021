package HomeWork;

public class Exercise4 {
    public static void main(String[] args) {
        int j = 0, a = 15,  b = 5;
        for (int i = 1; i <= 10; i++) {
            if ((a + b) % i == 0) {
                j = 1;
            } else {
                j = 2;
            }
            switch (j) {
                case 1: {
                    System.out.println((a + b) + "/" + i + "  Делится без остатка ");
                    break;
                }
                case 2: {
                    System.out.println(" Делится  на " + i + " с остатком  "  + (a + b) % i);
                    break;
                }
            }
        }
    }
}
