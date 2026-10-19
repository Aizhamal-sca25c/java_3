import java.util.Scanner;

public class TaskXtransform {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int decimal = 0;
        int power = 1;

        while (x > 0) {
            int digit = x % 10;
            decimal += digit * power;
            power *= 2;
            x /= 10;
        }

        System.out.println(decimal);
    }
}
