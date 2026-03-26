import java.util.Scanner;
public class ArmstrongMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        int temp = num;
        int count = 0;
        while (temp > 0) {
            count++;
            temp /= 10;
        }
        temp = num;
        int sum = 0;
        while (temp > 0) {
            int digit = temp % 10;
            int power = 1;
            for (int i = 1; i <= count; i++) {
                power *= digit;
            }
            sum += power;
            temp /= 10;
        }
        if (sum == num)
            System.out.println("Armstrong.java Number");
        else
            System.out.println("Not Armstrong.java Number");
    }
}