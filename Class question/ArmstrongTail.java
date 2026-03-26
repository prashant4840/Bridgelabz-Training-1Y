import java.util.Scanner;
public class ArmstrongTail {
    static int armstrong(int n, int digits, int sum) {
        if (n == 0) return sum;
        int d = n % 10;
        return armstrong(n / 10, digits, sum + (int)Math.pow(d, digits));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        int digits = String.valueOf(num).length();
        int result = armstrong(num, digits, 0);
        System.out.println(result == num ? "Armstrong" : "Not Armstrong");
    }
}