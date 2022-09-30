package JavaPractice.NumbersAndExpressions;

public class IncrementPostAndPrefix {
    public static void main(String[] args) {
        int a = 5;
        int b= 3;
        int c = a * b++;

        int a1 = 5;
        int b1 = 3;
        int c1 = a1 * ++b1;
        System.out.println(c);
        System.out.println(c1);
    }
}
