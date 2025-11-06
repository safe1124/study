package Date1106;
import java.util.Scanner;
public class Scanner05 {
    public static void main(String[] args) {
        System.out.println("input number");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        if (num % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }
}
