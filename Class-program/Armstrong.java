import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int sum = 0, temp = num;
        while (temp > 0) {
            int n = temp % 10;
            sum += n * n * n;
            temp /= 10;
        }
        System.out.println(sum == num ? "Armstrong" : "Not Armstrong");
    }
}
