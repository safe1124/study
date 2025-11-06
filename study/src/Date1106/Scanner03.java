package Date1106;

import java.util.Scanner;

public class Scanner03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("input food name");
        String food = input.nextLine();

        System.out.println("input price of food");
        int price = input.nextInt();

        System.out.println("input quantity");
        int quantity = input.nextInt();

        int totalPrice = price * quantity;
        System.out.println("total price is " + totalPrice);

        input.close();
    }
}
