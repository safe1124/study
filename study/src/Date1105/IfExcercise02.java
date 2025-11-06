package Date1105;

import java.util.Scanner;

public class IfExcercise02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("how much money do you have?");
        long money = scanner.nextLong();

        if (money >= 10000) {
            System.out.println("You are rich");
        } else {
            System.out.println("You are not rich");
        }

        scanner.close();
        }


    }