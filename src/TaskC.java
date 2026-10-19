import java.util.Scanner;

public class TaskC{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        for (int i = a; i <= b; i++) {
            int k = (int) Math.sqrt(i);

            if (k * k == i) {
                System.out.print(i + " ");
            }
        }
    }
}
