package Date1105;

import java.util.Scanner;

public class SankouEnzansi {
    public static void main(String[] args) {
        System.out.println("how old are you?");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        String status = (age >=18) ? "otona" : "miseinenn";

        System.out.println(status);

        sc.close();
            }
}
