package Date1105;

import java.util.Scanner;

public class SankouEnzansiref {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("年齢を入力してください: ");
        int age = sc.nextInt();   // 여기서 age로 선언해야 함!

        String status = (age >= 18) ? "otona" : "miseinenn";
        System.out.println(status);

        sc.close();
    }
}
