package HomeWork;

public class Exercise9 {
    public static void main(String[] args) {
        int[] numbers = {9, 12, 82, 5, 33, 6};
        int min = numbers[0];
        for ( int n : numbers ){
            min = min < n ? min : n;
        }
        System.out.println("min = " + min);
    }
}
