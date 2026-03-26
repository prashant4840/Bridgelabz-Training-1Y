public class ArmstrongRecursion {
    static int countDigits(int n) {
        if (n == 0) return 0;
        return 1 + countDigits(n / 10);
    }
    static int armstrong(int n, int digits) {
        if (n == 0) return 0;
        int d = n % 10;
        return (int)Math.pow(d, digits) + armstrong(n / 10, digits);
    }
    public static void main(String[] args) {

        int num = 153;
        int digits = countDigits(num);
        int result = armstrong(num, digits);
        if (result == num)
            System.out.println("Armstrong.java");
        else
            System.out.println("Not Armstrong.java");
    }
}