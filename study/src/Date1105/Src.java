package Date1105;

import java.util.Scanner;

public class Src {
    public static void main(String[] args) {

        System.out.println("What is your code?");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();

        int price = 0; // 초기값 설정

        switch (age) {
            case 1:
                price = 10000;
                break;
            case 2:
                price = 15000;
                break;
            case 3:
                price = 2000;
                break;
            default:
                System.out.println("Invalid code entered.");
                scanner.close();
                return;
        }

        System.out.println("Your price is " + price);

        scanner.close();
    }
}
