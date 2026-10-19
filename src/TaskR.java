
import java.util.Scanner;

public class TaskR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();

        int count = 0;

        for (int x = 0; x <= 1000; x++) {
            int result = a * x * x * x + b * x * x + c * x + d;

            if (result == 0 && x != e) {
                count++;
            }
        }

        System.out.println(count);
    }
}
