import java.util.Scanner;

public class HCF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        int a = sc.nextInt();
        int b = sc.nextInt();

        // Find HCF using Euclidean Algorithm
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        // Output
        System.out.println(a);

        sc.close();
    }
}
