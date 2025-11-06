package Date1105;

import java.util.Scanner;

public class IfExcercise02_ref {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How much money do you have? "); // 먼저 물어보기
        long kane = scanner.nextLong(); // long에 맞춰 nextLong 사용

        if (kane >= 10000) {
            System.out.println("You are rich");
        } else {
            System.out.println("You are not rich");
        }

        scanner.close();
    }
}
